//Interchanging the rows of a matrix

class solution
{
public:
    void interchangeRows(vector<vector><int> > &matrix)
    {
        int row=matrix.size();
        int col=matrix[0].size();

        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[row-1-i][j];
                matrix[row-1-i][j]=temp;
            }
        }
    }
}