class Solution {
    static int sumOfSquares(int num){
        int sum = 0;
        while(num > 0){
            double last_diget = num % 10; // Extract the last digit
            sum += Math.pow(last_diget, 2); // Add the square of the digit to the sum
            num = Math.floorDiv(num, 10); // Remove the last digit
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        if(n == 1) return true; // Base case: 1 is a happy number

        int slow = n; // Initialize slow pointer with n
        int fast = n; // Initialize fast pointer with n
 
        while(true){
            // Move slow pointer by one step and fast pointer by two steps
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
            // If the pointers meet, a cycle is detected
            if(slow == fast) break;
        }
        // If the cycle reaches 1, then n is a happy number
        return slow == 1;
    }
}
