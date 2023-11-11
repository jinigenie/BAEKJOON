class Solution {
    public String solution(int age) {
        String answer = "";
        String str = "abcdefghij";
        String[] spAge= String.valueOf(age).split("");

        for(int i = 0; i < spAge.length; i++) {
            answer += str.charAt(Integer.valueOf(spAge[i]));
        }
        return answer;
    }
}