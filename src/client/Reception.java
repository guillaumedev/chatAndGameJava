package client;

/**
 * Created by Clement on 21/01/2016.
 */
import java.io.BufferedReader;
import java.io.IOException;


public class Reception implements Runnable {

    private BufferedReader in;
    private String message = null;

    public Reception(BufferedReader in){

        this.in = in;
    }

    public void run() {

        while(true){
            try {

                message = in.readLine();
                System.out.println(message);

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

}

