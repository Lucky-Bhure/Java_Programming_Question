import java.util.Scanner;

public class Hollow_Rectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter breadth of Solid Rectangle :");
        int breadth = sc.nextInt();
        System.out.println("Enter Length of Solid Rectangle :");
        int length = sc.nextInt();
        sc.close();


        System.out.println("Hollow Rectangle Pattern : ");
        for(int i = 1 ; i <= breadth ; i++){
            for(int j = 1 ; j <= length; j++ ){
                if(i == 1 || i == breadth || j == 1 || j == length){
                    System.out.print("* ");
                }
                else{  
                        System.out.print("  ");
                   }
                }
                System.out.println(" ");
            }
        }
    }
