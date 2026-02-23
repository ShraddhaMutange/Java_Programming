import java.io.*;
import java.util.*;

class program60_5
{
    public static void main(String A[])
    {
        String PathName = null;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the path : ");
        PathName = keyboard.nextLine();

        File fobj = new File(PathName);

        if(fobj.exists() == true)
        {
            System.out.println("This path exists");

            if(fobj.isFile() == true)
            {
                System.out.println("It is a File");
            }
            else if(fobj.isDirectory() == true)
            {
                System.out.println("It is a Directory");
            }
        }
        else
        {
            System.out.println("This path does not exist");
        }

        keyboard.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Output :
// 
//  Enter the path : 
//  /home/shraddha/Desktop/LB/Java_Programming/Assignments/Assignment_60/program60_5.java
//  This path exists
//  It is a File
// 
//  ----------------------------------------------------------------------------------------------------
// 
//  Enter the path : 
//  /home/shraddha/Desktop/LB/Java_Programming/Assignments/Assignment_60/Demo            
//  This path exists
//  It is a Directory
// 
////////////////////////////////////////////////////////////////////////////////////////////////////////