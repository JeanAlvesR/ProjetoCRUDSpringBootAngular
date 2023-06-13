import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-alunos',
  templateUrl: './alunos.component.html',
  styleUrls: ['./alunos.component.scss']
})
export class AlunosComponent {

  listaAlunos: any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;

  nome: string = '';
  endereco: string = '';
  telefone: string = '';
  id = "";
  textoBotao: string = 'Cadastrar';


  constructor(private http: HttpClient) {
    this.getAlunos();
  }

  limpar() {
    this.nome = '';
    this.endereco = '';
    this.telefone = '';
    this.textoBotao = 'Cadastrar';
  }

  getAlunos() {

    this.http.get("http://localhost:8081/api/alunos")

      .subscribe((resultData: any) => {
        this.isResultLoaded = true;
        this.listaAlunos = resultData;
      });
  }

  cadastrarAluno() {

    let bodyData = {
      "nome": this.nome,
      "endereco": this.endereco,
      "telefone": this.telefone
    };
    this.http.post("http://localhost:8081/api/alunos/save", bodyData, { responseType: 'text' }).subscribe((resultData: any) => {
      alert("Aluno registrado com sucesso");
      this.getAlunos();
      this.limpar();
    });
  }

  setInputs(data: any) {
    this.textoBotao = 'Atualizar';
    this.nome = data.nome;
    this.endereco = data.endereco;
    this.telefone = data.telefone;
    this.id = data.id;
  }
  
  alterarAluno() {
    let bodyData = {
      "id": this.id,
      "nome": this.nome,
      "endereco": this.endereco,
      "telefone": this.telefone
    };

    this.http.put("http://localhost:8081/api/alunos/update", bodyData, { responseType: 'text' }).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Aluno atualizado com sucesso")
      this.getAlunos();
      this.limpar();
      this.id = ''
    });
  }

  salvarOuAtualizar() {
    if (this.id == '') {
      this.cadastrarAluno();
    }
    else {
      this.alterarAluno();
    }
  }

  deletarAluno(id: Number) {

    this.http.delete("http://localhost:8081/api/alunos/delete" + "/" + id, { responseType: 'text' }).subscribe((resultData: any) => {
      console.log(resultData);
      alert("Aluno deletado com sucesso")
      this.getAlunos();
      this.limpar();

    });
  }

}


