# What is "Morse-lib"?
 A library for convert a string to morse code and vice-versa in Java

## How to use?
 First you need import the main file and the exception,
 Example:
 ```java
  import morse.Morse;
  import morse.NotFoundInAlphabetException;
 ```
 
 And later of that you can use: 
 ```java
  try{
      System.out.println(Morse.stringToMorse("Hello world!"));
  }catch(NotFoundInAlphabetException ex){
      ex.printStackTrace();
  }
 ```
 Output:
 `.... . .-.. .-.. --- ....... .-- --- .-. .-.. -.. -.-.--`

 If you want convert Morse code to string, you can use:
 ```java
  try{
      System.out.println(Morse.morseToString(".... . .-.. .-.. --- ....... .-- --- .-. .-.. -.. -.-.--"));
  }catch(NotFoundInAlphabetException ex){
      ex.printStackTrace();
  }
 ```
 Output:
 `hello world!`
