package chapter8;

public class TextProcessor {


    public static void main(String[] arg){
        //countWords("I love Test Automation University");
        //reverseSring("Hello TAU");
    }

    /**
     * Splits a Stirng into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String mesage = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(mesage);

        for(int i = 0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Print a String in reverse order
     * @param text String to reverse
     */
    public static void reverseSring(String text){
        for(int i=text.length()-1; i>= 0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        String[] modifiedText = new String[text];

    }
}

