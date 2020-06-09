package manipulatingfilesanddirectories;
import java.util.*;
import java.io.*;

public class MAIN
{
    public static void main(String[] args) throws Exception
    {
        // Path to file.
        File path = new File("D:/test/mytext.txt");

        // Check path exists or not?
        System.out.println("Path exists? " + path.exists());

        if (path.exists())
        {
            // Check is "path" directory or not?
            System.out.println("Directory? " + path.isDirectory());

            // Is "path" a hidden path?
            System.out.println("Hidden? " + path.isHidden());

            // Name file.
            System.out.println("Name: " + path.getName());

            // Absolute Path.
            System.out.println("Absolute Path: " + path.getAbsolutePath());

            // Check the file size(byte).
            System.out.println("Size(bytes): " + path.length());

            // Last modified time (mili second)
            long lastMofifyInMillis = path.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);
            System.out.println("Last modify date: " + lastModifyDate);

            //-------------------------------------------------------------//
            //---Read - Write---//
            
            String FILE_URL = "D:/test/data.txt";
            System.out.print("\n\n ----- Read Data -----\n");
            File file = new File(FILE_URL);
            InputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int c;
            while ((c = inputStreamReader.read()) != -1)
                System.out.print((char) c);
            inputStream.close();

            String FILE_URL2 = "D:/test/data2.txt";
            System.out.print("\n\n ----- Write Data -----\n");
            File file2 = new File(FILE_URL2);
            OutputStream outputStream = new FileOutputStream(file2);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            
            String[] data =
            {
                "Hello Java!",
                "I try to type this text to file.",
                "And now im success.",
                "Bravooo!!!"
            };
            for (String item: data)
            {
                outputStreamWriter.write(item);
                outputStreamWriter.write("\n");
            }
            System.out.print("DONE!");

            // Đây là phương thức quan trọng!
            // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
            outputStreamWriter.flush();
            outputStream.close();
        }
    }
}