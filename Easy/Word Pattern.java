class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] map= new int[26];
        Arrays.fill(map , -1);
        String[] split = s.split(" ");
        Map<String , Integer> map2 = new HashMap<>();
        if(pattern.length() != split.length) return false;

        for(int i=0;i<split.length;i++){
            map2.putIfAbsent(split[i] ,i);
            int j = pattern.charAt(i) - 'a';
            if (map[j] != -1 && !split[map[j]].equals(split[i]) || 
                pattern.charAt(map2.get(split[i])) != pattern.charAt(i)) {
                return false;
            }
            map[j] = i;
        }
        return true;
       

    }
}
