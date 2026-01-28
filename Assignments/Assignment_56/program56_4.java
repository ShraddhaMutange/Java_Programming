//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
// 
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point method for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////

public class program56_4
{
    public static void main(String A[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String fileName = sobj.nextLine();

        FileX fobj = new FileX();

        fobj.CreateFile(fileName);

        sobj.close();
    }
}   

class FileX
{
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Method Name :   CreateFile
//  Description :   Accepts file name via user input and creates file of that name
//  Input :         String - name of the file
//  Output :        Void
//  Author :        Shraddha Dhananjay Mutange
//  Date :          26/01/2026
//  
//////////////////////////////////////////////////////////////////////////////////////////////////

    void CreateFile(String fileName)
    {
        try
        {
            File fileobj = new File(fileName);

            if(fileobj.createNewFile() == true)
            {
                System.out.println("File created : "+fileobj.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.getStackTrace();
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
//      File already exists
// 
//  ----------------------------------------------------------------------------------------------
// 
//  Input :
//      Enter file name : 
//      hello.txt
//  Output :
//      File created : hello.txt
// 
//////////////////////////////////////////////////////////////////////////////////////////////////