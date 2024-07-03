import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        int row = sc.nextInt();
        sc.close();
        
        System.out.println("Butterfly Pattern : ");
        for( int i = 1 ; i <= row; i++ ){
            // star pattern
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
                
            }

            System.out.println("");
        }
    }
}
