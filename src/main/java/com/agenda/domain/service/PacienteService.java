package com.agenda.domain.service;

import com.agenda.domain.bean.Paciente;
import com.agenda.domain.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    @Autowired
    PacienteRepository repository;

    public Paciente save(Paciente paciente) throws Exception {
        if (paciente != null && paciente.getCpf() != null) {
            Paciente pacienteReturn = repository.findByCpf(paciente.getCpf());
            if (pacienteReturn != null) {
                return null;
            }
        }
        return repository.save(paciente);
    }

    public List<Paciente> findAll(){
        return repository.findAll();
    }

    public Paciente findById(Integer id) {
        Optional<Paciente> paciente = repository.findById(id);
        if (paciente == null) {
            return null;
        }
        return paciente.get();
    }



}
