package first.project;

import first.project.dto.PersonaDTO;
import first.project.services.OperationsServices;

public class Main {
    public static void main(String[] args) {
        /**
         * Aqui se instancia la clase de servicios
         */
        OperationsServices operationsServices = new OperationsServices();

        PersonaDTO persona = operationsServices.register("Juan", "Perez", 30);

        System.out.println(persona);
    }
}

