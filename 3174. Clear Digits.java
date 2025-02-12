class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(s.charAt(i)); 
            }
        }
        
        return result.toString();
    }
}
