public class SmallestElement {
    public static void main(String[] args){
        int[] arr={4,7,8,2,5};
        int SmallestElement=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < SmallestElement){
              SmallestElement=arr[i];
            }
            
        }
        System.out.println(SmallestElement);
    }
}
