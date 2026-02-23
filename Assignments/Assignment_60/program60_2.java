import java.io.*;
import java.util.*;

class program60_2
{
    public static void main(String A[])
    {
        String DirName = null;
        long LargestFile = 0;
        int i = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        DirName = keyboard.nextLine();

        File dobj = new File(DirName);

        if(dobj.exists() && dobj.isDirectory())
        {
            
            System.out.println("Directory is present");

            File fArr[] = dobj.listFiles();

            for(i = 0, LargestFile = fArr[0].length(); i < fArr.length; i++)
            {
                if(fArr[i].isFile() && fArr[i].length() > LargestFile)
                {
                    LargestFile = fArr[i].length();
                }
            }

            System.out.println("Largest file size : " + LargestFile);
            
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
//  Largest file size : 15
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
