import java.util.Arrays;

public class Firstlastoccurance {
    public static int Firstoccurance(int[] a,int key){
int low = 0;
        int high = a.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) {
                ans = mid;      
                high = mid - 1;
            }
            else if (a[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[] a,int key){
    int low = 0;
    int high = a.length - 1;
    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == key) {
            ans = mid;
            low = mid + 1;  // Search right side
        }
        else if (a[mid] < key) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }
    return ans;
}
public static int searchInsert(int[] nums, int target) {

    int low = 0;
    int high = nums.length - 1;

    while(low <= high) {

        int mid = low + (high-low)/2;

        if(nums[mid] == target)
            return mid;

        if(nums[mid] < target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return low;
}
    public static void main(String[] args){

        int[] a={1,3,5,6};
        Arrays.sort(a);
        int key=4;
        int first=Firstoccurance(a, key);
        int last=lastOccurance(a,key);
int count=last-first+1;
        //System.out.println("FirstOccurance :"+Firstoccurance(a, key));
      // System.out.println("Last Occurance : "+lastOccurance(a, key));
       //System.out.println("count Occurance :"+count);
       System.out.println(searchInsert(a,key));
    }
    
}
