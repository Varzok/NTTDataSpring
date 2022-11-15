package com.nttdata.services;


import com.nttdata.repository.Person;

/**
 * 
 * Formación - Spring - Tareas
 * 
 * Servicio
 * 
 * @author Salva Castillo
 *
 */
public interface PersonInTheBuildingServiceI {
	
	/**
	 * Añade persona
	 * 
	 * @param newPerson
	 * @return
	 */
	public Person addNewPerson(final Person newPerson);
	
	/**
	 * Busca persona por nombre
	 * 
	 * @param name
	 */
	public void searchByName(final String name);
	
	/**
	 * Busca persona por nombre y apellidos
	 * 
	 * @param name
	 * @param firstFamilyName
	 * @param secondFamilyName
	 */
	public void searchByNameAndFamilyName(final String name, final String firstFamilyName, final String secondFamilyName);
	
	/**
	 * Busca todos los registros de persona
	 */
	public void searchAllPersons();
}
