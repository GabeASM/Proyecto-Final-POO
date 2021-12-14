package Chat;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.stream.Stream;

public class PanelCliente extends javax.swing.JFrame{
    //Variables del panel
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtTexto;
    private javax.swing.JTextField txtTextoEnviar;
    //Variables del cliente
    private Cliente cliente;
    private DataOutputStream salida;
    private String nombreUsuario;
    private Socket socket;

    public PanelCliente(String nombreUsuario) throws IOException {
        //Arma el panel gráfico
        initComponents();
        this.getRootPane().setDefaultButton(this.btnEnviar);
        //Crea los datos necesarios
        this.socket = new Socket("192.168.56.1", 8989);
        this.salida = new DataOutputStream(socket.getOutputStream());
        this.nombreUsuario = nombreUsuario;
        this.cliente = new Cliente(socket,nombreUsuario,txtTexto);
        cliente.escucharMensaje();
        //Se envía el nombre de usuario para que siga que ha entrado al chat
        salida.writeUTF(nombreUsuario);
        salida.flush();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        txtTextoEnviar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        txtTextoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoEnviarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnEnviarActionPerformed(evt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTextoEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtTextoEnviar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Las acciones que realiza el botón de enviar
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        try {

            String mensaje = txtTextoEnviar.getText();
            String mensajeValidado = validarEmojis(mensaje);
            salida.writeUTF( nombreUsuario + ": " + mensajeValidado);
            salida.flush();
            txtTexto.append("\n" + "Tú: " + mensajeValidado);

            if (txtTextoEnviar.getText().equals("*emojis*")){
                txtTexto.append("\n" + "Usa los siguientes comandos para poner emojis:");
                txtTexto.append("\n*emojis tristes*" + "\n*emojis felices*");
            }
            if (txtTextoEnviar.getText().equals("*emojis tristes*")){
                String emojis = Stream.of("      :(      ","     :'(     ","    D:   " ,"    >:c    ")
                        .reduce("",(a, b)-> a + "" + b);
                System.out.println(emojis);
                txtTexto.append("\n" + "Usa los siguientes caracteres para poner emojis tristes: \n" + emojis);
            }
            if (txtTextoEnviar.getText().equals("*emojis felices*")){
                String emojis = Stream.of("     :)     ","              :3        ","            :P ", "         XD         ", "           ;)       ")
                        .reduce("",(a, b)-> a + "" + b);
                System.out.println(emojis);
                txtTexto.append("\n" + "Usa los siguientes caracteres para poner emojis felices: \n" + emojis);
            }

        }catch (IOException e) {
            System.out.println(e);
        }

    }

    private void txtTextoEnviarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        //No realiza ninguna función en específico, solo que el texto puesto aquí lo obtiene la acción del botón para enviarlo
    }
    private String validarEmojis(String mensaje) {
        mensaje = mensaje.replace(":)", "\uD83D\uDE04");
        mensaje = mensaje.replace(":)", "\uD83D\uDE03");
        mensaje = mensaje.replace(":3", "\uD83D\uDE0A");
        mensaje = mensaje.replace(":P", "\uD83D\uDE1C");
        mensaje = mensaje.replace(":(", "\uD83D\uDE14");
        mensaje = mensaje.replace(":'(", "\uD83D\uDE22");
        mensaje = mensaje.replace("D:", "\uD83D\uDE29");
        mensaje = mensaje.replace(">:c", "\uD83D\uDE21");
        mensaje = mensaje.replace("XD", "\uD83E\uDD23");
        mensaje = mensaje.replace(";)", "\uD83D\uDE09");
        return mensaje;
    }



}
