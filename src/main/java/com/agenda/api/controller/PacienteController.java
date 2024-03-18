package com.agenda.api.controller;

import com.agenda.domain.bean.Paciente;
import com.agenda.domain.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/paciente")
public class PacienteController {

    @Autowired
    PacienteService service;

    @PostMapping()
    public ResponseEntity<Paciente> save(@RequestBody Paciente paciente) throws Exception {
        Paciente response = service.save(paciente);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    @GetMapping()
    public ResponseEntity<List<Paciente>> findAll(){
        List<Paciente> pacientes = service.findAll();
        return ResponseEntity.ok(pacientes);
    }
 }
