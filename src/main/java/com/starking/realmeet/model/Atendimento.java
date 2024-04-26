package com.starking.realmeet.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author pedroRhamon
 */

@Data
@Entity
@Table(name = "atendimento")
public class Atendimento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20)
	@NotNull
	private String nome;
	
	@Column(length = 10)
	@Email
	@NotNull
	private String email;
	
	private String telefone;
	
	@Column(unique = true)
	private String Cpf;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime CreatedAt;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDateTime UpdatedAt;

}
