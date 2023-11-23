import java.util.Scanner;

public class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter (char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase character */
    Public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    Public static char getRandomDigitLetter() {
        return getRandomCharacter('0', '9');
    }

    /** Get a random character */
    Public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFF');
    }  
}
