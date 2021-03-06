package kaw.morse;

/**
 * Exception on not found in alphabet a character or Morse code
 * @author Kaw
 * @version 1.0.0
 */
public class NotFoundInAlphabetException extends Exception{
    private static final long serialVersionUID = 700L;
    
    /**
     * @param message A message to display on exception
     */
    public NotFoundInAlphabetException(String message){
        super(message);
    }
}
