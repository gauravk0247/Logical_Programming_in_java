public class NumberSeries6 {
    public static void main(String[] args) {
        int num=123, sum=0, rem;
        for( ;num>0; ){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
