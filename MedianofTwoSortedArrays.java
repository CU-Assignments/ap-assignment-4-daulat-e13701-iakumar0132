class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]= new int[nums1.length+nums2.length];
        int length=arr.length;
        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[nums1.length+i]=nums2[i];
        }
        Arrays.sort(arr);
        if(length%2==0) 
        {
            int med1=length/2;
            int med2=med1-1;
            double temp=(arr[med1]+arr[med2])/2.0;
            return temp;
        }
        else
        {
            int med= Math.round(length/ 2);
            
            return (double)arr[med];
        }
        
    }
}
