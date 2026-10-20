class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            candidate = (count == 0 ? num : candidate);
            count += (num == candidate ? 1 : -1);
        }

        return candidate;
    }
}