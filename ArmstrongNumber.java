public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153, rem, sum=0, temp;
        temp=num;
        for(;num>0;){
            rem=num%10;
            sum=(rem*rem*rem)+sum;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
