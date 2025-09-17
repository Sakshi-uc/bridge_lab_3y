package string_practice_level_2;
import java.util.Scanner;
public class StudentVoting{
    static int[] collectAges(int count, Scanner scan){
        int[] ageList=new int[count];
        for(int i=0;i<count;i++){
            System.out.print("Enter age of student "+(i+1)+": ");
            ageList[i]=scan.nextInt();
        }
        return ageList;
    }
    static String[][] checkVoting(int[] ageList){
        String[][] result=new String[ageList.length][2];
        for(int i=0;i<ageList.length;i++){
            result[i][0]=String.valueOf(ageList[i]);
            if(ageList[i]<0) result[i][1]="Invalid";
            else result[i][1]=(ageList[i]>=18)?"Can Vote":"Cannot Vote";
        }
        return result;
    }
    static void showTable(String[][] table){
        System.out.printf("%-10s %-12s%n","Age","Voting");
        for(String[] row:table) System.out.printf("%-10s %-12s%n",row[0],row[1]);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] ageList=collectAges(10,scanner);
        String[][] table=checkVoting(ageList);
        showTable(table);
        scanner.close();
    }
}
