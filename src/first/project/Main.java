package first.project;

import first.project.dto.PersonaDTO;
import first.project.services.OperationsServices;

public class Main {
    public static void main(String[] args) {
        // Instanciar la clase de servicios
        OperationsServices operationsServices = new OperationsServices();

        // Registrar una persona con todos los atributos
        PersonaDTO persona = operationsServices.register("Juan", "Perez", 30, "Calle Falsa 123");

        // Mostrar los detalles de la persona
        System.out.println(persona);

        // Mostrar si la persona es mayor de edad
        if (persona.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}
