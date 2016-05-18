package techne.model.service;

import java.util.List;

import techne.model.domain.Pessoa;

public interface PessoaService {

	public abstract List<Pessoa> getPessoa();

	public abstract Pessoa salvar(Pessoa pessoa);

	public abstract void atualizar(Pessoa pessoa);

	public abstract void excluir(Pessoa pessoa);

}