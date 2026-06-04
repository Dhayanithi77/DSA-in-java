public class SearchElement {
    public static int Search(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int  count(int[] a,int key){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                count++;
            }
        }
        return count;
    }
    public static int lastOccurance(int[] a,int key){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
int[] a={20,10,30,40,50,10};
int key=10;
System.out.println(Search(a,key));
    }
}
