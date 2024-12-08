import sys

rows_num = int(input("Enter the size of the matrix: "))
if rows_num <= 0:
    print("Matrix size must be a positive integer.")
    sys.exit(1)

filler = input("Enter the symbol: ").strip()
if len(filler) == 0:
    print("No filler symbol provided.")
    sys.exit(1)
elif len(filler) > 1:
    print("Too many symbols provided.")
    sys.exit(1)


matrix = []
for i in range(rows_num):
    row = []
    for j in range(i + 1):  
        if j <= i and (i + j) < rows_num:
            if j <= i -1 and (i + j) < rows_num - 1:
                row.append('+')
            else:
                row.append(filler)
            

    matrix.append(row)

with open("MyFile.txt", "w") as fout:
    for row in matrix:
        print(" ".join(row))
        fout.write(" ".join(row) + "\n")

