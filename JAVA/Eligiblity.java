import java.util.*;
public class Eligiblity {
    int age(int a)
    {
        if(a>18){
            return 0;
        } else
        return 1;
    } public static void main(String args[]) {
        int p,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter you age");
        p=in.nextInt();
        Eligiblity obj = new Eligiblity();
        b=obj.age(p);
        if(b==0){
            System.out.println("Person is eligible for vote");
        } else{
            System.out.println("Person is not eligible for vote");
        }
    }
}
    
