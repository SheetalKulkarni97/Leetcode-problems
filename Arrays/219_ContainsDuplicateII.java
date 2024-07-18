/*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                if((i - hm.get(nums[i])) <= k){
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}

/*Logic : element of array = key in HashMap and index of array = value in HashMap. 
If HashMap containsKey(num[i]) -->
True - then we build further logic based on what is the variation in question, after this condition and return true
False - then we put (nums[i],i) into HashMap and got to next i*/

/*Similar logic is used in (1),(217),(219)*/
