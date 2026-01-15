public class Conserje extends Persona implements Trabajador {
    private double salario;
    private String turno;

    public Conserje(double salario, String turno, String nombre, int edad, boolean genero, int id) {
        super(nombre, edad, genero, id);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
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
        System.out.println("El conserje está trabajando en el turno de " + turno);
    }

    @Override
    public void vacaciones() {  
        System.out.println("El conserje tiene derecho a 10 días de vacaciones al año.");
    }
    
}
