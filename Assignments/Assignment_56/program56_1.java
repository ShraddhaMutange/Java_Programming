//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
// 
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point method for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////

public class program56_1 
{
    public static void main(String A[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String fileName = sobj.nextLine();

        FileX fobj = new FileX();

        fobj.OpenFile(fileName);

        sobj.close();
    }
}   

class FileX
{
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Method Name :   OpenFile
//  Description :   Accepts file name via user input and opens that file
//  Input :         String - name of the file
//  Output :        Void
//  Author :        Shraddha Dhananjay Mutange
//  Date :          26/01/2026
//  
//////////////////////////////////////////////////////////////////////////////////////////////////

    void OpenFile(String fileName)
    {
        try
        {
            File fileobj = new File(fileName);

            Scanner filereader = new Scanner(fileobj);

            System.out.println("File opened succesfully");

            filereader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
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
//      Enter file name : 
//      new.txt
//  Output :
//      File opened succesfully
// 
//  ----------------------------------------------------------------------------------------------
// 
//  Input :
//      Enter file name : 
//      NEW.txt
//  Output :
//      File not found
// 
//////////////////////////////////////////////////////////////////////////////////////////////////