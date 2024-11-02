import java.util.*;
public class Occurence {
    static int firstindex=-1;
    static int lastindex=-1;
    public static void word(String str, char e, int i)
    {
        if(i==str.length()){
            System.out.println("first index="+firstindex);
            System.out.println("last index="+lastindex);
            return;
        }
        char ch = str.charAt(i);
        if(ch==e)
        {
            if(firstindex==-1){
                firstindex = i;
            } 
            else{
                lastindex=i;
            }
            word(str,e,i+1);
        }
    }
    public static void main(String args[])
    {
        int i=0;
        word("HELLO", 'E', i);
    }
}
