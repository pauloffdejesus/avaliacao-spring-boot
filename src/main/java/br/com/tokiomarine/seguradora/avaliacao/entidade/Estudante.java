package br.com.tokiomarine.seguradora.avaliacao.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Estudante {
	// TODO Implementar a entidade Estudante conforme solicitado
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	//validação para valores nulos. Mensagem padrão por segurança.
	@NotNull(message = "O nome está incorreto.")
	private String nome;
	//validação para valores nulos. Mensagem padrão por segurança.
	@NotNull(message = "O email está incorreto.")
	private String email;
	private String telefone;
	@NotNull(message = "A matricula está incorreta.")
	private String matricula;
	private String curso;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
