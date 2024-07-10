package first.project.services;

import first.project.dto.PersonaDTO;

/**
 * OperationsServices class provides methods to register, update, and delete PersonaDTO objects.
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

    public PersonaDTO update(PersonaDTO persona) {
        // update DB
        return persona;
    }
    // Recibe un objeto PersonaDTO y actualiza su información en la base de datos.

    public boolean delete(PersonaDTO persona) {
        // delete from DB
        return true; // o false si no se pudo eliminar
    }
    // Recibe un objeto PersonaDTO y elimina la información de esa persona de la base de datos.
    // Devuelve un booleano que indica si la operación fue exitosa o no.
}
