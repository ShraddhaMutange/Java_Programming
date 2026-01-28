//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Header Files
// 
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

//////////////////////////////////////////////////////////////////////////////////////////////////
// 
//  Entry point method for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////

public class program56_3
{
    public static void main(String A[])    
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String fileName = sobj.nextLine();

        FileX fobj = new FileX();

        fobj.WriteToFile(fileName);

        sobj.close();
    }
}   

class FileX
{
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Method Name :   WriteToFile
//  Description :   Accepts file name via user input and opens that file and writes into that file
//  Input :         String - name of the file
//  Output :        Void
//  Author :        Shraddha Dhananjay Mutange
//  Date :          26/01/2026
//  
//////////////////////////////////////////////////////////////////////////////////////////////////

    void WriteToFile(String fileName)
    {
        try(FileWriter fwobj = new FileWriter(fileName, true))  // creates file if it doesn't exist
        {
            fwobj.write("This text will append");

            System.out.println("Succesfully appended to file");
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
//      Succesfully appended to file
//  new.txt :
//      Jay Ganesh...This text will append
// 
//  ----------------------------------------------------------------------------------------------
// 
//  Input :
//      Enter file name : 
//      NEW.txt
//  Output :
//      Succesfully appended to file
//  NEW.txt :
//      This text will append
// 
//////////////////////////////////////////////////////////////////////////////////////////////////