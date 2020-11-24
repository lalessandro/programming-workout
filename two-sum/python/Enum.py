class Solution(object):
  def twoSum(self,nums,target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    for key,value in enumerate(nums):
      complement = target - value
      if ((complement in nums) and (nums.index(complement) != key)):
        return [key,nums.index(complement)]

solution = Solution()
solution.twoSum([1,2,3,4,0],3)