package com.example.CodewarsPractice.sixkyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
* */

public class ConvertStringToCamelCase {
    public String solution(String s){
        if (s.isEmpty()) return s;
        boolean nextCap = false;

        //if first case is Cap then Cap
        if (Character.isUpperCase(s.charAt(0))) nextCap = true;

        String newString = "";

        for (int i=0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                if (nextCap){
                    newString = newString + Character.toUpperCase(s.charAt(i));
                    nextCap = false;
                }
                else newString = newString + s.charAt(i);
            }
            //if current character is not letter then next character should be cap
            else nextCap = true;

        }

        return newString;
    }

    public String bestSolution(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
