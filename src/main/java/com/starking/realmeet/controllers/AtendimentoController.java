package com.starking.realmeet.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
