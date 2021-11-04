package com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.entity.Secretaria;
import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.repository.GestaoSecretariasRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GestaoSecretariasService {
	
	private GestaoSecretariasRepository gestaoSecretariasRepository;
	
	public Secretaria addSecretaria(Secretaria secretaria) {
		return gestaoSecretariasRepository.save(secretaria);
	}

	public List<Secretaria> listSecretarias() {
		return gestaoSecretariasRepository.findAll();
	}

	public Optional<Secretaria> getSecretaria(Long id) {
		return gestaoSecretariasRepository.findById(id);
	}

	public String removeSecretaria(Long id) {
		gestaoSecretariasRepository.deleteById(id);
		return "Removido com sucesso";
	}

	public Secretaria changeUnderInvestigation(Long id, boolean underInvestigation) {
		Secretaria secretaria = gestaoSecretariasRepository.getById(id);
		secretaria.setUnderInvestigation(underInvestigation);
        return gestaoSecretariasRepository.save(secretaria);
	}
	
	
}
