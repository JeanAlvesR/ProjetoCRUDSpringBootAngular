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
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEscola.class);
    }
}
