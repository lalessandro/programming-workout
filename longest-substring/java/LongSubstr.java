class LongSubstr{
  public static int lengthOfLongestSubstring(String s) {
    int maxLength = 0;

    for (int lowBound = 0; lowBound < s.length(); lowBound ++){
      if (s.length() - lowBound > maxLength){
        for (int highBound = lowBound + 1; highBound <= s.length(); highBound ++){
          if (highBound == s.length() || s.substring(lowBound,highBound).indexOf(s.charAt(highBound)) != -1){
            maxLength = (highBound - lowBound)>maxLength ? (highBound - lowBound):maxLength;
            break;
          }
        }
      }
    }
    return maxLength;
  }

  public static void main(String args[]){
    System.out.println(lengthOfLongestSubstring(""));
    System.out.println(lengthOfLongestSubstring("a"));
    System.out.println(lengthOfLongestSubstring("au"));
    System.out.println(lengthOfLongestSubstring("dvdffc"));
  }
}