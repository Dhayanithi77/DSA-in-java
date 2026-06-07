import java.util.Scanner;

public class SelectionSort {

    public static void select(int[] a){
        for(int i=0;i<a.length-1;i++){
int val=i;
for(int j=1;j<a.length;j++){
    if(a[j]<a[val]){
        val=j;
    }
}
int temp=a[i];
a[i]=a[val];
a[val]=temp;


        }
    }
     public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
}
select(a);
for(int i=0;i<a.length;i++){
    System.out.print(a[i] +  " ");
}
   }
}
