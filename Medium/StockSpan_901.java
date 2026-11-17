import java.util.Stack;

class StockSpanner {

    Stack<int[]> stack;
    int index;  


    public StockSpanner() {
        stack = new Stack<>();
        index = 0;
    }
    
    public int next(int price) {
        int[] temp = {index,price};

        while(stack.size() > 0 && stack.peek()[1] <= price){
            stack.pop();
        }

        int ans;
        if(stack.isEmpty()){
            ans = index + 1;
        }else{
            ans = index - stack.peek()[0];
        }

        
        stack.push(temp);
        index ++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */