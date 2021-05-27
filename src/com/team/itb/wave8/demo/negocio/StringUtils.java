package com.team.itb.wave8.demo.negocio;

public class StringUtils {

    public static String rpad(String word, char concatCharacter, int length) {
        for (int i = 0; i < length; i++) {
            word += concatCharacter;
        }
        return word;
    }

    public static String rtrim(String word) {
        int firstCharacterPosition = word.length();
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) == ' ') {
                firstCharacterPosition--;
            } else {
                break;
            }
        }
        return word.substring(0, firstCharacterPosition);
    }

    public static String ltrim(String word) {
        int firstCharacterPosition = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                firstCharacterPosition++;
            } else {
                break;
            }
        }
        return word.substring(firstCharacterPosition);
    }

    public static String trim(String word){
        return ltrim(rtrim(word));
    }

    public static int indexOfN(String word,char searchCharacter, int deep) throws Exception {
        if(deep <= 0){
            throw new Exception("Error la ocurrencia no es valida");
        }
        int deepFound = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == searchCharacter){
                deepFound++;
                if(deepFound == deep){
                    return i;
                }
            }
        }
        return -1;
    }
}
