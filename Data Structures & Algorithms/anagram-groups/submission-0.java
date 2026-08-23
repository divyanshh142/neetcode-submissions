class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sorted_s = new String(charArray);
            res.putIfAbsent(sorted_s, new ArrayList<>());

            res.get(sorted_s).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
