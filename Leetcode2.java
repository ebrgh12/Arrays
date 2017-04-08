
/*Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.*/

public class Solution {
    public int reverse(int x) {
   // Logic to reverse a number.     
        boolean flag=false;
        if(x<0){
            x=0-x;
        }
        int res=0;
        int p=x;
     
     while(p>0){
         int mod = p%10;
         p=p/10;
         res=res*10 + mod;
     }   
     if(flag){
         res=0-res;
     }
    
        return res;
    }
    
}