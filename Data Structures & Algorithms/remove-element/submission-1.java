class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            if(nums[right] == val){
                right--;
            }

            if(nums[left] == val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

            else{
                left++;
            }
        }

        if(nums.length == 1 && nums[0] == val){
            return 0;
        }
        else{
            return left+1;
        }
    }
}