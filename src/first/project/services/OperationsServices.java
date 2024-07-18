package first.project.services;

import first.project.dto.PersonaDTO;
import first.project.dto.EmpleadoDTO;

/**
 * OperationsServices class provides methods to register, update, and delete PersonaDTO and EmpleadoDTO objects.
 *
 * Author: Francisco Lujano
 * Project: primer-proyecto
 * Created: 09/07/2024 - 10:19 a.m.
 */
public class OperationsServices {

    public PersonaDTO register(String nombre, String apellido, int edad, String direccion) {
        return new PersonaDTO(nombre, apellido, edad, direccion);
    }

    public PersonaDTO register(PersonaDTO persona) {
        // save DB
        return persona;
    }

    public EmpleadoDTO registerEmpleado(String nombre, String apellido, int edad, String direccion, String puesto) {
        return new EmpleadoDTO(nombre, apellido, edad, direccion, puesto);
    }

    public EmpleadoDTO registerEmpleado(EmpleadoDTO empleado) {
        // save DB
        return empleado;
    }

    public PersonaDTO update(PersonaDTO persona) {
        // update DB
        return persona;
    }

    public EmpleadoDTO update(EmpleadoDTO empleado) {
        // update DB
        return empleado;
    }

    public boolean delete(PersonaDTO persona) {
        // delete from DB
        return true; // o false si no se pudo eliminar
    }

    public boolean delete(EmpleadoDTO empleado) {
        // delete from DB
        return true; // o false si no se pudo eliminar
    }
}
