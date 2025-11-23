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
//                      iRow : 5    iCol :  5
// 
//                      a	b	c	d	e	
//                      1	2	3	4	5	
//                      a	b	c	d	e	
//                      1	2	3	4	5
//                      a	b	c	d	e
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
        char ch = '\0';
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch = 'a'; j <= iCol; j++, ch++)
            {
                if((i % 2) == 1)
                {
                    System.out.printf("%c\t", ch);
                }
                else
                {
                    System.out.printf("%d\t", j);
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

class program29_3
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
//  a	b	c	d	
//  1	2	3	4	
//  a	b	c	d	
//  1	2	3	4
// 
//  iRow    :   5       iCol    :   5
// 
//  a	b	c	d	e	
//  1	2	3	4	5	
//  a	b	c	d	e	
//  1	2	3	4	5	
//  a	b	c	d	e
// 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////