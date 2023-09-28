public class Sunny {
    public static void main(String[] args) {
        double d = 80;
        double num=d+1;
        double sqrt = Math.sqrt(num);
        if(sqrt-Math.floor(sqrt)==0){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not Sunny");
        }
    }
}
