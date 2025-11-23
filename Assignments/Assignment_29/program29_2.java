/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required header files
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Assignments.Assignment_29;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name   :   Display
//  Description     :   It is used to accept number of rows and numberof columns from user and display below pattern
//                      iRow : 4    iCol :  4
// 
//                      2   4   6   8
//                      1   3   5   7
//                      2   4   6   8
//                      1   3   5   7
//   
//  Input           :   Int
//  Output          :   Void
//  Author          :   Shraddha Dhananjay Mutange
//  Date            :   21/11/2025
//  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount = 0;
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, iCount = 1; j <= iCol; j++, iCount+=2)
            {
                if((i % 2) == 0)
                {
                    System.out.print(iCount + "\t");
                    // iCount = iCount+2;
                }
                else
                {
                    System.out.print(iCount+1 + "\t");
                    // iCount = iCount+2;
                }
            }
            System.out.println();
        }
    } // End of Display
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program29_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
// 
//  iRow    :   4       iCol    :   4
//  
//  2	4	6	8	
//  1	3	5	7	
//  2	4	6	8	
//  1	3	5	7
// 
//  iRow    :   5       iCol    :   5
// 
//  2	4	6	8	10	
//  1	3	5	7	9	
//  2	4	6	8	10	
//  1	3	5	7	9	
//  2	4	6	8	10
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////