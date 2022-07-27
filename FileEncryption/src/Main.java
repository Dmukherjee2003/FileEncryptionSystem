import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Welcome to the File Encryption System");
        System.out.println("Please choose an option");
        System.out.println("\t1) Encrypt a file");
        System.out.println("\t2) Decrypt a file");
        Scanner scr = new Scanner(System.in);
        int user = scr.nextInt();
        boolean app = true;

        while(app == true)
        {
            Scanner sc = new Scanner(System.in);
            if(user == 1)
            {
                System.out.println("Please enter the file pathway (txt file only)");
                Driver d = new Driver();
                System.out.println("Please enter the file pathway");
                //String pathway = sc.nextLine();
                d.encrypt("/Users/dhruvmukherjee/IdeaProjects/FileEncryption/src/TextFile.txt");
                app = false;
            }
            else if(user == 2)
            {
                Driver d = new Driver();
                System.out.println("Please enter the file pathway");
                //String pathway = sc.nextLine();
                d.decrypt("/Users/dhruvmukherjee/IdeaProjects/FileEncryption/src/TextFile.txt");
                app = false;

            }
            else
            {
                System.out.println("Please choose a valid option");
                String pathway = sc.nextLine();

            }

        }










    }
}