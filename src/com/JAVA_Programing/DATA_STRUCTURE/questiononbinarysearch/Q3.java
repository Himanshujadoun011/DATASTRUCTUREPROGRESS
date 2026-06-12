package com.JAVA_Programing.DATA_STRUCTURE.questiononbinarysearch;

public class Q3 {
    static void main(String[] args) {
        int[] arr={2,3,4,6,8,9,10,12,13,15,20,25,26,29,30,38,39,41,45,46,49};
        int target=45;
        System.out.println(findrange(arr,target));

    }
    public static int findrange(int[] arr,int x){

        int start=0;
        int end=1;
        while(x>arr[end]){
            start=end;
            end=end*2;

        }
        return binary(arr,x,start,end);

    }
    public static int binary(int[] arrx , int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arrx[mid]) {
                end = mid - 1;
            } else if (target > arrx[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
