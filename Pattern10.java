//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

public class Pattern10 {
    public static void main(String[] args) {
        int i,j,k;
		for(i=1;i<=5;i++){
			for(k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
    }
}
