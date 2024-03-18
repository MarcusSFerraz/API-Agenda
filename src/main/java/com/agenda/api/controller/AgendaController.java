package com.agenda.api.controller;

import com.agenda.api.mapper.AgendaMapper;
import com.agenda.api.request.AgendaRequest;
import com.agenda.domain.service.PacienteService;
import lombok.RequiredArgsConstructor;
import com.agenda.domain.bean.Agenda;
import com.agenda.domain.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/agenda")
public class AgendaController {

    @Autowired
    AgendaService service;
    @Autowired
    AgendaMapper mapper;
    @PostMapping()
    public ResponseEntity<Agenda> save(@RequestBody AgendaRequest request) throws Exception {
        Agenda agenda = mapper.toAgenda(request);
        service.save(agenda);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping()
    public ResponseEntity<List<Agenda>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
