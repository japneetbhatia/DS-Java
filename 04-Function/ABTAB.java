import java.util.*;
  
  public class Main{
      
      public static int getValueIndecimal(int n, int b){
      // write your code here
      int res =0, pow = 1;
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            res += rem*pow;
            pow *= b; 
        }
        return res;
   }
   public static int getValueInBase(int n, int b){
        // write code here
        int res =0, pow = 1;
        while(n > 0){
            int rem = n % b;
            n /= b;
            res += rem*pow;
            pow *= 10; 
        }
        return res;
    }
   
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = getValueIndecimal(n,sourceBase);
     System.out.print(getValueInBase(ans,destBase));
   }   
  }