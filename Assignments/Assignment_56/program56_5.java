//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
// 
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point method for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////

public class program56_5
{
    public static void main(String A[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        String dirName = sobj.nextLine();

        FileX fobj = new FileX();

        fobj.ListAllFiles(dirName);

        sobj.close();
    }
}   

class FileX
{
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Method Name :   ListAllFiles
//  Description :   Accepts directory name via user input and lists all the files from that directory
//  Input :         String - name of the directory
//  Output :        Void
//  Author :        Shraddha Dhananjay Mutange
//  Date :          26/01/2026
//  
//////////////////////////////////////////////////////////////////////////////////////////////////

    void ListAllFiles(String dirName)
    {
        File dir = new File(dirName);

        if(dir.exists() && dir.isDirectory())
        {
            File[] files = dir.listFiles();

            if(files != null)
            {
                for(File filename : files)
                {
                    System.out.println(filename.getName());
                }
            }
        }    
        else
        {
            System.out.println("Directory does not exist");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
// 
//  ----------------------------------------------------------------------------------------------
// 
//  Input :
//      Enter Directory Name : 
//      /home/shraddha/Documents       
//
//  Output :
//      Ajay Mittal String.txt
// 
//  ----------------------------------------------------------------------------------------------
// 
//  Input :
//      Enter Directory Name : 
//      /home/shraddha/Desktop/Practice       
//
//  Output :
//      SinglyLinear.c
//      File_IO
//      SLLL.c
//      DLLL.c
//      Myexe
//      SCLL.c
//      DCLL.c
//      SCLL.cpp
// 
//////////////////////////////////////////////////////////////////////////////////////////////////