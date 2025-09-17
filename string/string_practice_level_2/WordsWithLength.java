package string_practice_level_2;
import java.util.Scanner;
public class WordsWithLength{
    static int strLen(String s){
        int cnt=0;
        try{
            while(true){
                s.charAt(cnt);
                cnt++;
            }
        }catch(Exception e){}
        return cnt;
    }
    static String[] splitText(String txt){
        int len=strLen(txt),spaces=0;
        for(int i=0;i<len;i++) if(txt.charAt(i)==' ') spaces++;
        String[] arr=new String[spaces+1];
        int start=0,idx=0;
        for(int i=0;i<=len;i++){
            if(i==len||txt.charAt(i)==''){
                arr[idx++]=txt.substring(start,i);
                start=i+1;
            }
        }
        return arr;
    }
    static String[][] wordLengths(String[] arr){
        String[][] res=new String[arr.length][2];
        for(int i=0;i<arr.length;i++){
            res[i][0]=arr[i];
            res[i][1]=String.valueOf(strLen(arr[i]));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String inp=sc.nextLine();
        String[] words=splitText(inp);
        String[][] tbl=wordLengths(words);
        System.out.printf("%-15s %-10s%n","Word","Length");
        for(String[] r:tbl) System.out.printf("%-15s %-10s%n",r[0],r[1]);
        sc.close();
    }
}
