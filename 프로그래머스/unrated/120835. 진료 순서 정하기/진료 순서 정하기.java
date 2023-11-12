import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] emer_copy = new int[emergency.length];
        Map<Integer, Integer> emer = new HashMap<>();

        for(int i = 0; i < emergency.length; i++) {
            emer_copy[i] = emergency[i];
        }

        Arrays.sort(emergency);
        for(int i = 0; i < emergency.length; i++) {
            emer.put(emergency[i], emergency.length-i);
        }

        for(int i = 0; i < emer_copy.length; i++) {
            emer_copy[i] = emer.get(emer_copy[i]);
        }
        return emer_copy;
    }
}