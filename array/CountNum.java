public class CountNum {
    public static void main(String[] args){
        int[] arr={2,3,5,2,2,6,5};
        int count=0;
        int target=2;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Duplicate number : "+count);
    }
}
