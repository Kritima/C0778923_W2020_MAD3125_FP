package com.lambton.c0778923_w2020_mad3125_fp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatter
{

    private static Formatter repoObj = new Formatter();
    public static Formatter getInstance() {
        return repoObj;
    }
    private Formatter()
    { }


    public String doubleFormatter(Double d)
    {
        return String.format("$ " + "%,.2f", d);
    }

    public boolean emailValidation(String s) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }

    public boolean mobileValidation(String s)
    {
        if(s.length() == 10)
        {
            return true;
        }
        return false;
    }

    public String gbFormatter(Integer s)
    {
        return s + " GB";
    }

    public String minsFormatter(String s)
    {
        return s + " MINS";
    }

    public String gbFormatter(Double s)
    {
        return s + " GB";
    }
}
