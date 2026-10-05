class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // first you need to go through each string and see which ones are anagrams of each other
        // first instinct: what you could do is go through each string and loop through the letters. then maybe you create a hashmap. what im thinking is when you first encounter a word put the letters in alphabetical order and make it a key in the map, the values of the map can be ar arraylist which we put the actual words. when you getto a new word and you put it in alphabetical order and chekc the map and see if it contains it you can add it to the list in values fo rthat key.
        Map<String, List<String>> groups = new HashMap<>();
        for(String word: strs){
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            } 
            groups.get(key).add(word);


        }
        return new ArrayList<>(groups.values());
    }
}