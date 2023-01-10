//import java.io.*;
//
//public class mainsamp
//{
//
//    public static void main(String args[])throws Exception
//    {
//        File f1 = new File("/Users/vishnupriya/employees.txt");
//        BufferedReader br = new BufferedReader(new FileReader(f1));
//        String str;
//        File obj = new File("C:\\samp.txt");
//        if(obj.createNewFile())
//        {
//            System.out.println("File created");
//        }
//        else
//        {
//            System.out.println("File already exsists");
//        }
//        FileWriter fwrite = new FileWriter("C:\\samp.txt");
//                try (BufferedReader br1 = new BufferedReader(new FileReader(obj)))
//                {
//                    String str1;
//                    while((str = br.readLine())!= null)
//                    {
//                        while(true)
//                        {
//
//                        }
//                        fwrite.write(str+"\n");
//                    }
//                    fwrite.close();
//                }
//                catch (Exception e)
//                {
//                    System.out.println("some error occured");
//                    e.printStackTrace();
//                }
//
//
//
//    }
//
//
//}
