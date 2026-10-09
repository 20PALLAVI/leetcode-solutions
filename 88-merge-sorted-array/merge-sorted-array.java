class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m+n];
        int j =0;
        for(int i=0; i<=m-1;i++){
            ans[j]=nums1[i];
            j++;
        }
        for(int i=0; i<=n-1;i++){
            ans[j]=nums2[i];
            j++;
        }
        for(int i=0;i<=ans.length-2;i++){
            for(int k =0;k<=ans.length-2-i;k++){
                if(ans[k]>ans[k+1]){
                    int temp = ans[k];
                    ans[k]=ans[k+1];
                    ans[k+1]=temp;
                }
            }
        }
        for(int i =0;i<=ans.length-1;i++){
            nums1[i]=ans[i];
        }
    }
}