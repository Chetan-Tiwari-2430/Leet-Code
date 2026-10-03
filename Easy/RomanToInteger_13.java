import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num = map.get(s.charAt(s.length()-1));
        int j = s.length() - 1;
        for(int i = s.length() - 2; i >= 0; i--){
            int curr = map.get(s.charAt(i));
            int prev = map.get(s.charAt(j));
            if(curr < prev){
                num -= curr;
            }else{
                num += curr;
            }
            j--;
        }
        return num;
    }
}