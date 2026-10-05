class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // loop through one string and add its letters to a map?
        // the letters can be keys and teh values is how many times it repeats
        // if both of them are equal maps then its an anagram?
        Map<Character, Integer> countS = new HashMap<>();
        for( char c: s.toCharArray()){
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> countT = new HashMap<>();
        for( char c: t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        return countS.equals(countT);
    }
}