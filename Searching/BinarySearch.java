import java.util.Arrays;

public class BinarySearch {
    public static int binary(int[] a,int key){
        int l=0,h = a.length - 1,mid=0;
        while(l<=h){
        mid=(l+h)/2;
            if(key==a[mid]){
            return mid;
        }
        else if(key<a[mid]){
            h=mid-1;
        }
        else{
            l=mid+1;
        }

    }
    return -1;
    }
    public static void main(String[] args){
int[] a={2,4,5,6,7,10,25,234,40,53};
Arrays.sort(a);
int key=53;
System.out.println(binary(a,key));
    }
    
}
