class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String word: strs){
            sb.append(word.length());
            sb.append('#');
            sb.append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // loop though the string
        // read in the num for the length of the string
        // read in special character
        // then loop over that length and get that word and add it to the list
        List<String> result = new ArrayList<>();
        int i = 0;
        while ( i < str.length()){
             StringBuilder strLength = new StringBuilder();
            int index = 0;
            for(int j=i; j<str.length(); j++){
                if(str.charAt(j)!=('#')){
                    strLength.append(str.charAt(j));
                } else{
                    index = j;
                    break;
                }
            }
            // now that we have the length we can make a string from after thh special character to the length we have
            int len = Integer.parseInt(strLength.toString());
            int start = index + 1;
            int end = index + 1 + len;
            String word = str.substring(start, end); 
            result.add(word);
            i= end; // dont have to add the character because it increments at the end
        }
        return result;

    }
}
