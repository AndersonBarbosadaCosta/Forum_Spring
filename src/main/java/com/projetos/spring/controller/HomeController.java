package com.projetos.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projetos.spring.dao.AssuntoDao;
import com.projetos.spring.dao.UsuarioDao;

@Controller
public class HomeController {
	
	@Autowired
	private UsuarioDao daoUsuario;
	
	@Autowired
	private AssuntoDao assuntoDao;
	
	
	public UsuarioDao getDaoUsuario() {
		return daoUsuario;
	}

	public void setDaoUsuario(UsuarioDao daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

	public AssuntoDao getAssuntoDao() {
		return assuntoDao;
	}

	public void setAssuntoDao(AssuntoDao assuntoDao) {
		this.assuntoDao = assuntoDao;
	}



	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		model.put("assuntos", getAssuntoDao().list());
		model.put("usuarios", getDaoUsuario().list());
		return "index";
	}

}
