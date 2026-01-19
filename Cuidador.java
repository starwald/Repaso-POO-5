public class Cuidador extends Persona implements Trabajador {
    private String turno;
    private double salario;

    public Cuidador(String turno, double salario, String nombre, int edad, boolean genero, int id) {
        super(nombre, edad, genero, id);
        this.turno = turno;
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public void trabajar() {
        System.out.println("  El cuidador está trabajando en el turno de " + turno);
    }

    @Override
    public void vacaciones() {
        System.out.println("  El cuidador tiene derecho a 15 días de vacaciones al año.");
    }


    public void administrarMedicamento(PersonaMayor paciente){
        
        if(paciente.getMedicamentos()){
            System.out.println("  El cuidador " + this.nombre + " ya le ha dado sus medicamentos a " + paciente.nombre);
        } else{
            System.out.println("  El cuidador " + this.nombre + " le está administrando sus medicamentos a " + paciente.nombre + "........ Listo, se han administrado correctamente");
            paciente.setMedicamentos(true);
        }
    }
}
