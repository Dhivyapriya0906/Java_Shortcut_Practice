 public class patternO{
 public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n*2-1;row++){
            int rowChange=row>n?(n*2)-row:row;
            for(int space=1;space<=n-rowChange;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(rowChange*2)-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    
 }
}