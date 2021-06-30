package morse;

/**
 * @author Kaw
 * @version 1.0.0
 */
public class Morse {
    private static final String[] STRING_ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", "?", "'", "!", "/", "(", ")", "&", ":", ";", "=", "+", "-", "_", "\"", "$", "@", " "};
    private static final String[] MORSE_ALPHABET = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--..", ".----.", "-.-.--", "-..-.", "-.--.", "-.--.-", ".-...", "---...", "-.-.-.", "-...-", ".-.-.", "-.....-", "..--.-", ".-..-.", "...-..-", ".--.-.", "......."};
    private static boolean founded;
    private static int i1;
    private static int i2;
    private static int i;
    
    /**
     * @param string A string (A-Z, a-z, 0-9, [.], [,], [?], ['], [!], [/], [(], [)], [&], [:], [;], [=], [+], [-], [_], ["], [$] and [@])
     * @return Returns the conversion results from string to Morse code ([.], [-])
     * @throws NotFoundInAlphabetException A character is not found in the Morse code alphabet
     */
    public static String stringToMorse(String string) throws NotFoundInAlphabetException{
        char[] chars = string.toCharArray();
        int[] index = new int[chars.length];
        
        for (i1 = 0; i1 < chars.length; i1++) {
            founded = false;
            
            for (i2 = 0; i2 < STRING_ALPHABET.length; i2++) {
                if(STRING_ALPHABET[i2].equalsIgnoreCase(Character.toString(chars[i1]))){
                    index[i1] = i2;
                    founded = true;
                    break;
                }
            }
            
            if(founded == false){
                index[i1] = -1;
            }
        }
        
        String morse = "";
        
        for (i = 0; i < index.length; i++) {
            if(index[i] == -1){
                throw new NotFoundInAlphabetException("The '" + Character.toString(chars[i]) + "' character is not found in the Morse code alphabet");
            }else{
                morse += MORSE_ALPHABET[index[i]] + " ";
            }
        }
        
        return morse.trim();
    }
    
    /**
     * @param morse A Morse code ([.], [-])
     * @return Returns the conversion results from Morse code to string (a-z, 0-9, [.], [,], [?], ['], [!], [/], [(], [)], [&], [:], [;], [=], [+], [-], [_], ["], [$] and [@])
     * @throws NotFoundInAlphabetException A Morse code not found in the string alphabet.
     */
    public static String morseToString(String morse) throws NotFoundInAlphabetException{
        String[] codes = morse.split(" ");
        int[] index = new int[codes.length];
        
        for (i1 = 0; i1 < codes.length; i1++) {
            founded = false;
            for (i2 = 0; i2 < MORSE_ALPHABET.length; i2++) {
                if (MORSE_ALPHABET[i2].equalsIgnoreCase(codes[i1])) {
                    index[i1] = i2;
                    founded = true;
                    break;
                }
            }
            if(founded == false){
                index[i1] = -1;
            }
        }
        
        String string = "";
        
        for (i = 0; i < index.length; i++) {
            if(index[i] == -1){
                throw new NotFoundInAlphabetException("Morse code \"" + codes[i] + "\" not found in the string alphabet");
            }else{
                string += STRING_ALPHABET[index[i]];
            }
        }
        
        return string.trim();
    }

    /*public static void main(String[] args) {
        String input = "Hello world!";
                
        String morse = null;
        String text = null;
                
        try {
            morse = Morse.stringToMorse(input);
            text = Morse.morseToString(morse);
        } catch (NotFoundInAlphabetException ex) {
            ex.printStackTrace();
        }
                
        //System.out.println("TEST:\nInput=" + input + "\nMorse=" + morse + "\nText=" + text);
    }*/
}
