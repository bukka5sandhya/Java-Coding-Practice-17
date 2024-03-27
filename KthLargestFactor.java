import java.util.Scanner; 
class KthLaargestFactor{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int M = input.nextInt(); //12 input
        int N = input.nextInt(); //2 input
        int count =0;
        for(int i=M;i>=1;i--){ 
            if(M%i ==0){ 
                count++; 
                if(count == N){ 
                    System.out.println(i); 
                    break;
                }
            } 
        } 
    } 
}
            
        