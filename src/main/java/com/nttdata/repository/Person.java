package com.nttdata.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Formación - Spring - Tareas
 * 
 * Entidad
 * 
 * @author Salva Castillo
 *
 */
@Entity
@Table(name = "person")
public class Person implements Serializable{

	/**Serial*/
	private static final long serialVersionUID = 1L;
	
	/**Identificador*/
	private Long id;
	
	/**Nombre persona*/
	private String name;
	
	/**Primer apellido persona*/
	private String firstFamilyName;
	
	/**Segundo apellido persona*/
	private String secondFamilyName;
	
	/** Documento de identidad */
	private String idDocument;

	
	
	//GETTER AND SETTER
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", firstFamilyName=" + firstFamilyName + ", secondFamilyName="
				+ secondFamilyName + ", idDocument=" + idDocument + "]";
	}

	/**
	 * 
	 * @return id of person
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name of person
	 */
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return firstFamilyName of person
	 */
	@Column(name = "first_family_name", nullable = false)
	public String getFirstFamilyName() {
		return firstFamilyName;
	}

	/**
	 * 
	 * @param firstFamilyName
	 */
	public void setFirstFamilyName(String firstFamilyName) {
		this.firstFamilyName = firstFamilyName;
	}

	/**
	 * 
	 * @return secondFamilyName of person
	 */
	@Column(name = "second_family_name", nullable = false)
	public String getSecondFamilyName() {
		return secondFamilyName;
	}

	/**
	 * 
	 * @param secondFamilyName
	 */
	public void setSecondFamilyName(String secondFamilyName) {
		this.secondFamilyName = secondFamilyName;
	}

	/**
	 * 
	 * @return idDocument of person
	 */
	@Column(name = "id_document", nullable = false, unique = true)
	public String getIdDocument() {
		return idDocument;
	}

	/**
	 * 
	 * @param idDocument
	 */
	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}
	
	
	
	
}
