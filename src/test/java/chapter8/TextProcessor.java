package chapter8;

public class TextProcessor {


    public static void main(String[] arg){
        //countWords("I love Test Automation University");
        //reverseSring("Hello TAU");
        addSpaces("HeyWorld!It'sMeLuongATuyen");
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
        StringBuilder modifiedText = new StringBuilder(text);

        for (int i=0 ; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}

