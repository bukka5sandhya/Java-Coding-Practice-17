import java.util.Scanner; 
class Butterfly{ 
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in); 
        int N = input.nextInt();// 5 input
        for(int i=1; i<=N;i++){ 
             for(int j=1;j<=i;j++)
              System.out.print("* "); 
            for(int j=i;j<N;j++)
                System.out.print("  ");
            for(int j=i;j<N;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
         for(int i=1; i<=N;i++){ 
             for(int j=i;j<=N;j++)
            System.out.print("* "); 
            for(int j=1;j<i;j++) 
                System.out.print("  ");
            for(int j=1;j<i;j++) 
                System.out.print("  ");
            for(int j=i;j<=N;j++)
                System.out.print("* ");
            System.out.println();
         }
    }
}