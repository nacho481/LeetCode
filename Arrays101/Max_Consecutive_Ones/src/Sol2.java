// ===============================================================
// Attached: Sol2
// ===============================================================
// File: Sol2.java
// ===============================================================
// Programmer: Ignacio-Manuel Atilano
// ===============================================================

public class Sol2
{
    public static void main(String [] args)
    {
        int [] tempArray =  {12, 345, 2, 6, 7896};
        int [] tempArray2 = {555, 901, 482, 1771};
        System.out.println("Temp array no. of even digits: " + findNo(tempArray));
        System.out.println("Temp array no. of even digits: " + findNo(tempArray2));
    }

    /**
     * The findNo() method examines an integer array and determines what elements
     * hold values that have an even digit value e.g, 10, 1000, etc.
     * @param nums
     * @return number of even digits values in nums
     */
    public static int findNo(int[] nums)
    {
        int counter = 0;    // Keep track of even number digits

        for(int x = 0; x < nums.length; ++x)
        {
            String str = Integer.toString(nums[x]); // convert int to String value
            if(str.length() % 2 == 0)   // get length of String
                ++counter;
        }
        return counter;
    }
}
