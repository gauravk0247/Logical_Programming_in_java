//          * 
        
//        * * * 
      
//      * * * * * 
    
//    * * * * * * * 
  
//  * * * * * * * * * 

//    * * * * * * * 
    
//      * * * * *

//        * * *

//          *

public class Pattern23 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int k=9; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=7; i>=1; i--){
            for(int k=9; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                     System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
