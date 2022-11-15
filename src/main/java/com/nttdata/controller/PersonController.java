package com.nttdata.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.nttdata.repository.Person;

/**
* 
* Formación - Spring - Tareas
* 
* Controlador 
* 
* @author Salva Castillo
*
*/
@Controller
@RequestMapping("/home/person/")//home/car
public class PersonController {

	public @ResponseBody String home() {
		return "nombre_persona";
	}
	/**
	 * Capta  solicitud a /home/person/
	 * 
	 * @return String
	 */
	@GetMapping("/")
	public String newPersonForm() {
		return "/newPersonView";
	}

	/**
	 * Resultada al formulario de matriculación.
	 * 
	 * @return String
	 */
	@PostMapping("/createPerson")
	public String savePerson(@Valid @ModelAttribute("persona") Person newPerson, Model model, BindingResult br) {

		// Se establece datos de la persona
		final String firstFamilyName = StringUtils.substring(newPerson.getFirstFamilyName(), 0, 1);
		final String secondFamilyName = StringUtils.substring(newPerson.getSecondFamilyName(), 0, 1);
		final String name = StringUtils.substring(newPerson.getName(), 0, 1);
		final String IdDocument = newPerson.getIdDocument() + name + firstFamilyName + secondFamilyName;
		newPerson.setIdDocument(IdDocument);

		return "/showPerson";
	}

	@ExceptionHandler(BindException.class)
	public String checkExceptions(BindingResult br) {

		String output = "";

		if (br.hasErrors()) {

			output = "/showErrorView";

		}

		return output;
	}

}
