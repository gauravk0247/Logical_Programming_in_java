public class peterson1 {
        public static void main(String[] args) {
            int num=145, sum=0;
            while(num>0){
                int rem=num%10;
                num=num/10;
                int sum2=1;
                for(int i=1; i<=rem; i++){
                    sum2=sum2*i;
                }
                sum=sum+sum2;
                  
            }
            System.out.println(sum);
        }
            
    }