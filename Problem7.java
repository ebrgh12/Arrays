/* To find the largest element in the array and replace all the elements of array.*/ 

public int[] maxEnd3(int[] nums) {
  int large=nums[0];
  for(int i=1; i<nums.length;i++){
    if(large<nums[i]){
      large=nums[i];
    }
    else if(large>nums[i]){
      continue;
    }
  }
  for(int i=0;i<nums.length;i++){
    nums[i]=large;
  }
  return nums;
}
