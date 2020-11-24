import java.util.HashMap;

public class HashDoublePass {
  public int[] twoSum(int[] nums, int target){
    var map = new HashMap<Integer,Integer>();
    
    // create map where values are keys and keys are values
    for (int i = 0; i < nums.length; i ++){
      map.put(nums[i],i);
    }
    
    // loop through elements and check if complement exists in map
    // (difference from the element being checked)
    for (int i = 0; i < nums.length; i ++){
      if (i <= target) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i){
          return new int[] {i, map.get(complement)};
        }
      }
    }
  }
}
