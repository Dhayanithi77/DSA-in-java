public class UpperlowerBound{
    public static int UpperBound(int[] a,int key){
   int l=0,h=a.length-1,ans=a.length;
   while(l<=h){
    int mid=l+(h-l)/2;
    if(a[mid]>=key){
        ans=mid;
        h=mid-1;
    }else{
        l=mid+1;
    }



   }
   return ans;
    }
    public static int LowerBound(int[] a,int key){
   int l=0,h=a.length-1,ans=a.length;
   while(l<=h){
    int mid=l+(h-l)/2;
    if(a[mid]>key){
        ans=mid;
        h=mid-1;
    }else{
        l=mid+1;
    }



   }
   return ans;
    }

    public static int PeakElement(int[] a){
         int low = 0, high = a.length - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (a[mid] < a[mid + 1]) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
        }
    
    public static void main(String[] args){
int[] a={1,3,5,3,7,9,1};
//int key=5;
//System.out.println(UpperBound(a, key));
//System.out.println(LowerBound(a,key));  
System.out.println(PeakElement(a));
}
}