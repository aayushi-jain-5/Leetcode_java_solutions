class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> map = new HashMap<>();
        for(char i = 'a'; i<='z'; i++){
            map.put(i,code[i-'a']);
        }

        HashSet<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<words[i].length(); j++){
                sb.append(map.get(words[i].charAt(j)));
            }

            set.add(sb.toString());
        }

        return set.size();


    }
}
