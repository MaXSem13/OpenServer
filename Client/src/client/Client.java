package client;

import java.io.*;
import java.net.Socket;

public class Client {
    BufferedWriter writer = null;
    BufferedReader reader = null;
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 8000);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = reader.readLine();
            System.out.println(s);
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }
    }

}
