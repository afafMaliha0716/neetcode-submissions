class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // need to loop through the whole matrix which is O(rowsXcolumns) time
        // by spiral you do the full first row then last column then last row and first column
        // now to think about exactly how to increment the loop as you go
        // is not garunteed to be a square matrix?
        // would ask this as a clarifying question
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;

        int left = 0;
        int right = matrix[0].length-1;

        // now loop through while the top and bottom have not converged
        // and lefta nd right havent converged
        while(top<=bottom && left<=right){

            // need to add all of top row into resut first
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // add the right column
            System.out.println(top);
            System.out.println(bottom);
            System.out.println(right);
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // add the bottom row
            

            // now add the left column
            if(left<=right){
                for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
                }
                left++;
            }
            


        }
        return result;

    }
}
