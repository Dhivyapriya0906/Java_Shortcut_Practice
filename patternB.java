public class patternB{
    public static void main(String[] args){
        int num=5;
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                System.out.print(row+" ");              //Static Pattern            Tips
            }                                                               // 1.No of col= No of row
            System.out.println();                                           // 2.inner loop=col     outer loop=row
        }
    }
}