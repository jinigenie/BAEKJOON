class Solution {
    public int solution(int num) {
        
        int answer = 0;
        
        while(num != 1) {
            if(num < 0 || answer >= 500) return -1;
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++; 
        }
        
        return answer;
    }
}