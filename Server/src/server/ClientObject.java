package server;

import java.io.*;
import java.net.Socket;

public class ClientObject implements Runnable{
    Socket socket;
    BufferedWriter writer = null;
    BufferedReader reader = null;
    public ClientObject(Socket socket) throws IOException {
        this.socket = socket;
        writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {
        try{
            while(true){
                read();
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        finally {
            close(reader, writer);
        }

    }

    private void close(BufferedReader reader, BufferedWriter writer) {
        try {
            reader.close();
            writer.close();
            socket.close();
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    public void read() throws IOException {
        String request = reader.readLine();
        System.out.println("client" + request);
        sendMessage("Hello from server");
        //обработка вопросов
    }

    public void sendMessage(String s){
        try{
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }

    }
}
