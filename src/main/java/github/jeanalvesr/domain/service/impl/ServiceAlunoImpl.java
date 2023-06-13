package github.jeanalvesr.domain.service.impl;

import github.jeanalvesr.domain.entities.Aluno;
import github.jeanalvesr.domain.repositories.AlunoRepository;
import github.jeanalvesr.domain.service.AlunoService;
import github.jeanalvesr.dto.AlunoDto;
import github.jeanalvesr.dto.AlunoSaveDto;
import github.jeanalvesr.exceptions.EntityNotFound;
import github.jeanalvesr.exceptions.AtributoIlegalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceAlunoImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<AlunoDto> getAlunos() {
        List<Aluno> listaAluno = alunoRepository.findAll();

        List<AlunoDto> listaAlunoDto = listaAluno.stream().map(aluno -> {
            AlunoDto alunoDto = new AlunoDto(aluno.getId(), aluno.getNome(), aluno.getEndereco(), aluno.getTelefone());
            return alunoDto;
        }).collect(Collectors.toList());

        return listaAlunoDto;
    }

    @Override
    public Integer criarAluno(AlunoSaveDto alunoSaveDto) {
        if(alunoSaveDto.nome().isEmpty()){
            throw new AtributoIlegalException("Nome ilegal!");
        }
        Aluno aluno = new Aluno();
        aluno.setNome(alunoSaveDto.nome());
        aluno.setEndereco(alunoSaveDto.endereco());
        aluno.setTelefone(alunoSaveDto.telefone());
        aluno = alunoRepository.save(aluno);

        return aluno.getId();
    }

    @Override
    public void removerAluno(Integer id) {
        if(id == null){
            throw new AtributoIlegalException("Sem ID");
        }

        Optional<Aluno> aluno = alunoRepository.findById(id);
        if(aluno.isEmpty()){
            throw new EntityNotFound("Aluno não encontrado!");
        }
        alunoRepository.deleteById(id);
    }

    @Override
    public void alterarAluno(AlunoDto alunoDto) {
        if(alunoDto.id() == null){
            throw new AtributoIlegalException("Sem o Atributo ID");
        }

        Optional<Aluno> optionalAluno= alunoRepository.findById(alunoDto.id());
        if(optionalAluno.isEmpty()){
            throw new EntityNotFound("Aluno não existe!");
        }
        optionalAluno.get().setNome(alunoDto.nome());
        optionalAluno.get().setTelefone(alunoDto.telefone());
        optionalAluno.get().setEndereco(alunoDto.endereco());
        alunoRepository.save(optionalAluno.get());
    }
}
