public class MaxDistance {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int max = 0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                int diff = j-i;
                if(diff > max){
                    max = diff;
                }
                j++;
            }else{
                i++;
            }

        }
        return max==Integer.MIN_VALUE ? 0:max;
    }
}
