package lab3_3;
import java.io.*;
import java.util.Scanner;
import java.lang.String;
import java.io.IOException;
import java.io.FileReader;
import java.util.Objects;
public class lab3_3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        Scanner scanner = new Scanner(fr);
        String string = scanner.nextLine();
        String newString;
        System.out.println("vvedite 2 simbola");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String ob;
if((Objects.equals(s1,")")&&Objects.equals(s2,"("))
    ||(Objects.equals(s1,"}")&&Objects.equals(s2,"{"))
        ||(Objects.equals(s1,"]")&&Objects.equals(s2,"[")))
        {
    ob=s1;
    s1=s2;
    s2=ob;
}
        int ind1 = -1;
        ind1 = string.indexOf(s1);
        int ind2 = -1;
        String stt= string.substring(ind1+1);
        ind2 = stt.indexOf(s2)+ind1+1;

        if ((ind1 == -1) || (ind2 == -1) || (ind1==ind2)) {
            System.out.println("ne ydalyaem");
        }
        else{
            newString = string.substring(0, ind1) + string.substring(ind2 + 1);
            System.out.println(newString);
        }

        fr.close();
    }

}