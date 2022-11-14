package com.nttdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * Formación - Spring - Tareas
 * 
 * Repositorio
 * 
 * @author Salva Castillo
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	/**
	 * Busqueda por nombre
	 * 
	 * @param name
	 * @return List<Person>
	 */
	public List<Person> searchByName(final String name);
	
	/**
	 * Busqueda por nombre y apellidos
	 * 
	 * @param name
	 * @param firstFamilyName
	 * @param secondFamilyName
	 * @return List<Person>
	 */
	public List<Person> searchByNameAndFamilyName(final String name, final String firstFamilyName, final String secondFamilyName);

}
