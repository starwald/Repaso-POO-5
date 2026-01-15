public class PersonaMayor extends Persona {
    private String diagnostico;
    private boolean medicamentos;
    private int habitacion;


    public PersonaMayor(String diagnostico, boolean medicamentos, int habitacion, String nombre, int edad, boolean genero) {
        super(nombre, edad, genero, 22344);
        this.diagnostico = diagnostico;
        this.medicamentos = medicamentos;
        this.habitacion = habitacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public boolean getMedicamentos() {
        return medicamentos;
    }

    public boolean setMedicamentos(boolean medicamentos) {
        return this.medicamentos = medicamentos;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    
}
