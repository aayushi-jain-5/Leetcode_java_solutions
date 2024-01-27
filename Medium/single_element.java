import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleElementInSortedArray {

    public static int findSingleElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2;
                } else {
                    high = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sorted array as a string: ");
        String input = scanner.nextLine();

        // Convert the input string to an array of integers
        List<Integer> numsList = new ArrayList<>();
        for (String numStr : input.split(" ")) {
            int num = Integer.parseInt(numStr);
            numsList.add(num);
        }

        // Convert the list to an array
        int[] nums = new int[numsList.size()];
        for (int i = 0; i < numsList.size(); i++) {
            nums[i] = numsList.get(i);
        }

        System.out.println("The single element is: " + findSingleElement(nums));

        scanner.close();
    }
}
