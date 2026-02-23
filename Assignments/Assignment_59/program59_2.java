import java.io.*;
import java.util.*;

class program59_2
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

            System.out.println("Regular Files present in " + DirName + " are as follows : ");

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile() == true)
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
