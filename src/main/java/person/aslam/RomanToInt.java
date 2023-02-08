package person.aslam;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(new RomanToInt().romanToInt("IV"));
    }
    public int romanToInt(String s) {
        Map<String, Integer> symbolValueMap = Stream.of(new Object[][] {
                { "I", 1 },
                { "V", 5 },
                { "X", 10 },
                { "L", 50 },
                { "C", 100 },
                { "D", 500 },
                { "M", 1000 }
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        Map<String, String> specialHandling = Stream.of(new Object[][] {
                { "V", "I" },
                { "X", "I" },
                { "L", "X" },
                { "C", "X" },
                { "D", "C" },
                { "M", "C" }
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (String) data[1]));
        int result = 0;
        for(int i=0; i< s.length(); i++) {
            String chr = s.charAt(i) + "";
            String nextChr = "";
            if(i != s.length() - 1) {
                nextChr = s.charAt(i + 1) + "";
            }
            int value = symbolValueMap.get(chr);
            String spChr = specialHandling.get(nextChr);
            if(spChr != null && spChr.equals(chr)) {
                value = -(value);
            }
            result = result + value;
        }
        return result;
    }
}
