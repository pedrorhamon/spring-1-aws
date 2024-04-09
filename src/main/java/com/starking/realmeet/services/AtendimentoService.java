package com.starking.realmeet.services;

import java.util.Optional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.starking.realmeet.model.Atendimento;
import com.starking.realmeet.repositories.AtendimentoRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */

@Service
@AllArgsConstructor
public class AtendimentoService {

	private final AtendimentoRepository repository;

	public Page<Atendimento> findAll(Pageable pageable) {
		return this.repository.findAll(pageable);
	}

	public void findById(final Long id) {
		this.repository.findById(id);
	}

	public Atendimento update(Atendimento atendimentoAtualizado, Long id) throws Exception {
		Optional<Atendimento> atendimentoExistente = this.repository.findById(id);

		if (atendimentoExistente.isPresent()) {
			Atendimento atendimento = atendimentoExistente.get();

			atendimento.setNome(atendimentoAtualizado.getNome());
			atendimento.setEmail(atendimentoAtualizado.getEmail());
			atendimento.setCpf(atendimentoAtualizado.getCpf());
			atendimento.setTelefone(atendimentoAtualizado.getTelefone());

			return this.repository.save(atendimento);
		} else {
			throw new Exception("Atendimento com o ID " + id + " não encontrado.");
		}
	}

	@Transactional
	public Atendimento save(Atendimento atendimento) {
		return this.repository.save(atendimento);
	}

	public void criarExcel(Atendimento atendimento) {
		try {

			Workbook workbook = new XSSFWorkbook();

			Sheet sheet = workbook.createSheet("Planilha Teste");

			Row row = sheet.createRow(0);

			Cell cell1 = row.createCell(0);

			cell1.setCellValue(atendimento.getNome());

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
