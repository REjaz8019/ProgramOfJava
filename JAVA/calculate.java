import java.util.*;
 class calculate {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        float mod,div,a,b;
        a=in.nextFloat();
        b=in.nextFloat();
        mod=a%b;
        div=a/b;
        System.out.println("MODULUS="+mod);
        System.out.println("DIVISION="+div);
    }
    
}
