public class CarRental {
    private String renterName;
    private String vehicleModel;
    private int numberOfDays;
    private double dailyRate = 50.0;

    public CarRental() {
        this.renterName = "Unknown";
        this.vehicleModel = "Standard";
        this.numberOfDays = 1;
    }

    public CarRental(String renterName, String vehicleModel, int numberOfDays) {
        this.renterName = renterName;
        this.vehicleModel = vehicleModel;
        this.numberOfDays = numberOfDays;
    }

    public double calculateTotalCost() {
        return numberOfDays * dailyRate;
    }

    public String getRenterName() { return renterName; }
    public String getVehicleModel() { return vehicleModel; }
    public int getNumberOfDays() { return numberOfDays; }
    public void setRenterName(String renterName) { this.renterName = renterName; }
    public void setVehicleModel(String vehicleModel) { this.vehicleModel = vehicleModel; }
    public void setNumberOfDays(int numberOfDays) { this.numberOfDays = numberOfDays; }
}
