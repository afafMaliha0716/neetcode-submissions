class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> curSubstring = new HashSet<>();
        char[] characters = s.toCharArray();

        // go thorugh characters and add to the set. if the set already has that letter, remove the characters until that point. keep track of teh start index of your current substring
        int maxL = 0;
        int startIdx = 0;
        for(int i = 0; i < characters.length; i++){
            // add it to the set
            if(curSubstring.contains(characters[i])){
                // the set does contain it. We need to remove the letters to this point
                // maxL = Math.max(curSubstring.size(), maxL);
                for(int j = startIdx; j<characters.length; j++){
                    curSubstring.remove(characters[j]);
                    if(characters[j]==characters[i]){
                        startIdx = j+1;
                        break;
                    }
                    
                }
            } 
            
            curSubstring.add(characters[i]);
            maxL = Math.max(curSubstring.size(), maxL);
        }

        return maxL;
    }
}
