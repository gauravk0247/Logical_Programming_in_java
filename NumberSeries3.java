public class NumberSeries3 {
    public static void main(String[] args) {
        int a=2;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(a);
                a=a+3;
            }
            else{
                System.out.println(a);
                a=a+2;
            }
        }
    }
}
