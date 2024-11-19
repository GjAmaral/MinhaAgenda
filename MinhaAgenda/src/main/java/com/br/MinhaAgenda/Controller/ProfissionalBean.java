package com.br.MinhaAgenda.Controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.br.MinhaAgenda.Model.ProfissionalModel;
import com.br.MinhaAgenda.Service.ProfissionalService;

@Named
@ViewScoped
public class ProfissionalBean implements Serializable {

	private static final long serialVersionUID = 1L;
/*
	@Inject
	private ProfissionalService profissionalService;

	private List<ProfissionalModel> profissionais;

	@PostConstruct	
	public void init() {
		carregarProfissionais();
	}

	public void carregarProfissionais() {
		profissionais = profissionalService.listarTodos();
	}

	public List<ProfissionalModel> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<ProfissionalModel> profissionais) {
		this.profissionais = profissionais;
	}*/

}
