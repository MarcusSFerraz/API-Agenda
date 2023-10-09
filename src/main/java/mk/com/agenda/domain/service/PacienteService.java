package mk.com.agenda.domain.service;

import lombok.RequiredArgsConstructor;
import mk.com.agenda.domain.entity.Paciente;
import mk.com.agenda.domain.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    public Paciente salvar (Paciente paciente) {

        // TODO para validar se o cpf ja noo existe

        return repository.save(paciente);
    }

    public List<Paciente> listarTodos(){
        return repository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }


}
