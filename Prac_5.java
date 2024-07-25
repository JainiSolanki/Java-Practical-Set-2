import java.util.*;
public class Prac_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.nextLine();
        String jiya[]=str.split(" ");
        for(int i=0;i<jiya.length;i++)
        {
            String ans="";
            for(int j=jiya[i].length()-1;j>=0;j--)
            {
               ans=ans+jiya[i].charAt(j);
            }
            System.out.print(ans+" ");
        }
    System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
    }
}
