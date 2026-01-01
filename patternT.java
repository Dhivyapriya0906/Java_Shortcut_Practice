    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *
public class patternT{
    public static void main(String[] args){
       int  n=5;
        for(int row=1;row<=n*2-1;row++){
            int rowChange=row>n?n*2-row:row;
            for(int space=1;space<=(n-rowChange);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=rowChange*2-1;star++){     //ethana vaati run aaganum like 4 th row la 7 col  vara run aaganum athu maari
                if(star==1 || star==rowChange*2-1){
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