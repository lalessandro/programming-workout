class LongSubstrMaxWind{
  public static int lengthOfLongestSubstring(String s) {
    int seqNoDupLen;
    int winLength;
    for (winLength = s.length(); winLength > 0; winLength -- ){
      for (int lowBound = 0; lowBound <= (s.length() - winLength); lowBound ++){
        seqNoDupLen = 1;
        for (int highBound = lowBound + 1; (highBound - lowBound + 1) <= winLength; highBound ++){
          if (s.substring(lowBound,highBound).indexOf(s.charAt(highBound)) == -1){
            seqNoDupLen ++;
          }
        }
        if (seqNoDupLen == winLength){
          return winLength;
        }
      }
    }
    return winLength;
  }
  public static void main(String args[]){
    System.out.println(lengthOfLongestSubstring(""));
    System.out.println(lengthOfLongestSubstring("a"));
    System.out.println(lengthOfLongestSubstring("au"));
    System.out.println(lengthOfLongestSubstring("dvdffc"));
  }
}