package SqlUsuarioTest;

import CrearCuenta.SqlUsuario;
import CrearCuenta.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import login_trabajo.ConexionMYSQL;

import static org.junit.jupiter.api.Assertions.*;

class SqlUsuarioTest {
    Usuario a;
    SqlUsuario usql;

    @BeforeEach
    void setUp() {
        a = new Usuario();
        usql = new SqlUsuario();

    }

    @AfterEach
    void tearDown() {
        a= null;
        usql = null;
    }

    @Test
    void registar() throws SQLException {

        //Test registrar creara un nuevo usuario, lo guardara en la base de datos para despues hacer una consulta y comparar los nombres.
        ConexionMYSQL Con = new ConexionMYSQL();
        Con.ConectarBasedeDatos();
        String u =  "JUNIT5 P12";
        String nuevoPass = "1234";
        String mail = "hola@gmail.com";
        a.setNombre(u);
        a.setContraseña(nuevoPass);
        a.setMail(mail);

        usql.registar(a);

        String SQL = "SELECT nombre FROM usuario " + "WHERE nombre='"+u+"' AND contraseña='"+nuevoPass+"'";
        Con.resultado = Con.sentencia.executeQuery(SQL);
        ResultSet resultado = Con.sentencia.executeQuery(SQL);
        resultado.next();
       // System.out.println(resultado.getString("nombre"));
        String nombre = resultado.getString("nombre");

        assertEquals(a.getNombre(),nombre);
    }


}