import java.io.*;
import java.util.*;

class program60_4
{
    public static void main(String A[])
    {
        String DirName = null;
        String Extension = null;
        int i = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        DirName = keyboard.nextLine();

        System.out.println("Enter Extension Name : ");
        Extension = keyboard.nextLine();

        File dobj = new File(DirName);

        if(dobj.exists() && dobj.isDirectory())
        {
            
            System.out.println("Directory is present");

            File fArr[] = dobj.listFiles();

            for(i = 0; i < fArr.length; i++)
            {
                if(fArr[i].getName().endsWith(Extension) == true)
                {
                    System.out.println(fArr[i].getName());
                }
            }

            System.out.println();
            
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
//  Smallest file size : 10
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
