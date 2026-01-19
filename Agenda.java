import java.util.ArrayList;

public class Agenda {
    private ArrayList<Persona> contactos;

    public Agenda() {
        contactos = new ArrayList<Persona>();
    }

    public void agregarContacto(Persona p) {
        contactos.add(p);
    }

    public void mostrarContactos() {
        for (Persona p : contactos) {
            System.out.println("  Nombre: " + p.getNombre() + ", Edad: " + p.getEdad() + ", Teléfono: " + p.getNumeroTel());
        }
    }

    public void agendarVisita(Familiar familiar, PersonaMayor paciente){
        System.out.println("  se agendó la visita del familiar " + familiar.getNombre() + " al paciente " + paciente.getNombre());
    }
    
}
