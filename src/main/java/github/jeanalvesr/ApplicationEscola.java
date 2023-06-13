package github.jeanalvesr;

import github.jeanalvesr.domain.entities.Aluno;
import github.jeanalvesr.domain.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationEscola {

        @Bean
    public CommandLineRunner commandLineRunner(@Autowired AlunoRepository alunos){
        return args -> {
            alunos.save(new Aluno("Jean", "459857552236"));
            alunos.save(new Aluno( "Kenji", "66666666666"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEscola.class);
    }
}
