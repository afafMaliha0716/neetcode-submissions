class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();

        for(char c: characters){
            if(c==')' || c == '}' || c == ']' ){

                // if teh stack is empty then this is automatically invalid
                if(stack.isEmpty()){
                    return false;
                } else {
                    char p = stack.pop();

                    // any of these combinations are invalid
                    if((c == ')' && p!= '(') || (c == '}' && p != '{')
                     || (c == ']' && p != '[')){
                        return false;
                    }
                }
            } else {
                stack.push(c);
            }
            
        }
        if(!stack.isEmpty()){
            return false;
        } 
        return true;
    }
}
