package Medium;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        StringAnagrams sb = new StringAnagrams();
        if (s1.length()  > s2.length())  {
            return false;
        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s.append(s2.charAt(i));
        }

        if (sb.isAnagram(s.toString(), s1)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            s.deleteCharAt(0);
            s.append(s2.charAt(i));

            if(sb.isAnagram(s.toString(), s1))   {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }
}
