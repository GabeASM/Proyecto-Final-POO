package login_trabajo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConexionMYSQLTest {
    ConexionMYSQL c;


    @BeforeEach
    void setUp() {
        c = new ConexionMYSQL();

    }

    @AfterEach
    void tearDown() {
        c = null;
    }

    @Test
    void conectarBasedeDatos() {
        ConexionMYSQL conexion = new ConexionMYSQL();
        assertTrue(conexion.ConectarBasedeDatos());
    }
}