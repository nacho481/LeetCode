// Solution 2

public class Sol2
{
    public static void main(String [] args)
    {
        int [] tempArray =  {12, 345, 2, 6, 7896};
        int [] tempArray2 = {555, 901, 482, 1771};
        System.out.println("Temp array no. of even digits: " + findNo(tempArray));
        System.out.println("Temp array no. of even digits: " + findNo(tempArray2));
    }

    public static int findNo(int[] nums)
    {
        int counter = 0;
        for(int x = 0; x < nums.length; ++x)
        {
            String str = Integer.toString(nums[x]);
            if(str.length() % 2 == 0)   // get length of String
                ++counter;
        }

        return counter;
    }
}
