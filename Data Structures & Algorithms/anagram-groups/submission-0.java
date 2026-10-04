class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedWords = new HashMap<>();

        for (String word: strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            groupedWords.putIfAbsent(sortedStr, new ArrayList<>());
            groupedWords.get(sortedStr).add(word);
        }

        return new ArrayList<>(groupedWords.values());
    }
}
