package mian.day01;

import java.util.HashMap;

public class subject03 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (;end < n;end ++){
            char alpha = s.charAt(end);
            if (hashMap.containsKey(alpha)){
                start = Math.max(hashMap.get(alpha),start);
            }
            ans = Math.max(ans, end - start + 1);
            hashMap.put(s.charAt(end), end + 1);

        }
        return ans;
    }
}
