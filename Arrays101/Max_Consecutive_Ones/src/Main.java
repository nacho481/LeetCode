// ===============================================================
// Attached: Sol2
// ===============================================================
// File: Main.java
// ===============================================================
// Programmer: Ignacio-Manuel Atilano
// ===============================================================

import kotlin.ParameterName;

public class Main
{
    public static void main(String[] args)
    {
        int [] tempArray = {12,345,2,6,7896};
        int [] tempArray2 = {555,901,482,1771};
        System.out.println("Temp array no. of even digits: " + findNo(tempArray));
        System.out.println("Temp array no. of even digits: " + findNo(tempArray2));
    }

    /**
     *
     * @param nums
     * @return number of even digits values in nums
     */
    public static int findNo(int[] nums)
    {
        int counter = 0;

        for(int x = 0; x < nums.length; ++x)
        {
            int digit = 0;
            while(nums[x] != 0)
            {
                ++digit;
                nums[x] = nums[x] / 10;
            }
            if(digit % 2 == 0)
                ++counter;
        }
        return counter;
    }
}
