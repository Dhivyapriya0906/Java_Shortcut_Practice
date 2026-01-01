    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public class patternX{
        public static void main(String[] args){
            int n=5;
            for(int row=1;row<=n;row++){
                for(int space=1;space<=n-row;space++){
                    System.out.print("  ");
                }
                for(int col=row;col>=1;col--){          //left alignment print pana upto 1
                    System.out.print(col+" ");
                }
                for(int col=col<=row;col++){            //right alignment printpana start from 2
                    System.out.print(col+" ");
                }
                System.out.println();
            }
            
        }
        
        }
    