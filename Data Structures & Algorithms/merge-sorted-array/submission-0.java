class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        Arrays.sort(nums1);

        for(int i=0; i<n; i++){
            nums1[i] = nums2[i];
        }
    }
}