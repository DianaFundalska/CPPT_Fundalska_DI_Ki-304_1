# cartridge.py
class Cartridge:
    def __init__(self, caliber="", cartridge_type=""):
        self.caliber = caliber
        self.cartridge_type = cartridge_type

    def set_caliber(self, caliber):
        self.caliber = caliber

    def set_type(self, cartridge_type):
        self.cartridge_type = cartridge_type

    def get_caliber(self):
        return self.caliber

    def get_type(self):
        return self.cartridge_type

    def display_info(self):
        print("Калібр:", self.caliber)
        print("Тип патрона:", self.cartridge_type)
