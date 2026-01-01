public class patternQ{
    public static void main(String[] arg){
        int n=4;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=(n-row);space++){
                System.out.print("");
            }
            for(int star=1;star<=(row*2)-1;star++){
                if(star==1 || star==(row*2)-1 || row==n){
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