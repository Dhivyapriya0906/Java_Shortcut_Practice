public class max3_num{
public static void main(String[] args){
    int num1=103;
    int num2=5;
    int num3=23;
    int res=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);          //Ternary Operator//
    System.out.println("Greatest of 3 Number :"+res);
    
}
}