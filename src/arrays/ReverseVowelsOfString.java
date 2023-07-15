class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char letters[] = s.toCharArray();
        int l = 0, r = letters.length - 1;

        while(l<=r) {


            if(isVowel(letters[l]) && isVowel(letters[r])){
                char temp = letters[l];
                letters[l] = letters[r];
                letters[r] = temp;
                l++;
                r--;
            } else {
                if(!isVowel(letters[l])) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return String.valueOf(letters);
    }

    private boolean isVowel(char c) {
        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'O':
            case 'I':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
