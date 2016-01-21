package client;

/**
 * Created by Clement on 21/01/2016.
 */
import java.io.*;
import java.net.*;

public class Client {

    public static Socket socket = null;
    public static Thread tConnexion;

    public static void main(String[] args) {


        try {

            System.out.println("Demande de connexion");
            socket = new Socket("127.0.0.1",2009);
            System.out.println("Connexion établie avec le serveur, authentification :"); // Si le message s'affiche c'est que je suis connecté

            tConnexion = new Thread(new Connexion(socket));
            tConnexion.start();



        } catch (UnknownHostException e) {
            System.err.println("Impossible de se connecter à l'adresse "+socket.getLocalAddress());
        } catch (IOException e) {
            System.err.println("Aucun serveur à l'écoute du port "+socket.getLocalPort());
        }



    }

}

