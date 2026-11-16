import java.util.List;
import java.util.ArrayList;

class MinStack {
List<Integer> minStack;
List<Integer> al;
    public MinStack() {
        al = new ArrayList<>();
        minStack = new ArrayList<>();
    }
    
    public void push(int value) {
        al.add(value);
        if(minStack.isEmpty() || value <= minStack.get(minStack.size()-1)){
            minStack.add(value);
        }
    }
    
    public void pop() {
        if(al.isEmpty()) return;
        int remove = al.remove(al.size()-1);
        if(remove == minStack.get(minStack.size()-1)){
            minStack.remove(minStack.size()-1);
        }
    }
    
    public int top() {
        if(al.size() == 0) return -1;
        return al.get(al.size()-1);
        
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }

    public boolean isEmpty(){
        return al.size() == 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */