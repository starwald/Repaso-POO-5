import java.util.ArrayList;

public class Medicamentos {
    private static ArrayList<String> listaMedicamentos;


    public Medicamentos() {
        this.listaMedicamentos = new ArrayList<String>();
        listaMedicamentos.add("paracetamol");
        listaMedicamentos.add("ibuprofeno");
        listaMedicamentos.add("aspirina");
        listaMedicamentos.add("amoxicilina");
    }  


    public void agregarMedicamento(String nombreMedicamento){
        this.listaMedicamentos.add(nombreMedicamento);
    }


    public static ArrayList<String> getListaMedicamentos() {
        return listaMedicamentos;
    }


}
