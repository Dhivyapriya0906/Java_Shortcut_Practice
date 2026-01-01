    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *
    public class patternW{
        public static void main(String[] args){
            int n=5;
            for(int row=1;row<=n*2-1;row++){
                int rowchange=row>=n?(n*2-row):row;
                for(int col=1;col<=n*2;col++){
                    if(col<=rowchange || col>n*2-rowchange){
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