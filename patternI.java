public class patternI{
    public static void main(String[] args){
        
        int num=6;
        for(int row=1;row<=num;row++){
              int val=(num-(row-1));            
            for(int col=1;col<=val;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}