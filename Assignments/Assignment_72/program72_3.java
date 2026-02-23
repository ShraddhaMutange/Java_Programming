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

}

class program72_3 {
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

        System.out.println("Max of diagonal is : " + mobj.MaxDiagonal());

        
    }
}

/*

The elements of matrix are: 
11	12	13	14	
15	16	21	5	
10	4	3	2	
1	89	7	55	
Max of diagonal is : 55

*/



/*

        0       1       2       3
    0   00      01      02      03
    1   10      11      12      13
    2   20      21      22      23  
    3   30      31      32      33



*/
