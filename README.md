# Encoder-Decoder-Revitalized

A super-simple tool for scrambling your letters into a substitution cipher.
Just provide 90 "encodements" which will represent the letters, and the program will encipher your text. 

A fun example below is using emojis as encodements: 

import java.util.Scanner;

public class EmojEncoder {
    public static void main(String[] args) {

        String t = getText();
        Scanner scanner = new Scanner("INPUT");

        char[] standards = {
                '1','2','3','4','5','6','7','8','9','0','-','=','q','w','e','r','t','y','u','i','o','p','[',']', 'a' , 's','d','f','g','h','j','k','l',';', 'z','x','c','v','b','n','m','.','/',
                '!','@','#','$','%','^','&','*','(',')','_','+', 'Q','W','E','R','T','Y','U','I','O','P','{','}' ,'A','S','D','F','G','H','J','K','L',':','"','|','Z','X','C','V','B','N','M','<','>','?','œ'
        };
        String[] encodements = {
                "😀", "😃", "😄", "😁", "😆", "😅", "😂", "🤣", "🥲", "☺️", "😊", "😇", "🙂", "🙃", "😉", "😌", "😍", "🥰", "😘", "😗", "😙", "😚", "😋", "😛", "😝", "😜", "🤪", "🤨", "🧐", "🤓", "😎", "🥸", "🤩", "🥳", "😏", "😒", "😞", "😔", "😟", "😕", "🙁", "☹️", "😣", "😖", "😫", "😩", "🥺", "😢", "😭", "😤", "😠", "😡", "🤬", "🤯", "😳", "🥵", "🥶", "😱", "😨", "😰", "😥", "😓", "🤗", "🤔", "🤭", "🤫", "🤥", "😶", "😐", "😑", "😬", "🙄", "😯", "😦", "😧", "😮",
                "😲", "🥱", "😴", "🤤", "😪", "😵", "🤐", "🥴", "🤢", "🤮", "🤧", "😷", "🧠", "🧘🏻‍"
        };
        String encoded = "";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == ' ') {
                encoded += ' ';
            }
            for (int x = 0; x < standards.length; x++) {
                char standard = standards[x];
                String encodement = encodements[x];
                if (c == standard) {
                    encoded += encodement;
                }
            }
        }
        System.out.println(encoded);
    }
    public static String getText() {
        String text =
               "You are an awesome friend! You are so patient in teaching CS, you are so open to helping anyone, and you are one of the liveliest people I know. You radiate energy! Last but not least, here are a few random characters to throw you off: 12345ui09ughj. Also, now here's some extra text to see how W3LL !T P3RF()R^^$ W17|-| ()|)|) (|-|/|R/|(_73R$__________?œ";

        return text;
    }
}

The outcome is: 

😥😙😘 😝😌😉 😝😕 😝🙃😉😜😙🙁😉
🤨😌😗😉😕🤪😖 😥😙😘 😝😌😉 😜😙 😚😝😍😗😉😕😍
😗😕 😍😉😝😞🤓😗😕🧐 😵😐 🥰😙😘 😝😌😉 😜😙
😙😚😉😕 😍😙 🤓😉🤩😚😗😕🧐 😝😕🥰😙😕😉 😝😕🤪 
🥰😙😘 😝😌😉 😙😕😉 😙🤨 😍🤓😉 🤩😗😔😉🤩😗😉😜😍
😚😉😙😚🤩😉 🤗 🥸😕😙🙃☹️ 😥😙😘 😌😝🤪😗😝😍😉 
😉😕😉😌🧐🥰😖 😮😝😜😍 😟😘😍 😕😙😍 🤩😉😝😜😍 
🤓😉😌😉 😝😌😉 😝 🤨😉🙃 😌😝😕🤪😙🙁 😞🤓😝😌😝😞😍😉😌😜 
😍😙 😍🤓😌😙🙃 🥰😙😘 😙🤨🤨😲 😀😃😄😁😆😘😗☺️🥲😘🧐🤓😎☹️ 
😶🤩😜😙 😕😙🙃 🤓😉😌😉😜 😜😙🙁😉 😉😒😍😌😝 😍😉😒😍 😍😙
😜😉😉 🤓😙🙃 🥶😄😮😮 😖😰 🤭😄😨😬😡🤬😨😭😭🥺 🥶😀😂😴😊😴 
😡🤬😴🤬😴🤬 😡😴😊😴😣😴😨😣😴😡🤯😂😄😨🥺🤯🤯🤯🤯🤯🤯🤯🤯🤯🤯🧠🧘🏻‍

Looks psychedelic! Who would ever guess that this is really your cipher?!


