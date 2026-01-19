public class Familiar extends Persona {
    private String parentesco;

    public Familiar(String parentesco, String nombre, int edad, boolean genero, int numeroTel) {
        super(nombre, edad, genero, numeroTel);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getTelefonoContacto() {
        return numeroTel;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.numeroTel = telefonoContacto;
    }
    
}
