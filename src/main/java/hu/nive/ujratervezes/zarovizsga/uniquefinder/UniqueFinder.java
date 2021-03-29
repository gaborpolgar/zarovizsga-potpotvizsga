package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.*;

public class UniqueFinder {
    
    public List<Character> uniqueChars(String s){
        if(s == null){
            throw new IllegalArgumentException("The text argument not to be null!");
        }
        char [] charArray = s.toCharArray();
        s.lines();
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            charSet.add(charArray[i]);
        }
        List<Character> result = new ArrayList<>(charSet);
        return result;
    }
}
