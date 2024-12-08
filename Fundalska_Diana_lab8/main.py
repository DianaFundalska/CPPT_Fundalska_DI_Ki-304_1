import os
import struct
import math
import sys

def writeResTxt(fName, result):
    with open(fName, 'w') as f:
        f.write(str(result))

def readResTxt(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'r') as f:
                result = float(f.read()) 
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def writeResBin(fName, result):
    with open(fName, 'wb') as f:
        f.write(struct.pack('f', result)) 

def readResBin(fName):
    result = 0.0
    try:
        if os.path.exists(fName):
            with open(fName, 'rb') as f:
                result = struct.unpack('f', f.read())[0]
        else:
            raise FileNotFoundError(f"File {fName} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def calculate(x):
    if x == 0:
        raise ValueError("x cannot be 0 to avoid division by zero.")
    return math.tan(2 * x) / 1 

if __name__ == "__main__":
    try:
        data = float(input("Enter data: "))
        result = calculate(data)
        print(f"Result in Python is: {result}")

        writeResTxt("./textRes.txt", result)
        writeResBin("./binRes.bin", result)

        print("Result in txt is: {0}".format(readResTxt("./textRes.txt")))
        print("Result in bin is: {0}".format(readResBin("./binRes.bin")))

    except ValueError as e:
        print(e)
        sys.exit(1)
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)
