import java.util.Scanner;

public class Zero_One_Triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        int row = sc.nextInt();
        sc.close();

        System.out.println("0-1 Triangle Pattern : ");
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i ; j++){
                if( (i+j)%2 == 0){
                    // even
                    System.out.print("1 ");
                }
                else{
                    // odd
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
}
