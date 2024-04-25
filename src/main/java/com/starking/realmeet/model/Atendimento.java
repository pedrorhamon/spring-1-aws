package com.starking.realmeet.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	@Column(unique = true)
	private String Cpf;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date CreatedAt;
	
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date UpdatedAt;

}
