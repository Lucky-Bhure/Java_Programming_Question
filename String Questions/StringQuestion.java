// Remove Special characters from a string
// Remove extra spaces from string
// Find number of words in a String

public class StringQuestion {
       public static void main(String arg[]){
              String str = "       My name & is $ Lucky % Bhure                 ";

              String str2 = str.replaceAll("[^a-zA-Z0-9 ]" , "").trim();
              String str3 = str2.replaceAll("( )+" , " ");
              String arr[] = str3.split(" ");
              System.out.println(str3);
              System.out.println("Number of words : "+arr.length);

              
       }
}
