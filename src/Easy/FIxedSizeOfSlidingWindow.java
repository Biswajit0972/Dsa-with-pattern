package Easy;

import java.util.HashMap;

public class FIxedSizeOfSlidingWindow {
//    public static int countGoodSubstrings(String s) {
//        if (s.length() < 3) return 0;
//
//        int countGoodPairs = 0;
//        HashMap<Character, Integer> frequency = new HashMap<>();
//        for (int i = 0; i < 3; i++) {
//            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
//        }
//
//        if (frequency.size() == 3) countGoodPairs++;
//
//        for (int i = 3; i < s.length(); i++) {
//            char removeCharacter = s.charAt(i - 3);
//            frequency.put(removeCharacter, frequency.get(removeCharacter) - 1);
//
//            if (frequency.get(removeCharacter) == 0) {
//                frequency.remove(removeCharacter);
//            }
//
//            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
//
//            if (frequency.size() == 3) countGoodPairs++;
//        }
//        return countGoodPairs;
//
//        /*
//        * 1. Time complexity is here O(n). because in the first for loop we iterate  constant size of 3. O(3)
//        * Second loop We iterate string length - 3. O(n-3). But -3 is not consider for 1M size.
//        * Using HashMap space O(n)
//        * */
//    }

    public static int countGoodSubstrings(String s) {
        int [] frequency = new int[26];
        int countGoodPairs = 0;

        for (int i = 0; i < 3; i++) {
            int currentIndex = s.charAt(i) - 'a';
            frequency[currentIndex]++;
        }

        if (isValid(frequency)) {
            countGoodPairs++;
        }

        for (int i = 3; i < s.length() ; i++) {
            int removeIndex = s.charAt(i-3) - 'a';
            frequency[removeIndex]--;

            int appenIndex = s.charAt(i) - 'a';
            frequency[appenIndex]++;

            if (isValid(frequency)) {
                countGoodPairs++;
            }
        }

        return countGoodPairs;
    }

    private static boolean isValid (int [] count) {
        for (int c : count) {
            if (c > 1) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        String str = "xyzzaz";
        System.out.println(countGoodSubstrings(str));
    }
}
