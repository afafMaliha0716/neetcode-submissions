class Solution {
    public int lengthOfLongestSubstring(String s) {
        // start from beginning and add characters to a set
        // if teh set contains it already mark the size of the set and start again from
        // the index after the repeated letter
        char[] chars = s.toCharArray();
        int max = 0;
        int startIdx = 0;
        Set<Character> substring = new HashSet<>();
        for(int i = 0; i < chars.length; i++){
            char cur = chars[i];
            if(substring.contains(cur)){
                // record the size of the substring
                
                // now loop through and remove the letters in the array until this char
                for(int j=startIdx; j < i; j++){
                    if(chars[j]== cur){
                        substring.remove(cur);
                        startIdx = j+1;
                        break;
                    } else {
                        substring.remove(chars[j]);
                    }
                }
            } 
            substring.add(cur);
            max = Math.max(substring.size(), max);
        }
        return max;
    }
}
