package funwithjavastringimprovements;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains examples using Java 11's new String features.
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Examples of the String.isBlank() method.
         */
        isBlankExamples();

        /**
         * Example of String.lines() method.
         */
        linesExamples();

        /**
         * Example of String.repear() method.
         */
        repeatExamples();
    }

    /**
     * String.isBlank() returns a boolean value indicating
     * whether or not a string is empty or contains only white space.
     */
    public static void isBlankExamples(){
        String emptyString = "";
        System.out.println(emptyString.isBlank()); //true

        String populatedString = "Joe Cool";
        System.out.println(populatedString.isBlank()); //false

        String whiteSpaceString = " ";
        System.out.println(whiteSpaceString.isBlank()); //true
    }

    /**
     * String.lines() returns a Stream of lines extracted from a string.
     * The example below collects that stream into a List.
     */
    public static void linesExamples(){
        String stringOfLines = "one\ntwo\nthree";
        System.out.println(stringOfLines);
        Stream<String> streamOfLines = stringOfLines.lines();
        List<String> listOfLines = streamOfLines.collect(Collectors.toList());
        System.out.println(listOfLines);
    }

    /**
     * Repeats a given string a specified number of times.
     */
    public static void repeatExamples(){
        String stringToRepeat = "*".repeat(10);
        System.out.println(stringToRepeat); //prints **********
    }

}