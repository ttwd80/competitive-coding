class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)  {
            Integer pos = map.get(target - nums[i]);
            if (pos == null) {
                map.put(nums[i], i);    
            } else {
                return new int[]{pos, i};
            }
        }
        return null;
    }
}
