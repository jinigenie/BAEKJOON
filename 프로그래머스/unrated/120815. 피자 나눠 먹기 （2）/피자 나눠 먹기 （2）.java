class Solution {
    public int solution(int n) {
        int i = 1;
        while(true) {            
            if((n*i) % 6 == 0) break;
            i++;
        }
        return (n*i)/6;
    }
}