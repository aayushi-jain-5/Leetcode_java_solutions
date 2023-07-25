class Solution {
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String toGoatLatin(String sentence) {
        List<String> list = new ArrayList<>();
        String arr[] = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length;i++){
            char detachedOriginal = arr[i].charAt(0);
            char detach = arr[i].toLowerCase().charAt(0);
            String rem = arr[i].substring(1);
            if(isVowel(detach)){
                sb.append(arr[i]);
                sb.append("ma");
                for(int j = 0;j<=i;j++){
                    sb.append("a");
                }
            }
            else{
                sb.append(rem);
                sb.append(detachedOriginal);
                sb.append("ma");
                for(int j = 0;j<=i;j++){
                    sb.append("a");
                }
            }
            list.add(sb.toString());
            sb.setLength(0);
        }
        for(int i = 0;i<list.size() - 1;i++){
            sb.append(list.get(i));
            sb.append(" ");
        }
        sb.append(list.get(list.size()-1));
        return sb.toString();
    }
}
