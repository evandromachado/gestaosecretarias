package com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.dto.UnderInvestigationDTO;
import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.entity.Secretaria;
import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.service.GestaoSecretariasService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/secretarias")
@Api(value = "Secretarias", tags = {"Secretarias"})
public class GestaoSecretariasController {
	
	private GestaoSecretariasService gestaoSecretariasService;

	public GestaoSecretariasController(GestaoSecretariasService service) {
		this.gestaoSecretariasService = service;
	}

    @PostMapping
    public Secretaria addSecretaria(@RequestBody Secretaria secretaria) {
        return gestaoSecretariasService.addSecretaria(secretaria);
    }

    @GetMapping
    public List<Secretaria> listSecretarias() { 
    	return gestaoSecretariasService.listSecretarias();
    }

    @GetMapping(path = "/{id}")
    public Optional<Secretaria> getSecretaria(@PathVariable Long id) {
        return gestaoSecretariasService.getSecretaria(id);
    }

    @DeleteMapping(path = "/{id}")
    public String removeSecretaria(@PathVariable Long id) {
        return gestaoSecretariasService.removeSecretaria(id);
    }

    @PatchMapping(path = "/{id}")
    public Secretaria changeUnderInvestigation(@PathVariable Long id, @RequestBody UnderInvestigationDTO underInvestigationDTO) {
        return gestaoSecretariasService.changeUnderInvestigation(id, underInvestigationDTO.isUnderInvestigation());
    }

}
