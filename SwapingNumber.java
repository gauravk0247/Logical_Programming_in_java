public class SwapingNumber {
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("Before Swaping of a Number "+ a);
        System.out.println("Before Swaping of b Number "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping of a "+ a);
        System.out.println("After Swaping of b "+ b);
    }
}
