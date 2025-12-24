public class sumofn_number{
    public static void main(String[] args){
        int num=15;
        System.out.println(getSum(num));
        
    }
    public static int getSum(int n){            //recursion method      //return type int la than irukanum apa tha return pana mudiyum
        if(n==0){
            return n;
        }
        return n+ getSum(n-1);
    }
}