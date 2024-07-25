import java.util.*;
public class Prac_6 {
    public static void main(String[] args) {
      String reverse="";
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the string: ");
      String str=  sc.nextLine();
      System.out.println("Length of string is " +str.length());
      System.out.println("Lower case of string is " +str.toLowerCase());
      System.out.println("Upper case of string is " +str.toUpperCase());
      for(int i=str.length()-1;i>=0;i--)
      {
         reverse=reverse+str.charAt(i);
      }
      System.out.println("Reverse of the string is " +reverse);
      char []a=str.toCharArray();
      Arrays.sort(a);
      System.out.println("Sorted string is " +Arrays.toString(a));
      System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}
