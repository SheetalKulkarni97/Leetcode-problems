/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
  Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2] */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         // Use a hashmap to store the counts of each element in nums1
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0; i<nums1.length;i++){
            int num=nums1[i];
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }

        // Use a list to store the intersection elements
        List<Integer> intersection = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int num=nums2[i];
            if(countMap.containsKey(num) && (countMap.get(num)>0)){
                intersection.add(num);
                countMap.put(num, countMap.get(num)-1);
            }
        }
        int[] result = new int[intersection.size()];
        for(int i=0;i<intersection.size();i++){
            result[i] = intersection.get(i);
        }
        return result;
    }
}
