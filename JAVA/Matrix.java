import java.util.*;

public class Matrix {
   public static void main(String args[]) {
      int a[][] = new int[2][2];
      int b[][] = new int[2][2];
      int c[][] = new int[2][2];
      Scanner in = new Scanner(System.in);
      System.out.print("ENTER 1st MATRIX DATA");
      for (int i = 0; i < 2; i++) { // rows
         for (int j = 0; j < 2; j++) { // columns
            a[i][j] = in.nextInt();
         }
      }
      System.out.print("ENTER 2nd MATRIX DATA");
      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            b[i][j] = in.nextInt();
         }
      }
      System.out.print("1ST MATRIX \n");
      for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
            System.out.print(a[i][j] + " ");
         }
         System.out.print("\n");
      }
      System.out.print("2ND MATRIX \n");
      for (int i = 0; i < 2; i++)
         for (int j = 0; j < 2; j++) {
            System.out.print(b[i][j] + " ");
         }
      System.out.print("\n");

      System.out.print("SUM OF ABOVE MATRIX");
      for(int i=0;i<2;i++)
      {
         for (int j = 0; j < 2; j++) {
            c[i][j] = a[i][j] + b[i][j];
            System.out.print(c[i][j] + " ");
         }
         System.out.println();
      }
   
   }

}

