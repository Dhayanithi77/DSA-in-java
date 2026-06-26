public class SingleNum{
    public static void main(String[] args){
        
        SingleNum obj=new SingleNum();
        obj.print(99);
    }
    public int print(int target){
        if(target!=0){
            System.out.println(target);
            return print(target-1);
        }
        else {
            return 0;
        }
    }
}