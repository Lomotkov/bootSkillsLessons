package com.example.MyBookShopApp.services;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<String> getListEngAlphabet() {
        List<String> alphabet = new ArrayList();
        for(char c = 'A'; c <= 'Z'; ++c) {
            alphabet.add(String.valueOf(c));
        }
        return alphabet;
    }
}
