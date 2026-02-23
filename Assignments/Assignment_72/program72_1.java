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

        sobj.close();
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

}

class program72_1 {
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Matrix mobj = new Matrix(iValue1, iValue2);

        mobj.Accept();
        mobj.Display();

        System.out.println("Addition of diagonal elements is : " + mobj.DiagonalSum());

        
    }
}

/*
Enter number of rows : 
4
Enter number of columns : 
4
The elements of matrix are: 
1	2	3	4	
5	6	7	8	
9	1	2	3	
4	5	6	7	
Addition of diagonal elements is : 16
*/
