public class patternP{
    public static void main(String[] args){
        int n=5;
        for(int row=1;row<=(n*2);row++){
            int rowChange=row>n?(n*2-row)+1:row;
            for(int space=1;space<=(rowChange-1);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(n-rowChange+1);star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}