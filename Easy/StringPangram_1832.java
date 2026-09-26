class Solution {
    public boolean checkIfPangram(String sentence) {
        String str = "qwertyuiopasdfghjklzxcvbnm";
        for(int i = 0; i < str.length(); i++){
            if(sentence.indexOf(str.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}