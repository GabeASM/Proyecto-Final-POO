package Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private ServerSocket serverSocket;

    public Servidor(ServerSocket serverSocket) throws IOException {
        this.serverSocket = serverSocket;
    }

    public void iniciarServidor(){

        try {

            while (!serverSocket.isClosed()) {

                Socket socket = serverSocket.accept();
                System.out.println(" Un nuevo cliente se ha conectado!");
                ManejoCliente manejoCliente = new ManejoCliente(socket);

                Thread hilo = new Thread(manejoCliente);
                hilo.start();

            }

        }catch (IOException e){
            System.out.println(e);
        }

    }

    public void cerrarServerSocket() {

        try {

            if (serverSocket != null) {
                serverSocket.close();
            }

        }catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8989);
        Servidor servidor = new Servidor(serverSocket);
        servidor.iniciarServidor();
    }

}
