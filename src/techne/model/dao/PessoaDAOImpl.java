package techne.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import techne.model.domain.Pessoa;

public class PessoaDAOImpl implements PessoaDAO {

	@PersistenceContext(unitName = "TechnePU")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see techne.model.dao.PessoaDAO#getPessoa()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Pessoa> getPessoa() {
		Query query = entityManager.createQuery("from Pessoa");
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see techne.model.dao.PessoaDAO#salvar(techne.model.domain.Pessoa)
	 */
	@Override
	public Pessoa salvar(Pessoa pessoa) {
		entityManager.persist(pessoa);
		return pessoa;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see techne.model.dao.PessoaDAO#excluir(techne.model.domain.Pessoa)
	 */
	@Override
	public void excluir(Pessoa pessoa) {
		Pessoa pessoaMerge = entityManager.merge(pessoa);
		entityManager.remove(pessoaMerge);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see techne.model.dao.PessoaDAO#atualizar(techne.model.domain.Pessoa)
	 */
	@Override
	public void atualizar(Pessoa pessoa) {
		Pessoa pessoaMerge = entityManager.merge(pessoa);
		entityManager.persist(pessoaMerge);

	}

}
