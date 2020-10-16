import java.util.*;

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] SquaresArray = new int[A.length];
        for (int i = 0; i<A.length; i++)
        {
            SquaresArray[i] = A[i] * A[i];
        }
        Arrays.sort(SquaresArray);
        return SquaresArray;
    }


    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {-4,-1,0,3,10};
        int[] returnData = solution.sortedSquares(nums);
        System.out.println(returnData.toString());
    }
}
