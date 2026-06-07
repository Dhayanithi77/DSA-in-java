public class RotatedArray {
public static int SearchElement(int[] a,int key){
    int l=0,h=a.length-1;
    while(l<=h)
    {
      int mid=l+(h-l)/2;
      if(a[mid]==key){
return mid;
      }if(a[l]<=a[mid]){
    if(key>=a[l] && key<=a[mid]){
        h=mid-1;
      }
      else
        l=mid+1;
    }

      else{
        if(key>a[mid]&&key<=a[h]){
                l=mid+1;}
            else{
                h=mid-1;

            }
        }
      }
    
    return -1;
}


public static int findmin(int[] a){
    int l=0,h=a.length-1;
    while(l<h){
        int mid=l+(h-l)/2;
        if (a[mid]>a[h]) {
            l=mid+1;
        }
        else{
            h=mid-1;
        }
    }
    return a[l];
}

    public static void main(String[] args){
int[] a={4,5,6,7,0,1,2};
int key=2;
System.err.println("Rotated Element : "+SearchElement(a, key));
System.out.println("FindMin Value iN Rotated Array : "+ findmin(a));
    }
    
}
