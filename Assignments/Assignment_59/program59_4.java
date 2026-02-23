import java.io.*;
import java.util.*;

class program59_4
{
    public static void main(String A[])
    {
        String DirName = null;

        int fileCount = 0, dirCount = 0;

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
                    fileCount++;
                }
                else if(fArr[i].isDirectory())
                {
                    dirCount++;
                }
            }

            System.out.println("Total number of files : " + fileCount);
            System.out.println("Total number of folders : " + dirCount);
            
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
//  Total number of files : 3
//  Total number of folders : 2
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
