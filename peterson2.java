public class peterson2 {
    public static void main(String[] args) {
        int num=145, rem, product, sum=0;
        int copy=num;
        for(;num>0;){
            rem=num%10;
            product=1;
            for(int i=1;i<=rem;i++){
                product=product*i;
            }
            sum=sum+product;
            num=num/10;
        }
        if(copy==sum){
            System.out.println("peterson number");
        }
        else{
            System.out.println("Not peterson number");
        }
    }
    
}
