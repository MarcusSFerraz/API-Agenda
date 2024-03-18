package com.agenda.api.mapper;

import com.agenda.api.request.AgendaRequest;
import com.agenda.domain.bean.Agenda;
import com.agenda.domain.bean.Paciente;
import com.agenda.domain.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AgendaMapper {

    @Autowired
    PacienteService pacienteService;

    public Agenda toAgenda(AgendaRequest request) throws Exception{
        Agenda agenda = new Agenda();
        if (request.getPaciente() != null) {
            Paciente paciente = pacienteService.findById(request.getPaciente());
            if (paciente != null) {
                agenda.setData(request.getData());
                agenda.setHorario(request.getHorario());
                agenda.setDescricao(request.getDescricao());
                agenda.setPaciente(paciente);
            } else {
                throw new Exception("Paciente não encontrado.");
            }
        } else {
            throw new Exception("Paciente é um campo obrigatório.");
        }
        return agenda;
    }
}
