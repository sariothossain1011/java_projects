class Appliance {
    private String brand;
    private String type;
    private int powerWatts;
    private double hoursUsed;

    public Appliance(String type, String brand, int powerWatts, double hoursUsed) {
        this.type = type;
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.hoursUsed = hoursUsed;
    }

    public double calculateEnergyConsumption() {
        return (powerWatts * hoursUsed) / 1000.0;  // kWh
    }

    public void displayUsage() {
        System.out.println("Appliance Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Power Rating: " + powerWatts + " W");
        System.out.println("Usage Duration: " + hoursUsed + " hours");
        System.out.printf("Energy Consumed: %.2f kWh\n", calculateEnergyConsumption());
        System.out.println("-----------------------------------");
    }
}

public class AppliancePowerUsageTracker05 {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[3];

        appliances[0] = new Appliance("Fan", "Panasonic", 75, 120);
        appliances[1] = new Appliance("Air Conditioner", "LG", 2000, 50);
        appliances[2] = new Appliance("Refrigerator", "Samsung", 150, 240);

        System.out.println("--- Appliance Power Usage Report ---");
        for (Appliance a : appliances) {
            a.displayUsage();
        }
    }
}
