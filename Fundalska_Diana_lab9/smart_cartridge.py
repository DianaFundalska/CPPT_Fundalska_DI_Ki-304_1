# smart_cartridge.py
from cartridge import Cartridge

class SmartCartridge(Cartridge):
    def __init__(self, caliber, cartridge_type, enhanced_targeting=False):
        super().__init__(caliber, cartridge_type)
        self.enhanced_targeting = enhanced_targeting
        self.usage_count = 0  # Додаємо лічильник використання

    def activate_targeting(self):
        if self.enhanced_targeting:
            print(f"Активовано розширене прицілювання для {self.caliber}!")
        else:
            print("Розширене прицілювання недоступне.")

    def track_usage(self):
        self.usage_count += 1
        print(f"Патрон використано {self.usage_count} разів.")

    def self_destruct(self):
        print("Патрон самознищується!")

    def adapt_to_environment(self, temperature, humidity):
        print(f"Патрон адаптовано до умов: температура {temperature}°C, вологість {humidity}%.")

    def display_info(self):
        super().display_info()
        print("Розширене прицілювання:", "Так" if self.enhanced_targeting else "Ні")
        print("Кількість використань:", self.usage_count)

