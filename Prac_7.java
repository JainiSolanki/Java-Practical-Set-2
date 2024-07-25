public class Prac_7 {
    public static void main(String[] args) {
        String s="CHARUSAT University";
        System.out.println("The length of String is " +s.length());
        System.out.println("Uppercase of the string is " +s.toUpperCase());
        System.out.println("Replace done is " +s.replace('H','N'));
        char []j=s.toCharArray();
        for(int i=0;i<9;i++)
        {
            System.out.print(j[i]);
        }  
        System.out.println("This practical is made by 23CS096-JAINI SOLANKI");  
    }
}
