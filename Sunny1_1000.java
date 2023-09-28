public class Sunny1_1000 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
        double d = i;
        double num=d+1;
        double sqrt = Math.sqrt(num);
        if(sqrt-Math.floor(sqrt)==0) {
            System.out.println(i);
        }
        }
    }
}
