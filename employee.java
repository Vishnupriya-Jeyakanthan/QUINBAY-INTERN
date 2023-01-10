package File;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;

public class employee
{
    public static void main (String args[]) {
        System.out.println("Reading the file");
        try {
            File f1 = new File("/Users/vishnupriya/employees.txt");
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                String dum = dataReader.nextLine();
                System.out.println(dum);
            }
        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
        try
        {

            File f1 = new File("/Users/vishnupriya/employees.txt"); //Creation of File Descriptor for input file
            String[] words = null;  //Intialize the word Array
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
            String s;
            String input1 = "DEV";
            String input2 = "QA";
            String input3 = "MANAGER";
        //dev
            if (true)
            {
                while ((s = br.readLine()) != null)   //Reading Content from the file
                {
                    words = s.split(",");  //Split the word using space
                    for (String word : words)
                        if (word.equals(input1))   //Search for the given word
                        {
                            StringBuilder sb = new StringBuilder();
                            String strLine = ",";
                            List<String> list = new ArrayList<String>();
                            try {
                                BufferedReader br1 = new BufferedReader(new FileReader("/home/students/test.txt"));
                                while (strLine != null) {
                                    strLine = br1.readLine();
                                    sb.append(strLine);
                                    sb.append(System.lineSeparator());
                                    strLine = br1.readLine();
                                    if (strLine == null)
                                        break;
                                    list.add(strLine);
                                }
                                System.out.println(Arrays.toString(list.toArray()));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                }
            }
            //qa
            if (true)
            {
                while ((s = br.readLine()) != null)
                {
                    words = s.split(",");
                    for (String word : words)
                    {
                        if (word.equals(input2))
                        {
                            StringBuilder sb = new StringBuilder();
                            String strLine = ",";
                            List<String> list = new ArrayList<String>();
                            try
                            {
                                BufferedReader br2 = new BufferedReader(new FileReader("/home/students/test.txt"));
                                while (strLine != null)
                                {
                                    strLine = br2.readLine();
                                    sb.append(strLine);
                                    sb.append(System.lineSeparator());
                                    strLine = br2.readLine();
                                    if (strLine == null)
                                        break;
                                    list.add(strLine);
                                }
                                System.out.println(Arrays.toString(list.toArray()));
                            }
                            catch(IOException e)
                            {
                                e.printStackTrace();
                            }

                        }
                    }

                }
            }

//manager
            if (true)
            {
                while ((s = br.readLine()) != null)   //Reading Content from the file
                {
                    words = s.split(",");  //Split the word using space
                    for (String word : words)
                    {
                        if (word.equals(input3))   //Search for the given word
                        {
                            StringBuilder sb = new StringBuilder();
                            String strLine = ",";
                            List<String> list = new ArrayList<String>();
                            try
                            {
                                BufferedReader br3 = new BufferedReader(new FileReader("/home/students/test.txt"));
                                while (strLine != null)
                                {
                                    strLine = br3.readLine();
                                    sb.append(strLine);
                                    sb.append(System.lineSeparator());
                                    strLine = br3.readLine();
                                    if (strLine == null)
                                        break;
                                    list.add(strLine);
                                }
                                System.out.println(Arrays.toString(list.toArray()));
                            }
                            catch(IOException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        }

        catch (IOException e)
        {
            System.out.println("error occured");
        }


    }
}
