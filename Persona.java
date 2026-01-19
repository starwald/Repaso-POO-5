public class Persona {
    
    // ATRIBUTOS
    private int id;
    private String nombre;
    private int edad;
    private boolean masculino;
    private int numeroTel;
    private int numHabitacion;


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

    public String getNombre(){
        return this.nombre;
    }

    public int getNumeroTel(){
        return this.numeroTel;
    }

    public int getEdad(){
        return this.edad;
    }



}
