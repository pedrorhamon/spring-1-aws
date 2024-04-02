package com.starking.realmeet.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@GetMapping("{id}")
	public void findById(@PathVariable("id") Long id) {
		this.atendimentoService.findById(id);
	}
	
	public ResponseEntity<Atendimento> save(@RequestBody @Validated Atendimento atendimento) {
		return ResponseEntity.created(null).body(this.atendimentoService.save(atendimento));
	}

}
