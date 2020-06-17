
/**
 * Write a description of class AsciiValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AsciiValue
{
  public static void main(String[] args) {
        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}