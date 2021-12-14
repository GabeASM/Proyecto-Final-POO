package Chat;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente implements  ICerrar {

    private Socket socket;
    private DataInputStream entrada;
    private DataOutputStream salida;
    private String nombreUsuario;
    private JTextArea areaTexto;

    public Cliente(Socket socket, String nombreUsuario, JTextArea areaTexto) {

        try {
            this.socket = socket;
            this.salida = new DataOutputStream(socket.getOutputStream());
            this.entrada = new DataInputStream(socket.getInputStream());
            this.nombreUsuario = nombreUsuario;
            this.areaTexto = areaTexto;

        }catch (IOException e) {
            cerrarTodo(socket, entrada, salida);
        }

    }


    // Recibe mensajes de otros clientes
    public void escucharMensaje() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgChatGeneral;

                while (socket.isConnected()) {

                    try {
                        msgChatGeneral = entrada.readUTF();
                        System.out.println(msgChatGeneral);
                        areaTexto.append("\n" + msgChatGeneral);
                    }catch (IOException e) {
                        cerrarTodo(socket, entrada, salida);
                    }

                }

            }
        }).start();

    }

    public void cerrarTodo(Socket socket, DataInputStream entrada, DataOutputStream salida) {

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
