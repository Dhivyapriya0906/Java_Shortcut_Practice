import java.util.*;
public class last_digit{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int ld=num;
        while(ld>=10){
            ld=ld%10;
        }
        System.out.println("Last Digit: "+ld);
}
}