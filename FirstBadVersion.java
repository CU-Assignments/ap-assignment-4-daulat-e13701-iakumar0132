
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1,e=n,ans=0;
        int mid;
        while(s<=e)
        {
            mid=s+(e-s)/2;
            if(isBadVersion(mid)==false)
                s=mid+1;
            else{
                ans=mid;
                e=mid-1;
                
            }
                
        }
       return ans; 
    }
}
