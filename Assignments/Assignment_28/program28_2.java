/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required header files
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

package Assignments.Assignment_28;
import java.util.*;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Function Name   :   Display
//  Description     :   It is used to accept number of rows and numberof columns from user and display below pattern
//                      iRow : 4    iCol :  4
// 
//                      A   B   C   D
//                      a   b   c   d
//                      A   B   C   D
//                      a   b   c   d
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
        char ch_small = '\0', ch_cap = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch_cap = 'A', ch_small = 'a'; j <= iCol; j++, ch_cap++, ch_small++)
            {
                if(i % 2 == 0)
                {
                    System.out.printf("%c\t", ch_small);
                }
                else
                {
                    System.out.printf("%c\t", ch_cap);
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

class program28_2
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
//  A	B	C	D	
//  a	b	c	d	
//  A	B	C	D	
//  a	b	c	d
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////