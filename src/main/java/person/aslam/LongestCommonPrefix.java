package person.aslam;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] myArray = {"abab", "aba", ""};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(myArray));
    }

    public String longestCommonPrefix(String[] strs) {
        String matchString = "";
        StringBuffer currentMatchString = new StringBuffer();
        boolean endReached = false;
        boolean unmatched = false;
        if(strs.length < 1 || strs[0].length() < 1) {
            return matchString;
        }
        for(int i = 0; !endReached; i++) {
            String currChar = strs[0].charAt(i) + "";
            for(int j=0; j < strs.length; j++) {
                if(i >= strs[j].length() - 1) {
                    endReached = true;
                }
                if(strs[j].length() == i || !currChar.equals(strs[j].charAt(i)+"")) {
                    unmatched = true;
                    break;
                }
            }
            if (!unmatched) {
                currentMatchString.append(currChar);
                if(matchString.length() < currentMatchString.length()) {
                    matchString = currentMatchString.toString();
                }
            }
        }
        return matchString;
    }
}
