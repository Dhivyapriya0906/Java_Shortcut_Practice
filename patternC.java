public class patternC{
    public static void main(String[] args){
        int num=5;
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" * ");              //Static Pattern            Tips
            }                                                               // 1.No of col= No of row
            System.out.println();                                           // 2.inner loop=col     outer loop=row
        }
    }
}