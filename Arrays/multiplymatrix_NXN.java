// Link: https://practice.geeksforgeeks.org/problems/multiply-matrices/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

class GfG
{
      public static void multiply(int A[][], int B[][], int C[][], int N)
        {
           int x=0;
           for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    x+=A[i][k]*B[k][j];
                }
                C[i][j]=x;
            }
           }
        }
}