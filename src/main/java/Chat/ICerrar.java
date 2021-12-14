package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public interface ICerrar {
    void cerrarTodo(Socket socket, DataInputStream entrada, DataOutputStream salida);
}
