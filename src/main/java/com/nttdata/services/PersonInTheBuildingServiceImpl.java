package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import com.nttdata.repository.Person;
import com.nttdata.repository.PersonRepository;

/**
 * 
 * Formación - Spring - Tareas
 * 
 * Implementación del servicio
 * 
 * @author Salva Castillo
 *
 */
public class PersonInTheBuildingServiceImpl implements PersonInTheBuildingServiceI {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person addNewPerson(Person newPerson) {
		// Verificación de nulidad.
				if (newPerson != null && newPerson.getId() == null) {

					// Insercción de cliente.
					newPerson = personRepository.save(newPerson);
				}

				return newPerson;
	}

	@Override
	public void searchByName(String name) {
		// Obtención del listado de clientes por nombre.
				final List<Person> searchPerson = personRepository.searchByName(name);

				// Muestra el listado obtenido.
				printPerson(searchPerson);

	}

	@Override
	public void searchByNameAndFamilyName(String name, String firstFamilyName, String secondFamilyName) {
		// Obtención del listado de clientes por nombre completo.
				final List<Person> searchPerson = personRepository.searchByNameAndFamilyName(name, firstFamilyName, secondFamilyName);

				// Muestra el listado obtenido.
				printPerson(searchPerson);

	}

	@Override
	public void searchAllPersons() {
		// Consulta clientes.
				final Iterable<Person> customerList = personRepository.findAll();

				// Itera e imprime los clientes.
				customerList.forEach((final Person person) -> System.out.println(person.toString()));
			}
	
	private void printPerson(final List<Person> searchPerson) {
		if (!CollectionUtils.isEmpty(searchPerson)) {
			for (Person customer : searchPerson) {
				System.out.println(customer.toString());
			}
		}
	}

}
