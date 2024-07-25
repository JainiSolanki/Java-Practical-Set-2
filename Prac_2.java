import java.util.*;
public class Prac_2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of elements: ");
       int n=sc.nextInt();
       System.out.print("Enter the elements of array: ");
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
         arr[i]=sc.nextInt();
       }
       int result=count_num(arr,n);
       System.out.println("The number of nines are "+result);
       System.out.println("This practical is made by 23CS096-JAINI SOLANKI");
       
    }
    public static int count_num(int a[],int n)
    {
      int count=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==9)
        count++;
      }
      return count;
    }
}

