class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int len = part.length(); // Length of part
        
        for (int i = 0; i <= str.length() - len; i++) {  
            String sub = str.substring(i, i + len);
            
            if (sub.equals(part)) { 
                str.delete(i, i + len); 
                
               
                i = -1; 
            }
        }
        
        return str.toString();
    }
}
