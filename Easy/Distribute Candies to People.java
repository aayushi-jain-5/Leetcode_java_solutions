class Solution {
    public int[] distributeCandies(int candies, int num_people) 
    {
        int p = num_people;
        int arr[] = new int[p];
		for(int i=0;i<p;i++)
		{
		    arr[i] = 0;
		} 
        int k=1;  
		while(candies!=0)
		{
		    for(int j=0;j<p;j++)
		    {
		        if(k<candies)
		        {
		        arr[j] += k;
                candies-= k;
		        k++;
		        }
		        else
		        {
		            arr[j]+= candies;
		            candies = 0;
		        }
		    }
		}
		return arr;
    }
}
