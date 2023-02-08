//Link: https://practice.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        int temp;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<i;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //till now transpose is done

        for(int i=0;i<(n/2);i++){
            for (int j = 0; j <n; j++) {
                temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
            }
        }
    }
}