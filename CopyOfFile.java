import java.io.*;

public class CopyOfFile {
    public static void main(String arg[]) throws IOException {
        int i;
        FileInputStream fi;
        FileOutputStream fo;
        try {
            try {
                fi = new FileInputStream(arg[0]);
            } catch (FileNotFoundException e) {
                System.out.println("Input File not found");
                return;
            }
            try {
                fo = new FileOutputStream(arg[1]);
            } catch (FileNotFoundException e) {
                System.out.println("output file not found");
                return;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Files names was not mentioned in Command line Arguments");
            return;
        }
        try {
            do {
                i = fi.read();
                if (i != -1) {
                    fo.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File error");
        }
        fi.close();
        fo.close();
    }
}
