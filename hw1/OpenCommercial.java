/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String website = "http://www." + inputLine + ".com/";
    URL w = new URL(website);
    BufferedReader in = new BufferedReader(new InputStreamReader(w.openStream()));
    String p0,p1,p2,p3,p4;
    p0 = in.readLine();
    p1 = in.readLine();
    p2 = in.readLine();
    p3 = in.readLine();
    p4 = in.readLine();
    System.out.println(p4);
    System.out.println(p3);
    System.out.println(p2);
    System.out.println(p1);
    System.out.println(p0);
  }
}
