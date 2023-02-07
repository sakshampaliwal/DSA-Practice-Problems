// link to the problem: https://practice.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer> list=new ArrayList<Integer>(2);
        int x=0; // for lower triangle sum
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                x+=matrix[i][j];
            }
        }
        
        int y=0; //for upper triangle sum
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=i;j--){
                y+=matrix[i][j];
            }
        }
        list.add(y);
        list.add(x);
        
        return list;
    }
}