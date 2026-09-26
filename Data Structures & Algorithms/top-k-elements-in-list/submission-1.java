class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        return Arrays.stream(nums).boxed().collect(Collectors.toMap(x -> x, x -> 1, Integer::sum)).entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).limit(k).mapToInt(Map.Entry::getKey).toArray();
        
    }
}
