class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        if (collect.size()==nums.length){
            return false;

        }else{
            return true;
        }

    }


        
    
}