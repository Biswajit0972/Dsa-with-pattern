package Medium;


import java.util.ArrayList;
import java.util.List;

public class StringAnagrams {
    public  List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
           return res;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < p.length(); i++) {
            sb.append(s.charAt(i));
        }

        if (isAnagram(sb.toString(), p)) {
            res.add(0);
        }

        int left = 0;
        int x  = p.length();
        for (int i = x; i < s.length(); i++) {

            sb.deleteCharAt(0);

            sb.append(s.charAt(i));

            if (isAnagram(sb.toString(), p)) { // O(p)
                res.add(left + 1);
            }
            left++;
        }

        return res;
    }


    public  boolean isAnagram (String s, String p) {

        if (s.length() != p.length()) {
            return false;
        }

        int [] count = new int[26];

        for (int i = 0; i < s.length(); i++) { // O(s)
            count[s.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }

        for (int num :  count) { // O(26)
            if (num > 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
