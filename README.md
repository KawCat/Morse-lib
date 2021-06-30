# What is "Morse-lib"?
 A library for convert a string to morse code and vice-versa in Java

## How to use?
 First you need import the main file and the exception,
 Example:
 ```java
  import kaw.morse.Converter;
  import kaw.morse.NotFoundInAlphabetException;
 ```
 
 And later of that you can use: 
 ```java
  try{
      System.out.println(Converter.stringToMorse("Hello world!"));
  }catch(NotFoundInAlphabetException ex){
      ex.printStackTrace();
  }
 ```
 Output: `.... . .-.. .-.. --- ....... .-- --- .-. .-.. -.. -.-.--`

 If you want convert Morse code to string, you can use:
 ```java
  try{
      System.out.println(Converter.morseToString(".... . .-.. .-.. --- ....... .-- --- .-. .-.. -.. -.-.--"));
  }catch(NotFoundInAlphabetException ex){
      ex.printStackTrace();
  }
 ```
 Output: `hello world!`

### [JavaDoc](https://morse-java-lib.ml)

### TODOs:
 - [ ] MorseCodes object
 - [ ] Make this lib aren't only for Morse code
