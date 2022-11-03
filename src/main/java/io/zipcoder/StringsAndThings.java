package io.zipcoder;


//import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        String[] words = input.split(" ");
        Integer freq = 0;
        Integer arrLength = words.length;

        for (int i = 0; i < arrLength; i++) {
            if (words[i].charAt(words[i].length() - 1) == 'y' || words[i].charAt(words[i].length() - 1) == 'z') {
                freq++;
            } else ;
        }
        return freq;
//        String[] words = input.split(" ");
//        Integer freq = 0;
//        char ch1 = 'y';
//        char ch2 = 'z';
//
//        for (int i = 0; i < words.length; i++) {
//            if (ch1 == words.length - 1) {
//                freq++;
//            }
//        } return freq;

//        int counter = 0;
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'y' ) {
//                counter++;
//                if (input.charAt(i) == 'z') {
//                    counter++;
//                } else {
//                }
//            }
//        }
//        return counter;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String newString = base.replaceAll(remove.toUpperCase(), "");
        String finalString = newString.replaceAll(remove.toLowerCase(), "");
//        String newString = base.replaceAll(remove, "");
        return finalString;
//        return null;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        Integer isCount = 0;
        Integer notCount = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
                isCount++;
            } else if (input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') {
                notCount++;
            }
        }
        if (isCount == notCount) {
            return true;
        } else {
            return false;
        }

//        return null;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
//        boolean boo = false;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'g' && input.charAt(i + 1) != 'g') {
                if (input.charAt(i) == 'g' && input.charAt(i - 1) != 'g') {
                    return false;
                } else {
                }
            }
        }
        return true;
//            if (input.charAt(i) != 'g' && input.charAt(i +1) != 'g') {
//                continue;
//            } else if (input.charAt(i) == 'g' && input.charAt(i + 1) != 'g') {
//                boo = false;
//            } else if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
//                boo = true;
//            }
//        } return boo;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        Integer freq = 0;

        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == input.charAt(i + 1) && input.charAt(i + 1) == input.charAt(i + 2)) {
                freq++;
            }
        }
        return freq;
    }
}
