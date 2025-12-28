public class patternF{
    public static void main(String[] args){
        int val=1;
        int num=6;
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                System.out.print(val++ +" ");
               
            }
            System.out.println();
        }
    }
}