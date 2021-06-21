import java.util.Arrays;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String [] args)
    {
        int [] tempArr = {-4,-1,0,3,10};
        System.out.println("Before sort");
        printArray(tempArr);
        System.out.println("After sort");
        sortedSquares(tempArr);
        printArray(tempArr);

    }

    public static void sortedSquares(int[] nums)
    {
        for(int x = 0; x < nums.length; ++x)
        {
            nums[x] = nums[x] * nums[x];
        }
        sortArray(nums);
        //return nums;
        //return Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void sortArray(int[] nums)
    {
        //int [] sortedArrays = Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray();

        for(int x = 1; x < nums.length; ++x)
        {
            int current = nums[x];
            int y = x - 1;    // previous item
            // shift items right
            while(y >= 0 && nums[y] > current)
            {
                nums[y + 1] = nums[y];
                y--;
            }
            nums[y+1] = current;
        }
    }

    public static void printArray(int[] nums)
    {
        for(int e : nums)
            System.out.print(e + " ");
    }
}