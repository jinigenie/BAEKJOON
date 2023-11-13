import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0) {
                res.add(arr[i]);
            }
        }

        if(res.size() == 0){
            int[] result = {-1};
            return result;
        } else {
            int[] result = new int[res.size()];
            for(int i = 0; i < res.size(); i++) {
                result[i] = res.get(i);
            }
            Arrays.sort(result);
            return result;
        }
    }
}