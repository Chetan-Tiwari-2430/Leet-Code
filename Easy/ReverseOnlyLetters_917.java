class ReverseOnlyLetters_917 {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length -1;
        while(i <= j){
            if(!isLetter(ch[i])){
                i++;
            }else if(!isLetter(ch[j])){
                j--;
            }else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    public boolean isLetter(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            return true;
        }
        return false;
    }
}