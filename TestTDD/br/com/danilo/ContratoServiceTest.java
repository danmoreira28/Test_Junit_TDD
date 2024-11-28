package br.com.danilo;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.ContratoDAO;
import br.com.danilo.dao.IContratoDAO;
import br.com.danilo.dao.mock.ContratoDAOMock;
import br.com.danilo.service.ContratoService;
import br.com.danilo.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void BancodeDadosTest() {
        //Neste teste criei um método que faz todos os testes,
        // mas em outra classe fiz com métodos separados.
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retornosalvar = service.salvar();
        String retornobuscar = service.buscar();
        String retornoexcluir = service.excluir();
        String retornoatualizar = service.atualizar();
        Assert.assertEquals("Dados salvos com sucesso!", retornosalvar);
        Assert.assertEquals("Busca de dados do banco de dados com sucesso!", retornobuscar);
        Assert.assertEquals("Dados excluidos com sucesso!", retornoexcluir);
        Assert.assertEquals("Dados atualizados com sucesso!", retornoatualizar);
    }

    IContratoDAO dao = new ContratoDAO();
    IContratoService service = new ContratoService(dao);

    @Test(expected = UnsupportedOperationException.class)
    public void erroNoSalvarBDTest() {
        String retornosalvar = service.salvar();
        Assert.assertEquals("Dados salvos com sucesso!", retornosalvar);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroNoBuscarBDTest() {
        String retornobuscar = service.buscar();
        Assert.assertEquals("Busca de dados do banco de dados com sucesso!", retornobuscar);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroNoExcluirBDTest() {
        String retornoexcluir = service.excluir();
        Assert.assertEquals("Dados excluidos com sucesso!", retornoexcluir);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroNoAtualizarBDTest() {
        String retornoatualizar = service.atualizar();
        Assert.assertEquals("Dados atualizados com sucesso!", retornoatualizar);
    }
}


