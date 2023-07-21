class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(checkNumber(i)){
                output.add(i);
            }
        }
        return output;
    }

    public boolean checkNumber (int num){
        int temp = num;
        while(temp != 0){
            int remainder = temp%10;
            if(remainder == 0 || num%remainder != 0){
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
