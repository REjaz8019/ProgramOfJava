import java.util.*;
public class salary {
    private long phone;
    private String name,spec,add;
    private static double m_sal;
    private static double inc_tax;
    public void accept(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name");
        name=in.nextLine();
        System.out.println("Enter Address");
        add=in.nextLine();
        System.out.println("Enter your Calling no.");
        phone=in.nextLong();
        System.out.println("Enter Specialization u have ('Subject you gonna teach')");
        spec=in.next();
        System.out.println("Enter monthly salary ypu are expecting");
        m_sal=in.nextDouble();
    }
    public void Details(){
        System.out.println("YOUR NAME:"+name);
        System.out.println("YOUR ADDRESS:"+add);
        System.out.println("YOUR CONTACT NO.:"+phone);
        System.out.println("Subject you gonna teach":"+spec);
        System.out.println("YOUR SALARY="+m_sal);
        System.out.println("INCOME TAX:"+inc_tax);
    } 
    public static void Compute(){
        double ann_sal= m_sal * 12;
        if(ann_sal>175000)
        {
            inc_tax = (ann_sal-175000)*5/100;
        } else{ inc_tax = 0;
         }
    }
    public static void main(String args[]){
        salary ob = new salary();
        ob.accept();
        ob.Details();
        ob.Compute();
    }
    
}
