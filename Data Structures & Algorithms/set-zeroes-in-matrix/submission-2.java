class Solution {
    public void setZeroes(int[][] matrix) {
        // has to be in place
        // so would be better if we track yes or no for each column

        // lets just loop through the first row and column before anything
        boolean firstCol = false;
        for(int i = 0; i< matrix.length; i++){
            if(matrix[i][0]==0){
                firstCol = true;
                break;
            }
        }

        boolean firstRow = false;
        for(int i = 0; i< matrix[0].length; i++){
            if(matrix[0][i]==0){
                firstRow = true;
                break;
            }
        }

        for(int r = 0; r<matrix.length; r++){
            for(int c = 0; c<matrix[0].length; c++){
                // i feel like i ca
                if(matrix[r][c]==0){
                    // set the top row and leftmost column to 0 if this one needs to turned to 0            
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;

                    // i know i have to check if the overlapping element at the top left should be zero also?
                }
            }
        }
        int savedVal = matrix[0][0];
        // we should skip this we can do all of them and come back to this
        // do all the rows first
        for(int i = 1; i< matrix.length; i++){
            if(matrix[i][0]==0){
                // make this whole row 0s
                for(int j=0; j <matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 1; i< matrix[0].length; i++){
            if(matrix[0][i]==0){
                // make this whole column 0s
                for(int j=1; j <matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        if(firstRow){
            for(int i = 0; i< matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i = 0; i< matrix.length; i++){
                matrix[i][0]=0;
            }
        }

    }
}
