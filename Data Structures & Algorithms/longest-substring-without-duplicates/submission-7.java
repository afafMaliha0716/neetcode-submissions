class Solution {
    public int lengthOfLongestSubstring(String s) {
        // want to track the start index of the one we are at so far
        // when something repeats remove from hashmap and start the index to after that character

        int startIdx = 0;
        char[] chars = s.toCharArray();
        Set<Character> letters = new HashSet<>();
        if(chars.length == 1){
            return 1;
        }
        int maxL = 0;
        for(int i = 0; i<chars.length; i++){
            if(letters.contains(chars[i])){
                
                for(int j = startIdx; j < i; j++){
                    letters.remove(chars[j]);
                    if(chars[j]==chars[i]){
                        startIdx = j+1;
                        break;
                    }
                }
            }
            
            letters.add(chars[i]);
            maxL = Math.max(maxL, letters.size());
        }
        return maxL;
            

        }
    }

