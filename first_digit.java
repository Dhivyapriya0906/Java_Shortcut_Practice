import java.util.*;
public class first_digit{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int fd=num;
        while(fd>=10){
            fd=fd/10;
        }
        System.out.println("First Digit: "+fd);
}
}