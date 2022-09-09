class Solution {
  static int my_java_journey_find_in_string(String s1, char c) {
       int i = 0;
    while (i < s1.length()) {
      if (s1.charAt(i) == c) {
        return i;
      }
      i++;
    }
    return -1;
  }
}