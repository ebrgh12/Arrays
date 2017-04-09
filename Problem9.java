/* Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/


public int[] plusTwo(int[] a, int[] b) {
  int[] res= new int[4];
  for(int i=0;i<=4;i++){
    if(i<2){
      res[i]=a[i];
    }
  }
    for(int i=0;i<=4;i++)
  {
     if(i<2){
      res[i+2]=b[i];
    }
  
  }  
  return res;
}