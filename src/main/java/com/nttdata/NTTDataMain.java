package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repository.Person;
import com.nttdata.services.PersonInTheBuildingServiceI;

/**
* 
* Formación - Spring - Tareas
* 
* Clase principal
* 
* @author Salva Castillo
*
*/
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner{

	/**Servicio de administración de personas*/
	@Autowired
	private PersonInTheBuildingServiceI personService;
	
	/**
	 * Método main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{

		// Nuevas personas.
		final Person newPerson1 = new Person();
		newPerson1.setName("Juan");
		newPerson1.setFirstFamilyName("Torres");
		newPerson1.setSecondFamilyName("Martínez");
		newPerson1.setIdDocument("1234567G");
		personService.addNewPerson(newPerson1);

		final Person newPerson2 = new Person();
		newPerson2.setName("Patricia");
		newPerson2.setFirstFamilyName("Lopez");
		newPerson2.setSecondFamilyName("Blanco");
		newPerson2.setIdDocument("23456789L");
		personService.addNewPerson(newPerson2);

		final Person newPerson3= new Person();
		newPerson3.setName("Luis");
		newPerson3.setFirstFamilyName("García");
		newPerson3.setSecondFamilyName("Navarro");
		newPerson3.setIdDocument("18372184R");
		personService.addNewPerson(newPerson3);
		
		final Person newPerson4 = new Person();
		newPerson4.setName("Ana");
		newPerson4.setFirstFamilyName("Galo");
		newPerson4.setSecondFamilyName("Sanjenis");
		newPerson4.setIdDocument("92648323H");
		personService.addNewPerson(newPerson4);
		
		// Lista de personas.
		personService.searchAllPersons();
	
		// Busqueda de la pesona por nombre.
		personService.searchByName("Ana");

		// Obtiene los clientes por nombre y apellidos.
		personService.searchByNameAndFamilyName("Patricia","Lopez", "Blanco");
	}

}
