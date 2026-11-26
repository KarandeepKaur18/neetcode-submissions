class MinStack {

    Stack<Integer> mainstack;
    Stack<Integer> minstack;

    public MinStack() {
        mainstack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);

        if(minstack.isEmpty()){
            minstack.push(val);
        }else{
            int currentmin = Math.min(val,minstack.peek());
            minstack.push(currentmin);
        }
    }
    
    public void pop() {
        mainstack.pop();
        minstack.pop();
    }
    
    public int top() {
        return mainstack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}
