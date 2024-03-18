package com.agenda.domain.repository;

import com.agenda.domain.bean.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
}
