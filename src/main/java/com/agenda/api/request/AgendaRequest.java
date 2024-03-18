package com.agenda.api.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
public class AgendaRequest {
    private String descricao;
    private Time horario;
    private Date data;
    private Integer paciente;
}
