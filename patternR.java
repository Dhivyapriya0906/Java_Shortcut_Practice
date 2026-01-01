public class patternR{
    public static void main(String[] args){
        int n= 5;
        for(int row=1;row<=n*2;row++){
            int rowChange=row>n?n*2-(row-1):row;
            for(int star=1;star<=(n*2);star++){
                if(star<=n-rowChange+1 || star>n+rowChange-1){
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