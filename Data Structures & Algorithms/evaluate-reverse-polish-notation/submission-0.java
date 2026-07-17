

class Solution {
    public int evalRPN(String[] tokens) {
        // Create a Stack to store integers
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+")) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                stack.push(leftOperand + rightOperand);
                
            } else if (token.equals("-")) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                stack.push(leftOperand - rightOperand);
                
            } else if (token.equals("*")) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                stack.push(leftOperand * rightOperand);
                
            } else if (token.equals("/")) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                stack.push(leftOperand / rightOperand);
                
            } else {
                // If it's not an operator, it must be a number. 
                // Convert the string to an integer and push it to the stack.
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result will be the last remaining item in the stack
        return stack.pop();
    }
}