import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class DidTheyCrackIt {
    public static void main (String[]args) throws FileNotFoundException {
        String attack = "GTMHFQUIOLVBPDCSXKENRJAWZY";
        File cipher = new File("/Users/cole.henrich/IdeaProjects/Encoder-Revitalized/src/DidTheyCrackIt.txt");
        check(attack, cipher);
    }
    /**
     * When someone provides a suggested key for the cipher,
     * check(attack, cipher) will check if the key is valid and able to decipher the cipher.
     *
     * @param attack the attacker's suggested key for a-z alphabet
     * (that is, the first char in attack reps a, second, b, etc);
     *
     * @param cipher the File to be deciphered with attack.
     *
     * @throws FileNotFoundException if cipher does not exist or can't be found.
     */
    private static void check(String attack, File cipher) throws FileNotFoundException {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> checkSolved = new ArrayList<>(Arrays.asList("of","to","in","it","is","be","as","at","so","we","he","by","or","on","do","if","me","my","up","an","go","no","us","am","the","and","for","are","but","not","you","all","any","can","had","her","was","one","our","out","day","get","has","him","his","how","man","new","now","old","see","two","way","who","boy","did","its","let","put","say","she","too","use","that","with","have","this","will","your","from","they","know","want","been","good","much","some","time"));
        Scanner s = new Scanner(cipher);
        int lencount = 0;
        int solved01 = 0;
        while(s.hasNext()){
            String string = s.next();
            if (string != null) {lencount++;}
            StringBuilder replace = new StringBuilder();
            for(int i = 0; i < string.length(); i++){
                char character = string.charAt(i);
                for (int j = 0; j < attack.length(); j++) {
                    char Attack = attack.charAt(j);
                    char Replace = alphabet.charAt(i);
                    if (character == Attack) {
                        replace.append(Replace);
                        break;
                    }
                }
            }
            for (String check : checkSolved) {
                if (replace.toString().equalsIgnoreCase(check)) {solved01++;}
            }
            p(replace);
        }
        p("length of guess: "+ lencount);
        p("common Ngraphs: "+ solved01);
        if (solved01 > lencount / 5) {p("solved with " + solved01 + " attesting Ngraphs");}
        else{p("They did not crack it!");}
    }
    public static void p(Object o) {
        System.out.println(o);
    }
}
