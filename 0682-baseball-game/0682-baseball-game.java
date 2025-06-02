class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();  
                }
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    stack.push(2 * stack.peek());  
                }
            } else if (op.equals("+")) {
                if (stack.size() >= 2) {
                    int last = stack.pop();
                    int newScore = last + stack.peek();
                    stack.push(last);  
                    stack.push(newScore);
                }
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
