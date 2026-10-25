class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        char[] string = s.toCharArray();
        int indexOfStart = 0;
        for(int i =0; i< string.length; i++){
            char c = string[i];
            // loop through and add to the set until one of them repeats
            if(!set.contains(c)){
                // add it to the set
                set.add(c);
                maxLength = Math.max(set.size(), maxLength);
            } else {
                set.add(c);
                // need to loop through and remove the letters before this from set
                // start from cur index of start and remove from set and update start
                for(int j= indexOfStart; j< string.length; j++){
                    if(string[j] == c){
                        indexOfStart = j+1;
                        break;
                    } else {
                        set.remove(string[j]);
                    }
                }
                
            }
        }
        return maxLength;
    }
}
