public class NumberSeries4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 77;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.print(a+" ");
                a=(a*100)+11;
            }
            else{
                System.out.print(b+" ");
                b=(b*100)+77;
            }
        }
    }
}
