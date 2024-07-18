package first.project.dto;

public class EmpleadoDTO extends PersonaDTO {
    private String puesto; // Nuevo atributo específico de EmpleadoDTO

    // Constructor
    public EmpleadoDTO(String nombre, String apellido, int edad, String direccion, String puesto) {
        super(nombre, apellido, edad, direccion);
        this.puesto = puesto;
    }

    // Getter y Setter para el nuevo atributo
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Sobrescribir el método toString para incluir el nuevo atributo
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + puesto;
    }
}
