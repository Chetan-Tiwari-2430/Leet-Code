class CustomStack {
    int top;
    int[] stack;
    int size = 0;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        top = -1;
    }
    
    public void push(int x) {
        if(top == stack.length -1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
        size++;
    }
    
    public int pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int temp = stack[top];
        top--;
        size--;
        return temp;
    }
    
    public void increment(int k, int val) {
        
    int limit;

    if (k > size) {
        limit = size;
    } else {
        limit = k;
    }

    for (int i = 0; i < limit; i++) {
        stack[i] = stack[i] + val;
    }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */