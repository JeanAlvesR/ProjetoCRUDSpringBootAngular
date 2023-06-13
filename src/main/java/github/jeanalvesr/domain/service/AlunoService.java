package github.jeanalvesr.domain.service;


import github.jeanalvesr.domain.entities.Aluno;
import github.jeanalvesr.dto.AlunoDto;

import java.util.List;

public interface AlunoService {
    public List<AlunoDto> getAlunos();
    public void criarAluno(AlunoDto alunoDto);

    public void removeAluno(Integer id);

    public void alterarAluno(AlunoDto alunoDTO);

}
