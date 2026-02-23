import java.io.*;
import java.util.*;

class program59_5
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
                    System.out.println("File Name : " + fArr[i].getName() + " | Absolute Path : " + fArr[i].getAbsolutePath());
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
//  File Name : B.txt | Absolute Path : /home/shraddha/Desktop/LB/Java_Programming/Assignments/Assignment_59/Demo/B.txt
//  File Name : A.txt | Absolute Path : /home/shraddha/Desktop/LB/Java_Programming/Assignments/Assignment_59/Demo/A.txt
//  File Name : C.txt | Absolute Path : /home/shraddha/Desktop/LB/Java_Programming/Assignments/Assignment_59/Demo/C.txt
// 
///////////////////////////////////////////////////////////////////////////////////////////////////// 
