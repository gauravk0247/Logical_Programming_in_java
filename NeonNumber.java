public class NeonNumber {
    public static void main(String[] args) {
        int rem, num=9, sum=0, temp;
        temp=num;
        for(;num>0;){
            rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon");
        }
    }
}
