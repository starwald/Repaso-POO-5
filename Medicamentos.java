import java.util.ArrayList;

public class Medicamentos {
    private String nombre;
    private static ArrayList<String> listaMedicamentos;


    public Medicamentos() {
        this.listaMedicamentos = new ArrayList<String>();
        listaMedicamentos.add("paracetamol");
        listaMedicamentos.add("ibuprofeno");
        listaMedicamentos.add("aspirina");
        listaMedicamentos.add("amoxicilina");
    }  


    public String getNombre() {
        return nombre;
    }

    public void agregarMedicamento(String nombreMedicamento){
        this.listaMedicamentos.add(nombreMedicamento);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<String> getListaMedicamentos() {
        return listaMedicamentos;
    }


}
