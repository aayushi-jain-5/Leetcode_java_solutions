class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;

        ArrayList<String> list= new ArrayList();
        for(int i=0;i<list1.length;i++){
            int j=0;
            while(j<list2.length){
                if(list1[i].equals(list2[j])){
                    if(i+j<min){
                        min=i+j;
                       
                    }
                }
                j++;
            }
        }
        for(int i=0;i<list1.length;i++){
            int j=0;
            while(j<list2.length){
                if(list1[i].equals(list2[j])){
                    if(i+j==min){
                        list.add(list1[i]);
                    }
                }
                j++;
            }
        }
        
        String[] ans = new String[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        
        return ans;
    }
}
