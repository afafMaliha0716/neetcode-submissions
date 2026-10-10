class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        // loop through the chars in string
        char[] chars = s.toCharArray();
        for(char c: chars){

            // if its an open bracket, push it to the stack
            if(c=='(' || c=='[' || c=='{' ){
                stack.push(c);
            } else {

                // then it must be some type of closing bracket
                // check if stack is empty
                if(stack.isEmpty()){
                    return false;
                } 
                char cur = stack.pop();
                if(c == ')'){
                    if( cur != '('){
                        return false;
                    }
                } else if (c == '}'){
                    if( cur != '{'){
                        return false;
                    }
                } else if (c == ']'){
                    if( cur != '['){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
        
    }
}
