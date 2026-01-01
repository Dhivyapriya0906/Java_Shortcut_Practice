    //    1      1
    //    12    21
    //    123  321
    //    12344321
    public class patternY{
        public static void main(String[] args){
            int n=4;
            for(int row=1;row<=n;row++){
                for(int col=1;col<=row;col++){
                    System.out.print(col);
                }
                for(int space=1;space<=n*2-(2*row);space++){
                    System.out.print(" ");
                }
                for(int col=row;col>=1;col--){
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }
   