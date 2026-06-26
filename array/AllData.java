public class AllData {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
    count(arr);
    addElement(arr);
    sum(arr);
    desc(arr);
    }
    public static void  count(int arr[]){
        int count=0;
      for(int i=0;i<arr.length;i++){
         if(arr[i]%2==0){
            count++;
         }
      }
     System.out.println("no of Even Number : "+count);
    }
    public static void addElement(int arr[]){
 int value=5;
        for(int i=0;i<arr.length;i++){
    int result=arr[i]+value;
     System.out.print(result+" ");
     System.out.println();
 }

    }
    public static void sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
sum+=arr[i];
        }
        
System.out.println("Total Sum : " + sum);
    }
    public static void desc(int arr[]){
        System.out.print("Descending Order:");
        int desc;
        for(int i=arr.length-1;i>=0;i--){
desc=arr[i];
System.out.print(desc +" ");
        }
    }
 
}
