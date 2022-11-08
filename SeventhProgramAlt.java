import java.io.*;
public class ToggleString
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        String input=br.readLine();
        int len=input.length();
        int i;
        System.out.print("New String: ");
        for(i=0; i<len; i++)
        {
            ch=input.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ch=ch+32;
                System.out.print((char)ch);
            }
            else if(ch>=97 && ch<=122)
            {
                ch=ch-32;
                System.out.print((char)ch);
            }
            else
            {
                System.out.print((char)ch);
            }
        }
    }
}
