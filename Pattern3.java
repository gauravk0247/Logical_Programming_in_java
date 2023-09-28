// 1 
// 2  ?
// 3  ? 3
// 4  ? 4  ?
// 5  ? 5  ? 5

public class Pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(" ? ");
                }
                else{
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
