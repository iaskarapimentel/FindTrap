package main.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindTrap {
    public static void main(String[] args) {

        String source = "Hey, did you think there is a TRAP!!!";
        String regex = "trap";
        findTrap(source, regex);
    }

    public static void findTrap(String sourceText, String regex){

        String strSource = sourceText.toLowerCase();
        Pattern pt = Pattern.compile(regex);

        Matcher mt = pt.matcher(strSource);

        if (mt.find()) {
            System.out.println("BOO!!!");
        } else {
            System.out.println("Relax, there's no trap.");
        }
    }
}
