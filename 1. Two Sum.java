class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //BRUTE FORCE
        /*
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }

        return new int[]{1,2};
        */

        //OPTIMISED
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                int val = map.get(complement);
                return new int[]{i,val};
            }
            map.put(nums[i],i);

        }
        return new int [] {1,2};

    }
}