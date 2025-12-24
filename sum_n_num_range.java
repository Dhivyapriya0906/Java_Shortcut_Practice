public class sum_n_num_range{
    public static void main(String[] args){
        int st=4;
        int end=6;
        int sum=0;
        for(int i=st;i<=end;i++){            //Brutte Force Method
            sum+=i;
        }
        System.out.println("Brutte "+sum);
        int sum2=end*(end+1)/2 - st*(st+1)/2  +st;
        System.out.println("Formula"+sum2);         //Formula use panirukom 
    }
}