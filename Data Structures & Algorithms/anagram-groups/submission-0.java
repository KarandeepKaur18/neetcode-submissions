class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();

       for(String word : strs ){
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String signature = new String(charArray);

        if(!map.containsKey(signature)){
            map.put(signature,new ArrayList<>());
        }

        map.get(signature).add(word);
       }
        
        return new ArrayList<>(map.values());
    }
}
