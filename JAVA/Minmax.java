import java.util.*;
public class Minmax {
    public static int Mm(int a[],int l,int max,int min){
        if(l==0){
            return max;
        }if(l==0){
            return min;
        }
        if(l>0){
            if(a[l]>max){
                max=a[l];
            }
        } if(l>0){
            if(a[l]<min){
                min=a[l];
            }
        }
            return Mm(a, l-1 , max, min);
        }
    public static void main(String args[]){
        int a[]={22,19,33,16,12};
        int l=a.length-1;
        int max=a[0];
        int min=a[0];
        System.out.println("Max_no"+Mm(a, l, max, min));
        System.out.println("Min_no"+Mm(a, l,max, min));
    }
}
    

