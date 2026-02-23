import java.io.*;
import java.util.*;

class program60_5
{
    public static void main(String A[]) throws Exception
    {
        String SrcFile = null;
        String DestFile = null;
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the source file : ");
        SrcFile = keyboard.nextLine();

        File fsrcobj = new File(SrcFile);        

        System.out.println("Enter the destination file : ");
        DestFile = keyboard.nextLine();

        if(fsrcobj.exists() && fsrcobj.isFile())
        {
            System.out.println("This file exists");

            File fdestobj = new File(DestFile);

            fdestobj.createNewFile();

            FileInputStream fiobj = new FileInputStream(fsrcobj);
            FileOutputStream foobj = new FileOutputStream(fdestobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("File copied succesfully");

            fiobj.close();
            foobj.close();
            
        }
        else
        {
            System.out.println("This file does not exist");
        }

        keyboard.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Output :
// 
//  Enter the source file : 
//  program61_1.java
//  Enter the destination file : 
//  Dest.txt   
//  This file exists
//  File copied succesfully
// 
////////////////////////////////////////////////////////////////////////////////////////////////////////