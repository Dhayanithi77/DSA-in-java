import java.util.Scanner;

public class BubbleSort {
    
    public static void Bubble(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
}
Bubble(a);
for(int i=0;i<a.length;i++){
    System.out.print(a[i] +  " ");
}
   }
}
