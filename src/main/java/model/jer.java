package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jer {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d{1}\\D{2}");
        Matcher matcher = pattern.matcher("e4d");
        System.out.println(matcher.matches());
    }
}
