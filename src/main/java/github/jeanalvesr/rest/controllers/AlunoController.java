package github.jeanalvesr.rest.controllers;

import github.jeanalvesr.domain.service.AlunoService;
import github.jeanalvesr.dto.AlunoDto;
import github.jeanalvesr.dto.AlunoSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoDto> find() {
        return alunoService.getAlunos();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Integer criaAluno(@RequestBody AlunoSaveDto alunoSaveDto){
        return alunoService.criarAluno(alunoSaveDto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void removerAluno(@PathVariable Integer id){
        alunoService.removerAluno(id);
    }


    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void atualizaAluno(@RequestBody AlunoDto alunoDto ){
        System.out.printf(String.valueOf(alunoDto.id()));
        System.out.printf("passei aqui");
        alunoService.alterarAluno(alunoDto);
    }
}
