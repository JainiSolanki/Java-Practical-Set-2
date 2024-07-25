import java.util.*;
public class Prac_4 {
    public static void main(String[] args) {
      Scanner j=new Scanner(System.in);
      System.out.print("Enter the string: ");
      String str=j.nextLine();
      String s="";
      s=repeat(str);
      System.out.println(s);
      System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }

    public static String repeat(String str)
    {
       String result="";
        for(int i=0;i<str.length();i++)
        {
           result=result+str.charAt(i)+str.charAt(i);
        }
        return result;
    }
}
