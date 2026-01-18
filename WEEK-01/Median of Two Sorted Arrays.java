class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return brute_force(nums1,nums2);
    }
    public static double brute_force(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        int count=0;
        for(int i=0;i<n;i++){
            arr[count]=nums1[i];
            count++;
        }
        for(int i=0;i<m;i++){
            arr[count]=nums2[i];
            count++;
        }
        Arrays.sort(arr);
        if((n+m)%2!=0){
            return (double)arr[(n+m)/2];
        }else{
            return ((double)(arr[(n+m)/2] + arr[(n+m)/2 - 1])) / 2;

        }
    }
}

//optimed ny binary search

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int n = nums1.length;
        int m = nums2.length;

        int low = 0, high = n;

        while (low <= high) {

            int cut1 = (low + high) / 2;
            int cut2 = (n + m + 1) / 2 - cut1;

            int left1  = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2  = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = (cut1 == n) ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = (cut2 == m) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {

                if ((n + m) % 2 == 0) {
                    return (Math.max(left1, left2) +
                            Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }

            } else if (left1 > right2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }
}






