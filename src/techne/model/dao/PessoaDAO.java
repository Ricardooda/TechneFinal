package techne.model.dao;

import java.util.List;

import techne.model.domain.Pessoa;

public interface PessoaDAO {

	public abstract List<Pessoa> getPessoa();

	public abstract Pessoa salvar(Pessoa pessoa);

	public abstract void excluir(Pessoa pessoa);

	public abstract void atualizar(Pessoa pessoa);

}