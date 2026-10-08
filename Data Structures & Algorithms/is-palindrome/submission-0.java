class Solution {
    public boolean isPalindrome(String s) {
        // make an array of strings form beginning and array of strings starting from end and see if theyre equal
        s = s.toLowerCase();
        List<Character> front = new ArrayList<>();
        for(int i=0; i< s.length(); i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                front.add(s.charAt(i));
            }
        }
        List<Character> back = new ArrayList<>();
        for(int i=s.length()-1; i>=0; i--){
            if (Character.isLetterOrDigit(s.charAt(i))){
                back.add(s.charAt(i));
            }
        }
        System.out.println(front.toString());
        return front.equals(back);
    }
}
