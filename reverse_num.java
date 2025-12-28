import java.util.*;
public class reverse_num{
    public static void main(String[] arga){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int rev=0;
        int quo=num;
        int rem=0;
        while(quo>0){
            rem=quo%10;
            rev=rev*10+rem;
            quo=quo/10;
        }
        System.out.println("Reverse the Number: "+rev);
    }
}