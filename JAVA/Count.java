import java.util.*;
public class Count {
    public static void Display(int num){
        int p=0,n=0,z=0;
        System.out.println("Enter y to continue & n to stop");
        String yourChoice=in.next();
        while (yourChoice=='y') {
            if(num>0)
        {
            p++;
        } if(num<0){
            n++; 
        } if(num==0)
        {
            z++;
        }
         System.out.println("Enter y to continue & n to stop");   
         String yourChoice=in.next();
        } 
        System.out.println("Count of +ve no's"+p);
        System.out.println("Count of -ve no's"+n);
        System.out.println("Count of zero's"+z);
    } public static void main(String args[]){
        int no;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any number you want");
        no=in.nextInt();
        Display(no);
        }
}
   
