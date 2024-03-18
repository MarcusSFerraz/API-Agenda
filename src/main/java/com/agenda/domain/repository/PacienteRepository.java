package com.agenda.domain.repository;

import com.agenda.domain.bean.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    Paciente findByCpf(String cpf);

}
