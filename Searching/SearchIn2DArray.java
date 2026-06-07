public class SearchIn2DArray {
    public static boolean Searchmatric(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int low=0;
        int high=rows*cols-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target){
             return true;
            }
            if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
int[][] matrix={{1,325,7},{10,11,16,20},{23,24,27,30}};
int target=16;
System.out.println(Searchmatric(matrix, target));
}}
