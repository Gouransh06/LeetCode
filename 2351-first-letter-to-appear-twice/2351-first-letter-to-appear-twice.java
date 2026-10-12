class Solution {
    public char repeatedCharacter(String s) {
        int ans = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < s.length() - 1; i++){
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    ans = s.indexOf(s.charAt(j), s.indexOf(s.charAt(j)) + 1);
                    max = Math.min(ans, max);
                }
            }
        }
        return s.charAt(max);
    }
}