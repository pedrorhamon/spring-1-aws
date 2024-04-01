package com.starking.realmeet.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starking.realmeet.model.Atendimento;
import com.starking.realmeet.services.AtendimentoService;

import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */
@RestController
@RequestMapping("/api/atend/")
@AllArgsConstructor
public class AtendimentoController {

	private final AtendimentoService atendimentoService;
	
	public Page<Atendimento> findAll(Pageable pageable) {
		return this.atendimentoService.findAll(pageable);
	}
}
