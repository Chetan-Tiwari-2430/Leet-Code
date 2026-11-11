import java.util.Stack;
class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            int n = ch[i] - 48;
            if(n >= 0 && n <= 9){
                stack.pop();
            }else{
                stack.add(ch[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}