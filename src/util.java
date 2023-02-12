public class util {
    public static boolean isPalindrome(String word){
        boolean check = true;
        int tam = word.length();
        int inverseIndex;
        word = word.toLowerCase();

        for(int i = 0; i <  tam; i++){
            inverseIndex = tam - (i+1);
            if(word.charAt(i) != word.charAt(inverseIndex)){
                check = false;
                break;
            }
        }

        return check;
    }
}
