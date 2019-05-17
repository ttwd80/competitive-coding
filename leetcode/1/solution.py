class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d = dict()        
        for i in range(0, len(nums)):
            a = nums[i]
            b = target - a
            if a in d:
                return [d[a] ,i]
            else:
                d[b] = i
            
        
