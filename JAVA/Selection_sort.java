import java.util.*;
public class Selection_sort {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int i,j,min=0,temp=0;
        int a[]=new int[10];
        for(i=0;i<10;i++){
            System.out.println("Enter array elements");
            a[i]=in.nextInt();
        } for(i=0;i<10;i++){
            min=i;
            for(j=i+1;j<10;j++){
                if(a[j]<a[min]);
                {
                    min=j;
                }
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            System.out.println("SORTED ARRAY");
            for(i=0;i<10;i++){
                System.out.println(a[i]);
            }                                                   
        } 
          
    }
}
