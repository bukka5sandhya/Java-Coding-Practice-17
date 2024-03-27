import java.util.Scanner; 
class SolidHalfDiamond{ 
    public static void main(String[] args){
        Scanner input =new Scanner(System.in); 
        int N = input.nextInt(); //input 5
        for(int i=1;i<=N;i++){ 
                System.out.println("* ".repeat(i)); 
            }
           //inverted half pyrmid
         for(int i=1; i<N;i++){ 
            for(int j=1;j<N-i+1;j++){
                System.out.print("* "); 
           } 
         System.out.println();
         }
    }
}