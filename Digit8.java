import java.util.Scanner; 
class Digit8{ 
    public static void main(String[]args){ 
        Scanner input = new Scanner(System.in); 
        int N = input.nextInt(); //8 input
        int Nume=2*N+1; 
        String top_sq="" ,space=""; 
        for(int j=0;j<N;j++){ 
            top_sq +="* ";
        } 
        for(int i=1;i<Nume+1;i++){
            if(i == 1 || i==N+1 || i== Nume){ 
                System.out.println(top_sq);
            }else{ 
                space=""; 
                for(int j=0;j<N-2;j++){ 
                    space += "  "; 
                } 
                System.out.println("* "+space+"* "); 
            }
        }
        input.close();
    } 
}