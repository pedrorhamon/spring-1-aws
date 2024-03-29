package com.starking.realmeet.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.starking.realmeet.model.Atendimento;
import com.starking.realmeet.repositories.AtendimentoRepository;

import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */

@Service
@AllArgsConstructor
public class AtendimentoService {
	
	private final AtendimentoRepository repository;
	
	private Page<Atendimento> findAll(Pageable pageable) {
		return this.repository.findAll(pageable);
	}
	
	private void findById(final Long id) {
		this.repository.findById(id);
	}

}
