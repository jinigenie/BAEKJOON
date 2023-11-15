import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int min = arr[0];
        if (arr.length == 1) {
            res.add(-1);
        } else {
            for(int i = 1; i < arr.length; i++) {
                min = min > arr[i] ? arr[i] : min;
            }
            for(int n : arr) {
                if(n == min) continue;
                res.add(n);
            }
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}