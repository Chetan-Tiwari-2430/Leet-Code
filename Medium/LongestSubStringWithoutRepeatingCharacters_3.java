import java.util.Set;
import java.util.HashSet;
class LongestSubStringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return s.length();
        }
        String largest = "";
        int st = 0;
        int end = 0;
        while(end < s.length()){
            String str = s.substring(st,end+1);
            if(check(str)){
                if(largest.length() <= str.length()){
                    largest = str;
                }
                end++;
            }else{
                st++;
            }
        }
        return largest.length();
    }
    public boolean check(String str){
        char[] ch = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char c : ch){
            set.add(c);
        }

        return ch.length == set.size();
    }
}