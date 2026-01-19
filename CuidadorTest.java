import org.junit.Test;
import static org.junit.Assert.*;

public class CuidadorTest {
    
    @Test
    public void testCalcularSalario(){
        
        // Se crea un objeto cuidador para ejecutar las pruebas
        Cuidador CuidadorDePrueba = new Cuidador("Nocturno", 1500.50, "Pepe", 23, true, 101);

        // Se manda a llamar el método que se quiere evaluar, si se desea se puede guardar el resultado en una variable
        // o colocarlo directamente en el assertEquals
        double ResultadoCalculado = CuidadorDePrueba.calcularSalario();

        // Se coloca en el primer espacio el resultado que se esperaba, en el segundo el resultado que se obtuvo 
        // y en el tercero un delta que indica que si al comparar los resultados la diferencia es menor a nuetro
        // delta, se consideran valores iguales
        assertEquals(1500.50, ResultadoCalculado, 0.1);

        // AssertEquals es un método que valida si una condición es verdadera o no, si falla la prueba reporta el error y detiene la ejecución
    }

    @Test
    public void testAsignacionDeTurno() {

        Cuidador CuidadorDePrueba = new Cuidador("Matutino", 2800, "Edu", 25, false, 102);

        // se pone a prueba el método de getTurno
        String turnoObtenido = CuidadorDePrueba.getTurno();

        // no se necesita delta ya que se está trabajando con letras
        assertEquals("Matutino", turnoObtenido);
    }

    @Test
    public void testCambioDeTurno() {

        Cuidador CuidadorDePrueba = new Cuidador("Matutino", 2800, "Pedro", 40, true, 103);

        // se pone a prueba el método setTurno 
        CuidadorDePrueba.setTurno("Vespertino");

        assertEquals("Vespertino", CuidadorDePrueba.getTurno());
    }
    
}
