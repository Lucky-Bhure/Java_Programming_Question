import java.util.Scanner;

class Result{

    static void information(String name, int clas,int rollno, String section, String school ) {
        System.out.println("Name : "+name);
        System.out.println("Class : "+clas);
        System.out.println("Roll No.: "+rollno);
        System.out.println("Section : "+section);
        System.out.println("School : "+school);
        System.out.println("############################################################");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int clas, rollno;
        String name,section,school;
        System.out.print("Name : ");
        name = sc.nextLine();
        System.out.print("Class : ");
        clas = sc.nextInt();
        System.out.print("Roll No.: ");
        rollno = sc.nextInt();
        System.out.print("Section : ");
        section = sc.next();
        System.out.print("School : ");
        school = sc.nextLine();

        System.out.println("############################################################");
        information(name,clas,rollno,section,school);
        System.out.println("############################################################");
        sc.close();
    }
}