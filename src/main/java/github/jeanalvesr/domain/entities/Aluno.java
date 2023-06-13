package github.jeanalvesr.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno {
    @Id
    @SequenceGenerator(name = "minhaEntidadeSequence", sequenceName = "minha_entidade_seq", allocationSize = 1, initialValue = 20230)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "minhaEntidadeSequence")
    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;


}
