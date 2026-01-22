public class ControladorMedicamento {
    
    public void administrarMedicamento(Cuidador cuidador, PersonaMayor paciente, Medicamentos medicamento){
        System.out.println("  El medicamento disponible: " + medicamento.getListaMedicamentos());
        cuidador.administrarMedicamento(paciente);

    }


}
