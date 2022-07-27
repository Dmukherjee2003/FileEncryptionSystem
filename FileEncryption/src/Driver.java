import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
    private String text;
    private int charecters;
    private File file;

    public Driver()
    {

    }

    public Driver(String text, int charecters, File file) {
        this.text = text;
        this.charecters = charecters;
        this.file = file;
    }

    public Driver(int charecters, File file) {
        this.charecters = charecters;
        this.file = file;
    }

    public Driver(String text, int charecters) {
        this.text = text;
        this.charecters = charecters;
    }

    public void encrypt(String pathway) throws FileNotFoundException {
        File aFile = new File(pathway);
        Scanner scnr = new Scanner(aFile);
        //char[] alphabets = {'a', 'b', 'c', 'd', 'e' , 'f','g', 'h', 'i', 'j',
                                  //'k' , 'l','m', 'n', 'o', 'p','q' ,'r','s',
                                 // 't', 'w', 'x', 'w', 'z'};
        while (scnr.hasNextLine())
        {
            String line = scnr.nextLine();
            char[] letters = line.toCharArray();

            for(char f : letters)
            {
                f += 5;
                String line2 = String.valueOf(f);
                System.out.print(line2);
            }

        }
    }
    public void decrypt(String pathway) throws FileNotFoundException {
        File afile = new File(pathway);
        Scanner scr = new Scanner(afile);

        while(scr.hasNextLine())
        {
            String line = scr.nextLine();
            char[] letters = line.toCharArray();

            for(char f : letters)
            {
                f-= 5;
                String line2  = String.valueOf(f);
                System.out.print(line2);
            }
        }
    }
}
