import java.util.*;
public class linear {
    public static void main(String args[]){
        int i,ns,k=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no to be search");
        ns=in.nextInt();
        int a[]={12,30,37,65,88,89,91,98,100};
        for(i=0;i<a.length;i++){
            a[i]=in.nextInt();               
        } for(i=0;i<a.length;i++){
            if(a[i]==ns)
            {
                k=1;
                break;
            }
        } if(k==0){
            System.out.println("NO is not found");
        } if(k==1){
            System.out.println("YOUR NO IS SUCESSFULY FOUND");
        }
    }
}
