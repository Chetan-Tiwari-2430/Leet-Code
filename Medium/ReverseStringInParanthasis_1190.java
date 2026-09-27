import java.util.Stack;
public class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        String temp = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){    
            char ch = s.charAt(i);
            if(ch != ')'){
                stack.push(ch);
            }else{
                char chr = stack.pop();
                while(chr != '('){
                    sb.append(chr);
                    chr = stack.pop();
                }
               temp = sb.toString();
              char[] charArr = temp.toCharArray();
              int j = 0;
              while(j < charArr.length){
                stack.push(charArr[j]);
                j += 1;
              }
              sb = sb.delete(0,temp.length());
            }
        }
        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}
