// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Pattern14 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
