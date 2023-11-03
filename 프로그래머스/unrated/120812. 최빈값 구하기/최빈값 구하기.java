import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        Arrays.sort(array);
        int[] newArr = new int[array[array.length-1] + 1];

        for(int i = 0; i < array.length; i++) {
            newArr[array[i]]++;
        }

        int max = newArr[0];
        for(int i = 1; i < newArr.length; i++) {
            if(newArr[i] > max) {
                max = newArr[i];
                answer = i;
            } else if(max == newArr[i]) answer = -1;
        }
        
        return answer;
    }
}