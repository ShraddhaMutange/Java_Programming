import java.io.*;
import java.util.*;

class program60_1
{
    public static void main(String A[])
    {
        String DirName = null;
        long TotalFileSize = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        DirName = keyboard.nextLine();

        File dobj = new File(DirName);

        if(dobj.exists() && dobj.isDirectory())
        {
            
            System.out.println("Directory is present");

            File fArr[] = dobj.listFiles();

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    TotalFileSize += fArr[i].length();
                }
            }

            System.out.println("Total file size : " + TotalFileSize + " bytes");
            
        }
        else
        {
            System.out.println("Directory is not present");
        }

        keyboard.close();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Output:
// 
//  Enter Directory Name : 
//  Demo
//  Directory is present
//  Total file size : 35
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
