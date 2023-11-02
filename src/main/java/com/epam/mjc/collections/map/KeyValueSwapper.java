package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>(sourceMap.size());
        for (Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            if (null != result.get(e.getKey()) && (e.getKey() >= result.get(e.getKey()))) {
                result.put(e.getValue(), result.get(e.getKey()));
            } else {
                result.put(e.getValue(), e.getKey());
            }
        }
        return result;
    }
}
