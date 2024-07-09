package first.project.services;

import first.project.dto.PersonaDTO;

/**
 * @author (Francisco Lujano) Development analyst
 * @project primer-proyecto
 * @created 09/07/2024 - 10:19 a. m.
 */
public class OperationsServices {

    public PersonaDTO register(String nombre, String apellido, int edad ){
        PersonaDTO persona = new PersonaDTO(nombre, apellido, edad);
        /**
         * save DB
         */
        return persona;
    }


    public PersonaDTO register(PersonaDTO persona){
        /**
         * save DB
         */
        return persona;
    }

}
