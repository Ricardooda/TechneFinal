package techne.model.facade.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import techne.model.domain.Pessoa;
import techne.model.service.PessoaService;

@Path("/pessoa")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaFacade {

	private PessoaService pessoaService;

	@GET
	public List<Pessoa> getPessoa() {
		return pessoaService.getPessoa();

	}

	@POST
	public Pessoa salva(Pessoa pessoa) {
		return pessoaService.salvar(pessoa);
	}

	@PUT
	public void atualizar(Pessoa pessoa) {
		pessoaService.atualizar(pessoa);

	}

	@DELETE
	@Path("/{id}")
	public void excluir(@PathParam("id") String id) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(id);
		pessoaService.excluir(pessoa);
	}

}
