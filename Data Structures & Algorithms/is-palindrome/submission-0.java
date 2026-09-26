class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "");

        String s1 = new StringBuilder(result).reverse().toString();
        
        if(result.equalsIgnoreCase(s1)){
            return true;
        }
        return false;
    }
}
