import java.io.*;
import java.net.*;

class Nuke2{
    public static void main(String[] arg) throws Exception{
        BufferedReader keyboard;
        String inputLine;
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        inputLine = keyboard.readLine();
        String front = inputLine.substring(0,1);
        String Back = inputLine.substring(2);
        String output = front+Back;
        System.out.println(output);
    }
}
