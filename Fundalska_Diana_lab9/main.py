from smart_cartridge import SmartCartridge

def main():
    my_cartridge = SmartCartridge("5.56 мм", "Наведений", True)

    my_cartridge.display_info()
    my_cartridge.activate_targeting() 

    my_cartridge.set_caliber("7.62 мм")
    my_cartridge.set_type("Стандартний")
    my_cartridge.enhanced_targeting = False  

    print("\nНова інформація про патрон:")
    my_cartridge.display_info()  

    my_cartridge.activate_targeting()  

    my_cartridge.track_usage() 
    my_cartridge.adapt_to_environment(23, 60) 
    my_cartridge.self_destruct()  

if __name__ == "__main__":
    main()
