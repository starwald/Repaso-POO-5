public class Main {
    public static void main(String[] args) {

        Medicamentos listaMedicamentos = new Medicamentos();
        Agenda agenda = new Agenda();
        
        // se crea al cuidador
        Cuidador cuidadorPrincipal = new Cuidador("matutino", 6500, "Pepe", 24, true, 0);

        // se muestra en pantalla información del cuidador
        System.out.println("\nTRABAJADORES DEL HOGAR");
        cuidadorPrincipal.trabajar();
        cuidadorPrincipal.vacaciones();

        // se crean instancias de personas mayores para simular abuelitos
        PersonaMayor abuelito = new PersonaMayor("Diabetes", false, 1, "Mario", 80, true, 44440000);
        PersonaMayor abuelita = new PersonaMayor("Alzheimer", true, 2, "Carmen", 76, false, 23232323);

        // se agregan las instancias a la agenda
        agenda.agregarContacto(abuelito);
        agenda.agregarContacto(abuelita);
        System.out.println("  Se registraron 2 residentes nuevos");
        System.out.println("");

        // se prueban los métodos del cuidador
        System.out.println("ADMINISTRACIÓN DE MEDICAMENTO ");
        cuidadorPrincipal.administrarMedicamento(abuelita);
        cuidadorPrincipal.administrarMedicamento(abuelito);

        // se instancia un familiar para agendar visitas
        System.out.println("\nVISITAS ");
        Familiar familiar1 = new Familiar("Hijo", "Juan", 34, true, 10101010);
        agenda.agregarContacto(familiar1);

        ControladorAgenda.agendarVisita(familiar1, abuelita);

        // se muestra en pantalla los contactos ingresados en la agenda
        System.out.println("\nREPORTE DE LA AGENDA");
        agenda.mostrarContactos();
        System.out.println("");

        System.out.println();

        System.out.println(Medicamentos.getListaMedicamentos());

    }
}
