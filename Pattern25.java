//     1 
//    212
//   32123
//  4321234
// 543212345

public class Pattern25 {
    public static void main(String[] args) {
        int i,j,k;
		for(i=1;i<=5;i++){
			for(k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(k=i;k>=2;k--){
				System.out.print((k));
			}
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
			System.out.println(" ");
		}
        }
    }