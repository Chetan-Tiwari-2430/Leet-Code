import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") ||
            str.equals("*") || str.equals("/")){

                char ch = str.charAt(0);
                int b = stack.pop();
                int a = stack.pop();
                int ans = 0;
                switch(ch){

                    case '+':
                        ans = a + b;
                        break;
                    case '-':
                        ans = a - b;
                        break;
                    case '*':
                        ans = a * b;
                        break;
                    case '/':
                        ans = a/ b;
                        break;
                }
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(str));
            }
            
        }
        return stack.pop();
    }
}