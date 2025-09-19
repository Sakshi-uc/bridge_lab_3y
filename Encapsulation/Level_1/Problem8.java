public class Problem8 {
    public static void main(String[] args) {
        RideVehicle[] rideList = new RideVehicle[] {
            new CarRide("V1","Raju",12),
            new BikeRide("V2","Siva",6),
            new AutoRide("V3","Kiran",8)
        };
        double travelDistance = 10; // km
        for (RideVehicle ride : rideList) {
            System.out.println(ride.getVehicleDetails());
            System.out.println("Fare for " + travelDistance + " km: " + ride.calculateFare(travelDistance));
            System.out.println("----");
        }
    }
}

abstract class RideVehicle {
    private String rideId;
    private String riderName;
    private double fareRatePerKm;

    public RideVehicle(String id, String driver, double rate) { 
        this.rideId = id; 
        this.riderName = driver; 
        this.fareRatePerKm = rate; 
    }

    public String getRideId(){ return rideId; }
    public String getRiderName(){ return riderName; }
    protected double getFareRatePerKm(){ return fareRatePerKm; }

    public String getVehicleDetails(){ 
        return rideId + " driven by " + riderName + " @ " + fareRatePerKm + "/km"; 
    }

    public abstract double calculateFare(double travelDistance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class CarRide extends RideVehicle implements GPS {
    private String currentLocation = "Unknown";
    public CarRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double travelDistance){ return getFareRatePerKm() * travelDistance + 20; } // base fee
    @Override public String getCurrentLocation(){ return currentLocation; }
    @Override public void updateLocation(String newLocation){ currentLocation = newLocation; }
}

class BikeRide extends RideVehicle implements GPS {
    private String currentLocation = "Unknown";
    public BikeRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double travelDistance){ return getFareRatePerKm() * travelDistance; }
    @Override public String getCurrentLocation(){ return currentLocation; }
    @Override public void updateLocation(String newLocation){ currentLocation = newLocation; }
}

class AutoRide extends RideVehicle implements GPS {
    private String currentLocation = "Unknown";
    public AutoRide(String id,String driver,double rate){ super(id,driver,rate); }
    @Override
    public double calculateFare(double travelDistance){ return getFareRatePerKm() * travelDistance + 10; }
    @Override public String getCurrentLocation(){ return currentLocation; }
    @Override public void updateLocation(String newLocation){ currentLocation = newLocation; }
}
