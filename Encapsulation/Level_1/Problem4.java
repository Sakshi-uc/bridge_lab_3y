public class Problem3{
    public static void main(String[] args){
        Vehicle[] vehicles=new Vehicle[]{
            new Car("KA-01-1234",2000),
            new Bike("KA-02-2222",500),
            new Truck("KA-03-3333",5000)
        };
        int days=3;
        for(Vehicle v:vehicles){
            System.out.println(v.getVehicleNumber()+"("+v.getType()+")");
            System.out.println("Rental for "+days+" days:"+v.calculateRentalCost(days));
            if(v instanceof Insurable) System.out.println(((Insurable)v).getInsuranceDetails()+",Insurance:"+((Insurable)v).calculateInsurance());
            System.out.println("----");
        }
    }
}
abstract class Vehicle{
    private String vNo;
    private String vKind;
    private double ratePerDay;
    public Vehicle(String num,String kind,double rate){this.vNo=num;this.vKind=kind;this.ratePerDay=rate;}
    public String getVehicleNumber(){return vNo;}
    public String getType(){return vKind;}
    protected double getRentalRate(){return ratePerDay;}
    public abstract double calculateRentalCost(int days);
}
interface Insurable{double calculateInsurance();String getInsuranceDetails();}
class Car extends Vehicle implements Insurable{
    private String polId="CAR-POL-123";
    public Car(String num,double rate){super(num,"Car",rate);}
    @Override public double calculateRentalCost(int days){return getRentalRate()*days;}
    @Override public double calculateInsurance(){return 300;}
    @Override public String getInsuranceDetails(){return "CarPolicy:"+polId;}
}
class Bike extends Vehicle{
    public Bike(String num,double rate){super(num,"Bike",rate);}
    @Override public double calculateRentalCost(int days){return getRentalRate()*days*0.8;}
}
class Truck extends Vehicle implements Insurable{
    private String polId="TRK-POL-789";
    public Truck(String num,double rate){super(num,"Truck",rate);}
    @Override public double calculateRentalCost(int days){return getRentalRate()*days*1.5;}
    @Override public double calculateInsurance(){return 1000;}
    @Override public String getInsuranceDetails(){return "TruckPolicy:"+polId;}
}
