package com.starking.realmeet.services;

import org.springframework.stereotype.Service;

import com.starking.realmeet.repositories.AtendimentoRepository;

import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */

@Service
@AllArgsConstructor
public class AtendimentoService {
	
	private final AtendimentoRepository repository;

}
