import java.io.*;
import java.util.*;

class program59_3
{
    public static void main(String A[])
    {
        String DirName = null;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        DirName = keyboard.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Sub-directpries present in " + DirName + " are as follows : ");

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isDirectory() == true)
                {
                    System.out.println(fArr[i].getName());
                }
            }
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
//  Sub-directpries present in Demo are as follows : 
//  Demo2
//  Demo1
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
