package github.jeanalvesr.domain.service;


import github.jeanalvesr.dto.AlunoDto;
import github.jeanalvesr.dto.AlunoSaveDto;

import java.util.List;

public interface AlunoService {
    public List<AlunoDto> getAlunos();
    public Integer criarAluno(AlunoSaveDto alunoSaveDto);

    public void removerAluno(Integer id);

    public void alterarAluno(AlunoDto alunoDTO);

}
