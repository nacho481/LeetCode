import java.util.Arrays;
import java.util.stream.IntStream;

public class Main
{
    public static void main(String [] args)
    {

    }

    public static int[] sortedSquares(int[] nums)
    {
        for(int x = 0; x < nums.length; ++x)
        {

            nums[x] = nums[x] * nums[x];
        }
        sortArray(nums);
        return nums;
    }

    public static int[] sortArray(int[] nums)
    {
        //int [] sortedArrays = Arrays.stream(nums).boxed().sorted().mapToInt(Integer::intValue).toArray();

        for(int x = 0; x < nums.length - 1; ++x)
        {
            int currentMin = nums[x];
            int currentMinIndex = x;

            for(int y = 0; y < nums.length; ++y)
            {
                if(currentMin > nums[y])
                {
                    currentMin = nums[y];
                    currentMinIndex = y;
                }
            }
            //Swap nums[x] with nums[currentMinIndex]
            if(currentMinIndex != x)
            {
                nums[currentMinIndex] = nums[x];
                nums[x] = currentMin;
            }

        }

        return nums;
    }
}
