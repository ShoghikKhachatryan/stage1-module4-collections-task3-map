package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        String[] words = sentence.toLowerCase(Locale.ROOT).split("[ . ,]");

        Map<String, Integer> result = new HashMap<>(words.length);

        for (int i = 0 ; i < words.length; i++) {
            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                    count++;
                }
            }

            if (!words[i].isEmpty()) {
                result.put(words[i], count);
            }
        }

        return result;
    }
}
