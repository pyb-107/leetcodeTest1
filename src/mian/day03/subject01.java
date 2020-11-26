package mian.day03;

public class subject01 {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        int p1=0,p2=0,p3=0;
        while (p3<m+n){

            if(nums1[p1]<nums2[p2]){
                if (nums1[p1]==0){
                    nums3[p3] = nums2[p2];
                    p2++;
                    p3++;

                }else {
                    nums3[p3] = nums1[p1];
                    p1++;
                    p3++;
                }

            }else {
                if (nums2[p2]==0){
                    nums3[p3] = nums1[p1];
                    p1++;
                    p3++;
                }else {
                    nums3[p3] = nums2[p2];
                    p2++;
                    p3++;
                }

            }
        }
        return nums3;
    }

    public static void main(String[] args) {
        subject01 subject01 = new subject01();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] ints = subject01.merge(nums1, n, nums2, m);
        for(int a:ints){
            System.out.println(a);
        }
    }
}
