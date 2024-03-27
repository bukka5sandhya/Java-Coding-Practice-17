import java.util.Scanner; 
class FullPyramid3{ 
    public static void main(String[] args){
      Scanner input = new Scanner(System.in); 
      int N = input.nextInt(); //5 input
      int space_middle=(2*N)-1;
      for(int i=1;i<=N;i++){ 
          for(int j=1;j<=space_middle;j++){ 
              if(j>=(N+1)- i&&j<=(N-1)+i){
              System.out.print("1 "); 
          } else{
          System.out.print("0 ");
          }
         } 
         System.out.println();
      }
    }
}