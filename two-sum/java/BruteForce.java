import java.util.ArrayList;

class BruteForce {

  public static void main(String[] args){
    int[] input = new int[]{0,1,3,10,11};
  }

  public static int[] twoSum(int[] nums, int target){
    ArrayList<Integer> candidates = new ArrayList<>();

    // only select elements that are smaller or equal than target
    for (int i = 0; i < nums.length; i ++){
      if (nums[i] <= target){
        candidates.add(i);
      }
    } 

    for (int i = 0; i < candidates.size() - 1; i ++){
      for (int j = i + 1; j <candidates.size(); j ++){
        if (nums[candidates.get(i)] + nums[candidates.get(j)] == target) {
          return new int[] {candidates.get(i),candidates.get(j)};
        }
      }
    }
  }
}