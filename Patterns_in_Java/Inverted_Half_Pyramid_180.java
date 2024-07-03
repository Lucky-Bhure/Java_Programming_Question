import java.util.Scanner;

public class Inverted_Half_Pyramid_180{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height of Pyramid :");
        int height = sc.nextInt();
        sc.close();
        
        System.out.println("Inverted Half Pyramid 180 Pattern : ");
        // for(int i = 1 ; i <= height ; i++){
        //     // space loop
        //     for(int j = i ; j < height ; j++){
        //         System.out.print("  ");
        //         }
        //     // star loop
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //         System.out.println("  ");
        //     }

                        // OR

        for(int i = 1 ; i <= height ; i++){
            // space loop
            for(int j = 1 ; j <= height ; j++){
                if((i+j)>height){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println("");
            }
    }
}
