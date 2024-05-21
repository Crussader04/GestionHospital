public class Doctor  extends Persona implements GestionCita{
    //atributos
    private String identificacion;

    //relaciones
    private Especialidad especialidad;
    private Paciente paciente;
    private CitaMedica citaMedica;
    private Enfermero enfermero;

    //metodos
    public Especialidad doctor(Especialidad especialidad){
        this.especialidad = especialidad;
        return especialidad;
    }
    public Especialidad getEspecialidad(){
        return especialidad;
    }

    @Override
    public void programarCita() {

    }

    @Override
    public void cancelarCita() {

    }

    @Override
    public void realizarCita() {

    }
}
