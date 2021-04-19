/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lection4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 38068
 */
public class StringMatching {

    String line = "Some Error T So string Line! 2345 eee 58 er -38 is a Number such as some 34.56 rrr";
    Matcher matcher;

    public void showResult(String pattern) {
        matcher = Pattern.compile(pattern).matcher(line);
        System.out.println("==================");
        System.out.println("Line:");
        System.out.println(line);
        System.out.print("pattern: ");
        System.out.println(pattern);
        System.out.println("results:");
        while (matcher.find()) {
            System.out.print(matcher.start());
            System.out.println(" " + line.substring(matcher.start(), matcher.end()));
        }

        System.out.println("==================");

    }

    public void showResult(String pattern, String string) {
        matcher = Pattern.compile(pattern).matcher(string);
        System.out.println("==================");
        System.out.println("Line:");
        System.out.println(string);
        System.out.print("pattern: ");
        System.out.println(pattern);
        System.out.println("results:");
        while (matcher.find()) {
            System.out.print(matcher.start());
            System.out.println(" " + string.substring(matcher.start(), matcher.end()));
        }

        System.out.println("==================");

    }

}
