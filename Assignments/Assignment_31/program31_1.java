/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required header files
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Assignments.Assignment_31;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name   :   Display
//  Description     :   It is used to accept number of rows and numberof columns from user and display below pattern
//                      iRow : 4    iCol :  4
// 
//                      *   
//                      *   *
//                      *   *   *   
//                      *   *   *   *
//   
//  Input           :   Int
//  Output          :   Void
//  Author          :   Shraddha Dhananjay Mutange
//  Date            :   22/11/2025
//  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Number of rows and number of columns must be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i >= j)
                {
                    System.out.print("*\t");
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

class program31_1
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
//  *	
//  *	*	
//  *	*	*	
//  *	*	*	*
// 
//  iRow    :   5       iCol    :   4
// 
//  Invalid Input
//  Number of rows and number of columns must be same
// 
//  iRow    :   6       iCol    :   6
// 
//  *	
//  *	*	
//  *	*	*	
//  *	*	*	*	
//  *	*	*	*	*	
//  *	*	*	*	*	*
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////