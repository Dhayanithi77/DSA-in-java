//package TwoPointer.TwoAddition;

public class TwoAddition {
    public static void main(String[] args){
     int arr[]={1,3,5,6,9,11};
     int target=12;
hasTwoSum(arr,target);
    }
    public static boolean hasTwoSum(int[] arr,int target){
    int left=0;
    int right=arr.length-1;
    while(left<right){
        int sum=arr[right]+arr[left];
        if(sum==target){
            System.out.println("fair occur : ("+arr[left]+","+arr[right]+")");
            return true;
        }
        else if(sum<target){
            left++;
        }
        else{
            right--;
        }
    }
    return false;
    }
}
