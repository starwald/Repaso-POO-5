public class Familiar extends Persona {
    private String parentesco;
    private String telefonoContacto;

    public Familiar(String parentesco, String telefonoContacto, String nombre, int edad, boolean genero, int numeroTel) {
        super(nombre, edad, genero, numeroTel);
        this.parentesco = parentesco;
        this.telefonoContacto = telefonoContacto;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
}
