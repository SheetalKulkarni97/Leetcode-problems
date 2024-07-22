/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order. */

/* Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2] */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hsNums1 = new HashSet<>();
        HashSet<Integer> hsRes = new HashSet<>();
        for(int i : nums1){
            hsNums1.add(i);
        }

        for(int i : nums2){
            if(hsNums1.contains(i)){
                hsRes.add(i);
            }
        }

        int[] res = new int[hsRes.size()];
        int i=0;
        for(int j : hsRes){
            res[i++] = j;
        }
        return res;
    }
}

/*First I am adding elements of nums1 array into a hashset , so that it would contain only unqiue elements. 
  Then I am comparing this hasset with second array using contains keyword --> true , then I am adding it to result hashset. 
Then I am adding elements of result hashset into array as we have to return array*/
