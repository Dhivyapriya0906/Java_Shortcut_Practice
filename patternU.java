    //    ****
    //    *  *
    //    *  *
    //    *  *
    //    ****
public class patternU{
    public static void main(String[] args){
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-1;col++){
                if(row==1 || row==n || col==1 || col==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}