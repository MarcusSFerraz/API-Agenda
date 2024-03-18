package com.agenda.domain.bean;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@Table(name = "agenda")
@Entity
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Date data;
    private Time horario;
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}
