import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution longestString = new Solution();
        System.out.println(longestString.lengthOfLongestSubstring("abba"));
        ;
    }


}

//d[i] = d[i-1]-d[j]+1
class Solution {
    int maxLength = 0;

    Map<Character,Integer> map = new HashMap<>();

    public int lengthOfLongestSubstring(String s) {
        if (!s.isEmpty()) {

            for (int i = 0,j = 0; i < s.length(); i++) {
               if (map.containsKey(s.charAt(i))) {
                   if (j < map.get(s.charAt(i) )+1) {
                       j = map.get(s.charAt(i))+1;
                   }
               }
               map.put(s.charAt(i),i);
               if(maxLength<i-j+1) {
                   maxLength =i-j+1;
               }
            }

            return maxLength;
        }

        return 0;

    }



}

