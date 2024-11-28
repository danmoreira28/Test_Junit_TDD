package br.com.danilo;

/**
 * @author danmoreira28
 */

//Testa o Mock em métodos separados

import br.com.danilo.dao.IContratoDAO;
import br.com.danilo.dao.mock.ContratoDAOMock;
import br.com.danilo.service.ContratoService;
import br.com.danilo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTestMock {

    IContratoDAO dao = new ContratoDAOMock();
    IContratoService service = new ContratoService(dao);


    @Test
    public void salvarTest() {
        String retornosalvar = service.salvar();
        Assert.assertEquals("Dados salvos com sucesso!", retornosalvar);
    }

    @Test
    public void buscarTest() {
        String retornobuscar = service.buscar();
        Assert.assertEquals("Busca de dados do banco de dados com sucesso!", retornobuscar);
    }

    @Test
    public void excluirTest() {
        String retornoexcluir = service.excluir();
        Assert.assertEquals("Dados excluidos com sucesso!", retornoexcluir);
    }

    @Test
    public void atualizarTest() {
        String retornoatualizar = service.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso!", retornoatualizar);
    }
}
