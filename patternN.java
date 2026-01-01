public class patternN{
    public static void main(String[] args){
        int n=3;
        for(int row=n;row>=1;row--){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=(row*2)-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}