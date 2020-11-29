def lengthOfLongestSubstring(s: str) -> int:
  maxSeq = 0
  lowBound = 0
  dic = {}
  for highBound,char in enumerate(s):
    if char in dic:
      lowBound = max(lowBound, dic[char])
    maxSeq = max(maxSeq, (highBound - lowBound + 1))
    dic[char] = highBound + 1
  return maxSeq
