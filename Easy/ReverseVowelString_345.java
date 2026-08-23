class ReverseVowelString_345 {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j){
            boolean flagI = true;
            boolean flagJ = true;

            if(ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U' &&
            ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'o' && ch[i] != 'u' && ch[i] != 'i'){
                i++;
                flagI = false;
            }
            if(ch[j] != 'A' && ch[j] != 'E' && ch[j] != 'I' && ch[j] != 'O' && ch[j] != 'U' &&
            ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'o' && ch[j] != 'u' && ch[j] != 'i'){
                j--;
                flagJ = false;
            }
            if(flagI && flagJ){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}