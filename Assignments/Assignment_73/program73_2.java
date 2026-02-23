import java.util.Scanner;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;

        Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        if(iRow != iCol)
        {
            System.out.println("Number of rows and column must be same.");
            sobj.close();
            return;
        }

        System.out.println("Enter the elements of matrix : ");

        for(i = 0; i < iRow; i++)
        {
            System.out.println("Enter the elements of row " + (i+1) + " : ");
            for(j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("The elements of matrix are: ");

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int DiagonalSum()
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }

        return iSum;
    }

    public int CountFrequency(int iNo)
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }

    public int MaxDiagonal()
    {
        int i = 0, j = 0;
        int iMax = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0, iMax = Arr[0][0] ; j < iCol; j++)
            {
                if((i == j) || (i+j == 3))
                {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
                }
            }
        }

        return iMax;
    }

    public void AddColumn()
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(i = 0; i < iRow; i++)
        {
            iSum = 0;
            for(j = 0; j < iCol; j++)
            {
                iSum = iSum + Arr[j][i];
            }
            System.out.println(iSum);
        }
    }

    public void SwapRows()
    {
        int i = 0, j = 0;
        int temp = 0;

        for(i = 0; i < iRow-1; i=i+2)
        {
            for(j = 0; j < iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;
            }
        }
    }

    public void Transpose()
    {
        int i = 0, j = 0;
        int temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = i+1; j < iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp;
            }
        }
    }

    public void ReverseRow()
    {
        int i = 0, j = 0;
        int temp = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol/2; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][iCol-j-1];
                Arr[i][iCol-j-1] = temp;
            }
        }
    }

}

class program73_2 {
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Matrix mobj = new Matrix(iValue1, iValue2);

        mobj.Accept();
        mobj.Display();

        System.out.println("\nReversed rows matrix : ");
        mobj.ReverseRow();
        mobj.Display();

        
    }
}

/*

The elements of matrix are: 
3	2	5	9	
4	3	2	2	
8	4	1	9	
3	9	7	5	

Reversed rows matrix : 
The elements of matrix are: 
9	5	2	3	
2	2	3	4	
9	1	4	8	
5	7	9	3

*/



/*

        0       1       2       3
    0   00      01      02      03
    1   10      11      12      13
    2   20      21      22      23  
    3   30      31      32      33



*/
