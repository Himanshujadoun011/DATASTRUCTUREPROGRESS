package com.JAVA_Programing.DATA_STRUCTURE.questiononbinarysearch;

public class findelementinmountainarray {
    static void main(String[] args) {

    }
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int start=0;
//        int end=mountainArr.length()-1;
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
//                end=mid;
//            }else{
//                start=mid+1;
//            }
//
//        }
//        int peak=start;
//        start=0;
//        int ans=binary( target,mountainArr,start,peak);
//        if(ans!=-1){
//            return ans;
//        }else{
//            return binary( target, mountainArr,peak,end=mountainArr.length()-1);
//
//        }
//
//
//    }
//    static int binary(int target, MountainArray mountainArr,int x, int end) {
//        boolean isasc=mountainArr.get(x)<mountainArr.get(end);
//        while (x<=end){
//            int mid=x+(end-x)/2;
//            if(target==mountainArr.get(mid)){
//                return mid;
//            }
//            if(isasc){
//                if(target<mountainArr.get(mid)){
//                    end=mid-1;
//                }else  {
//                    x = mid + 1;
//                }
//            }else {
//                if (target > mountainArr.get(mid)) {
//                    end = mid - 1;
//                } else {
//                    x = mid + 1;
//                }
//            }
//        }
//        return -1;
//
//
//
//
//    }
}
