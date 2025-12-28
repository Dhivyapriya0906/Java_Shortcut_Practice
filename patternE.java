public class patternE{
    public static void main(String[] args){
        int val=1;
        int num=6;
        for(int row=1;row<=num;row++){
            val=row%2==0?0:1 ;                  //chack the row is even or not
            for(int col=1;col<=row;col++){
                System.out.print(val+" ");
                val=val==0?1:0;
            }
            System.out.println();
        }
    }
}