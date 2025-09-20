public class UnitConverter {
    public static double kmToMiles(double kilometers) { return kilometers * 0.621371; }
    public static double milesToKm(double miles) { return miles * 1.60934; }
    public static double metersToFeet(double meters) { return meters * 3.28084; }
    public static double feetToMeters(double feet) { return feet * 0.3048; }
    public static double yardsToFeet(double yards) { return yards * 3; }
    public static double feetToYards(double feet) { return feet * 0.333333; }
    public static double metersToInches(double meters) { return meters * 39.3701; }
    public static double inchesToMeters(double inches) { return inches * 0.0254; }
    public static double inchesToCm(double inches) { return inches * 2.54; }
    public static double fahrenheitToCelsius(double fahrenheit) { return (fahrenheit - 32) * 5 / 9; }
    public static double celsiusToFahrenheit(double celsius) { return (celsius * 9 / 5) + 32; }
    public static double poundsToKg(double pounds) { return pounds * 0.453592; }
    public static double kgToPounds(double kg) { return kg * 2.20462; }
    public static double gallonsToLiters(double gallons) { return gallons * 3.78541; }
    public static double litersToGallons(double liters) { return liters * 0.264172; }
}
