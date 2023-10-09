public class Pattern27 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(j+" ");   
            if(j==1 || j==2){
                   continue;
                }  
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
