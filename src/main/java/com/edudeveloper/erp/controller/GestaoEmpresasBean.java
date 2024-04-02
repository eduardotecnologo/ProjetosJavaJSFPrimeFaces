package com.edudeveloper.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.edudeveloper.erp.model.Empresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa;
	
	public Empresa getEmpresa() {
		return empresa;
	}
}
