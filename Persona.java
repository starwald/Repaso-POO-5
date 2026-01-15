public class Persona {
    
    // ATRIBUTOS
    int id;
    String nombre;
    int edad;
    boolean masculino;
    int numeroTel;
    int numHabitacion;


    // CONSTRUCTORES
    public Persona(){

    }

    public Persona(String nombre, int edad, boolean masculino, int numeroTel){
        this.nombre = nombre;
        this.edad = edad;
        this.masculino = masculino;
        this.numeroTel = numeroTel;
        this.id ++;
    }



}
