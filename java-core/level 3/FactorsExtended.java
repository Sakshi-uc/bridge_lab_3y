import java.util.*;

public class FactorsExtended {
    static int[] getFactors(int number){
        int count=0;
        for(int i=1;i<=number;i++) if(number%i==0) count++;
        int[] factorsArr=new int[count]; 
        int index=0;
        for(int i=1;i<=number;i++) if(number%i==0) factorsArr[index++]=i;
        return factorsArr;
    }

    static int getGreatestFactor(int[] factorsArr){ 
        int max=factorsArr[0]; 
        for(int val : factorsArr) if(val>max) max=val; 
        return max; 
    }

    static long sumFactors(int[] factorsArr){ 
        long sum=0; 
        for(int val : factorsArr) sum+=val; 
        return sum; 
    }

    static long productFactors(int[] factorsArr){ 
        long product=1; 
        for(int val : factorsArr) product*=val; 
        return product; 
    }

    static double productOfCubes(int[] factorsArr){ 
        double product=1.0; 
        for(int val : factorsArr) product*=Math.pow(val,3); 
        return product; 
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();

        int[] factorsArr=getFactors(number);
        System.out.println("Factors: " + Arrays.toString(factorsArr));
        System.out.println("Greatest factor: " + getGreatestFactor(factorsArr));
        System.out.println("Sum: " + sumFactors(factorsArr));
        System.out.println("Product: " + productFactors(factorsArr));
        System.out.println("Product of cubes: " + productOfCubes(factorsArr));
    }
}
