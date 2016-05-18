package techne.model.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "pessoa")
@XmlRootElement
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4733939307328306271L;
	@Id
	@Column
	private String id;
	@Column
	private String nome;
	@Column
	private String cPF;
	@Column
	private Integer idade;

	public Pessoa() {
		super();
	}

	public Pessoa(String id, String nome, String cPF, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cPF = cPF;
		this.idade = idade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcPF() {
		return cPF;
	}

	public void setcPF(String cPF) {
		this.cPF = cPF;
	}

	public Pessoa(String id) {
		this.id = id;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
