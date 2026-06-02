public class SecondlargestElement {
    public static void main (String[] args){
        int[] arr={23,30,2,24,6,37};
        int largest=Integer.MIN_VALUE;
        int Secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Secondlarge=largest;
                largest=arr[i];
            }
  else if(arr[i] > Secondlarge && arr[i] != largest){
Secondlarge=arr[i];
  }
            
        }

        System.out.println("LargestElement:"+largest);
        System.out.println("Second LargestElement:"+Secondlarge);
    }
}
