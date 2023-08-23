class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> li= new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                li.add(0);
                li.add(0);
                n--;
            }
            else{
                li.add(arr[i]);
            }
        }
        // int[] ar= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]= li.get(i);
        }
        // return ar;

    }
}
