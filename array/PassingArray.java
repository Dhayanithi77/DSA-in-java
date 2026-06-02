public class PassingArray{
    public static void main(String args[]){
        int arr[]={2,4,65,67,76};
   sum(arr);
   product(arr);
    }

    public static void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
          
        }
          System.out.print("Total Sum:"+sum);
    }
    public static void product(int arr[]){
        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum *=arr[i];
          
        }
          System.out.print("Total product:"+sum);
    }

}