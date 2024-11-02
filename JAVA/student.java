import java.util.*;
public class student {
    String name; 
    int age,m1,m2,m3;
    float max,avg;
    student( String name, int age, int m1, int m2, int m3){
        this.name=name;
        this.age=age;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public void compute(){
        avg = m1+m2+m3/3;
        if((m1>m2)&&(m1>m3))
        {
            System.out.println("m1 is maximum");
        } if((m2>m1)&&(m2>m3)){
            System.out.println("m2 is maximum");
        } if((m3>m1)&&(m3>m2))
           {
            System.out.println("m3 is maximum");
           }
    }
    public void display()
    {
        System.out.println("Name of the student="+name);
        System.out.println("Age of student="+age);
        System.out.println("Marks of first sub.="+m1);
        System.out.println("Marks of second sub.="+m2);
        System.out.println("Marks of third sub.="+m3);
        System.out.println("Maximum Marks Scored"+max);
        System.out.println("Average="+avg);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        student ob = new student("Roshan Ejaz",19,95,85,64);
        ob.compute();
        ob.display();
    }
}
