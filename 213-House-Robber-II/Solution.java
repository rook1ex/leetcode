class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int lo, int hi) {
        int one = 0;
        int two = 0;
        for (int i = lo; i <= hi; i++) {
            int tmp = two;
            two = Math.max(two, one + nums[i]);
            one = tmp;
        }

        return two;
    }
}
