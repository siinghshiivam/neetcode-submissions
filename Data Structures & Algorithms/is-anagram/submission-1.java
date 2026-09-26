class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){

            String s1 = Arrays.stream(s.split(""))
                    .sorted()
                    .collect(Collectors.joining());

            String t1 = Arrays.stream(t.split(""))
                    .sorted()
                    .collect(Collectors.joining());

                if (s1.equalsIgnoreCase(t1)){
                    return true;
                }    


        }else{
            return false;
        } 

        return false;           

    }
}
