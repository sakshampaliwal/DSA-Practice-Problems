//Link: https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbmZRMThqcUdFVGczRnM5SThqN2NRUk9BZzgyQXxBQ3Jtc0ttUXZvR29FX3FWaGJTVFFTdGRvendneU0tYkhoaVZ1WmllU2VScHpQQlJsOTBFb2ZqMi16aEVQM08wSWdDLVNNempIRFZrT0tjeFRxbTlxVDkxaEs2ckd4OS1XQVNLZ2JPYnZ1WTZ4bUN2UUV6YkU3Yw&q=https%3A%2F%2Fpractice.geeksforgeeks.org%2Fproblems%2Ftranspose-of-matrix-1587115621%2F1&v=n3-XWx-Inns

class Solution
{
    //Function to find transpose of a matrix.
    static void transpose(int matrix[][], int n)
    {
        int temp;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<i;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
