import java.lang.*;
public class patternZ{
    public static void main(String[] args){
        int n=4;
        for(int row=1;row<=n*2-1;row++){
            for(int col=1;col<=n*2-1;col++){
                int topd=row ;
                int bottomd=n*2-row;
                int leftd=col;
                int rightd=n*2-col;
                int min=Math.min(Math.min(topd,bottomd),Math.min(leftd,rightd));
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
// If you want like this then try below formula
// 1 1 1 1 1 1 1 
// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1
    for(int row=1;row<=n*2-1;row++){
            for(int col=1;col<=n*2-1;col++){
                int topd=row ;
                int bottomd=n*2-row;
                int leftd=col;
                int rightd=n*2-col;
                int min=Math.min(Math.min(topd,bottomd),Math.min(leftd,rightd));
                System.out.print(min+" ");      //ithu than maarum
            }
            System.out.println();
        }
    }
}