package unidad4;

public class SmartDevice {
    private String model, brand;
    private int batteryLevel;

    public SmartDevice(String model, String brand, int batteryLevel) {
        this.model = model;
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    // Getters and setters
    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }
}

class SmartPhone extends SmartDevice {
    private String phoneNumber;

    public SmartPhone(String model, String brand, int batteryLevel, String phoneNumber) {
        super(model, brand, batteryLevel);
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}

class SmartWatch extends SmartDevice {
    private boolean isWaterproof;

    public SmartWatch(String model, String brand, int batteryLevel, boolean isWaterproof) {
        super(model, brand, batteryLevel);
        this.isWaterproof = isWaterproof;
    }

    // Getter and setter
    public boolean isWaterproof() { return isWaterproof; }
    public void setWaterproof(boolean isWaterproof) { this.isWaterproof = isWaterproof; }
}

class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("iPhone 12", "Apple", 80, "123456789");
        SmartWatch watch = new SmartWatch("Galaxy Watch 3", "Samsung", 60, true);

        System.out.println("Phone: " + phone.getModel() + " " + phone.getBrand() + ", battery level: " + phone.getBatteryLevel() + ", phone number: " + phone.getPhoneNumber());
        System.out.println("Watch: " + watch.getModel() + " " + watch.getBrand() + ", battery level: " + watch.getBatteryLevel() + ", waterproof: " + watch.isWaterproof());
    }
}
