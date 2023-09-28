public class PalindromeNumber {
    public static void main(String[] args) {
        int num=121, sum=0, copy, rem;
        copy=num;
        for(;num>0;){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if (copy == sum) {
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
        }
    }
