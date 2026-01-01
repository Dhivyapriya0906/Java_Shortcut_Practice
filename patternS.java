    //  *********
    //   *     *
    //    *   *
    //     * *
    //      *
    public class patternS{
        public static void main(String[] args){
            int n=5;
            for(int row=n;row>=1;row--){
                for(int space=1;space<=(n-row);space++){
                    System.out.print(" ");
                }
                for(int star=1;star<=row*2-1;star++){
                    if(star==1 || star==row*2-1 || row==n ){
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