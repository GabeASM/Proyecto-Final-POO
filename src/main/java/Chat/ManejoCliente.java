package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class ManejoCliente implements Runnable,ICerrar{

    //Hace un seguimiento de todos los clientes para que cada vez que un cliente envíe un mensaje podamos recorrer el array y enviar el mensaje a cada cliente
    public static ArrayList<ManejoCliente> manejoClientes = new ArrayList<>();
    private Socket socket;
    private DataInputStream entrada;
    private DataOutputStream salida;
    private String nombreUsuario;

    public ManejoCliente(Socket socket) {

        try {
            this.socket = socket;
            this.salida = new DataOutputStream(socket.getOutputStream());
            this.entrada = new DataInputStream(socket.getInputStream());
            this.nombreUsuario = entrada.readUTF();
            manejoClientes.add(this);
            mostrarMensaje("\nSERVIDOR: " + nombreUsuario + " se ha unido chat!");
        }catch (IOException e) {
            cerrarTodo(socket, entrada, salida);
        }

    }

    //Espera a que llegen mensajes
    //Se hace en un hilo para que trabaje separado del programa ya que se atasca en esta operacion
    @Override
    public void run() {

        String msgDelCliente;

        while (socket.isConnected()) {

            try {
                msgDelCliente = entrada.readUTF();
                mostrarMensaje(msgDelCliente);
            } catch (IOException e) {
                cerrarTodo(socket, entrada, salida);
                break;
            }

        }

    }

    //Enviar un mensaje que un cliente escribió a todos en el chat grupal
    public void mostrarMensaje(String msgParaEnviar) {

        for (ManejoCliente manejoCliente : manejoClientes) {

            try {

                if (!manejoCliente.nombreUsuario.equals(nombreUsuario)) {
                    manejoCliente.salida.writeUTF(msgParaEnviar);
                    manejoCliente.salida.flush();
                }

            }catch (IOException e) {
                cerrarTodo(socket, entrada, salida);
            }

        }

    }

    public void eliminarManejoCliente() {
        manejoClientes.remove(this);
        mostrarMensaje("\nSERVIDOR: " + nombreUsuario + " ha salido del chat!");
    }

    public void cerrarTodo(Socket socket, DataInputStream entrada, DataOutputStream salida) {

        eliminarManejoCliente();
        try {

            if (entrada != null){
                entrada.close();
            }

            if (salida != null) {
                salida.close();
            }

            if (socket != null) {
                socket.close();
            }

        }catch (IOException e) {
            System.out.println(e);
        }

    }

}
