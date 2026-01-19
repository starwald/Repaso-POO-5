public class ControladorAgenda {

    public static void agendarVisita(Familiar familiar, PersonaMayor paciente){
        System.out.println("  se agendó la visita del familiar " + familiar.getNombre() + " al paciente " + paciente.getNombre());
    }
}
