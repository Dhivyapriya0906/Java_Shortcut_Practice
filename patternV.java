    //       *****
    //      *   *
    //     *   *
    //    *   *
    //   *****
    public class patternV{
        public static void main(String[] args){
           int n=5;
            for(int row=1;row<=n;row++){
                
                    for(int space=1;space<=n-row;space++){
                        System.out.print(" ");
                    }
                    for(int star=1;star<=n;star++){
                        if(star==1 || star==n || row==n || row==1 ){
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