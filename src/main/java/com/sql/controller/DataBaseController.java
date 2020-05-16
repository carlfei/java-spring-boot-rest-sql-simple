package com.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sql.repository.AlmacenRepositorio;
import com.sql.model.Almacen;

@RestController
public class DataBaseController {

	@Autowired
	AlmacenRepositorio almacenRepositorio;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicio() {

		return "<fieldset> <legend>Spring Boot h2</legend><br>"
				+ " <a href='http://127.0.0.1:9090/1'>Buscar por id</a><br> "
				+ "<a href='http://127.0.0.1:9090/almacen'>listar la tabla</a> <br>";

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Almacen metedentro(@PathVariable Integer id) {

		return almacenRepositorio.findById(id).get();

	}

	@RequestMapping(value = "/almacen", method = RequestMethod.GET)
	public List<Almacen> metedentro() {

		return almacenRepositorio.findAll();

	}

}
