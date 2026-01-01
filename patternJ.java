public class patternJ{
    public static void main(String[] args){
        int n=5;
        for(int row=1;row<=(n*2);row++){
            int rowChange=row>n?(n*2)-row:row;
            for(int col=1;col<=rowChange;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}