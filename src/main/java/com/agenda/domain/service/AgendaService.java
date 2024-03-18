package com.agenda.domain.service;

import com.agenda.api.request.AgendaRequest;
import com.agenda.domain.bean.Agenda;
import com.agenda.domain.bean.Paciente;
import com.agenda.domain.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    AgendaRepository repository;

    public void save(Agenda agenda) throws Exception{
        repository.save(agenda);
    }

    public Agenda findById(Integer id) {
        Optional<Agenda> agenda = repository.findById(id);
        return agenda.orElse(null);
    }

    public List<Agenda> findAll() {
        return repository.findAll();
    }

}
