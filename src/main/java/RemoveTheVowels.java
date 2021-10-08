package main.java;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveTheVowels {
    public static void main(String[] args) {

        String sourceText = "Hey, learn REGEX it is the funniest thing in the week!";
        removeVowels(sourceText);
    }

    public static void removeVowels(String sourceText) {

        String modSourceTex = sourceText.toLowerCase();

        Pattern pt = Pattern.compile("[aeiou]");
        Matcher mt = pt.matcher(modSourceTex);

        if(mt.find()) {
            System.out.println(modSourceTex.replaceAll("[aeiou]", "" ));
        } else {
            System.out.println("OK");
        }

    }
}
