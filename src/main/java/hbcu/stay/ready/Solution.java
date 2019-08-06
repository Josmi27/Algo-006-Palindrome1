package hbcu.stay.ready;

import java.util.HashMap;

public class Solution {

    public String isPalindrome(String input){
        HashMap<Character, Integer> letterTracker = new HashMap<Character, Integer>();

        char[] charredInput = input.toCharArray();
        for (char c : charredInput) {
            if(!letterTracker.containsKey(c)) {
                letterTracker.put(c, 1);
            }
            else {
                int currentValue = letterTracker.get(c);
                currentValue++;
                letterTracker.put(c,currentValue);
            }
        }

        int limit = 0;
        for (int values : letterTracker.values()) {
            if(values%2 == 1) {
                limit++;
            }
        }

        if (limit > 1) {
            return "NO";
        }

        return "YES";
    }

}
