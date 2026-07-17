class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        sum=0
        for i in range(0,len(nums)):
            sum+=nums[i]
        

        prefix=0

        for i in range(0,len(nums)):
            sum-=nums[i]
            if(sum==prefix):
                return i
            prefix+=nums[i]

        return -1