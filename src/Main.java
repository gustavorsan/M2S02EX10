import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("osso","ana","radar","onibus","Osso","assa");

        for(String word : words){
            System.out.println(word+" Palidrome: "+util.isPalindrome(word));
        }

    }
}