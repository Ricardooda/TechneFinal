package techne.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import techne.model.dao.PessoaDAO;
import techne.model.domain.Pessoa;

public class PessoaServiceImpl implements PessoaService {

	private PessoaDAO pessoaDAO;

	// TODO Auto-generated constructor stub

	/*
	 * (non-Javadoc)
	 * 
	 * @see techne.model.service.ProdutoServece#getPessoa()
	 */
	@Override
	public List<Pessoa> getPessoa() {
		return pessoaDAO.getPessoa();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * techne.model.service.ProdutoServece#salvar(techne.model.domain.Pessoa)
	 */
	@Override
	@Transactional
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaDAO.salvar(pessoa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * techne.model.service.ProdutoServece#atualizar(techne.model.domain.Pessoa)
	 */
	@Override
	@Transactional
	public void atualizar(Pessoa pessoa) {
		pessoaDAO.atualizar(pessoa);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * techne.model.service.ProdutoServece#excluir(techne.model.domain.Pessoa)
	 */
	@Override
	@Transactional
	public void excluir(Pessoa pessoa) {
		pessoaDAO.excluir(pessoa);
	}

}
