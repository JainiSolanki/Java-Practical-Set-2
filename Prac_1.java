import java.util.*;
public class Prac_1{
    public static void main(String[] args) {
     Scanner js=new Scanner(System.in);
     System.out.print("Enter the string: ");
     String s=js.nextLine();
     System.out.print("Enter the number of times you want to repeat: ");
     int n=js.nextInt();
     String jiya="";
      jiya=repeat(s,n);
      System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
    public static String repeat(String str,int n)
    {
        String sc="";
        sc=str.substring(0,3);
        for(int i=0;i<n;i++)
        {
            System.out.print(sc+" ");
        }
        return sc;
    }
}