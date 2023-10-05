//  1 2 3 4 5 
//   2 3 4 5
//    3 4 5
//     4 5
//      5 
//     4 5
//    3 4 5
//   2 3 4 5
//  1 2 3 4 5 

public class Pattern26 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=5;i++){
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
