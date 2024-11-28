package br.com.danilo.service;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.ContratoDAO;
import br.com.danilo.dao.IContratoDAO;

public class ContratoService implements IContratoService{
private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO dao) {
        this.contratoDAO = dao;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Dados salvos com sucesso!";
    }

    @Override
    public String buscar() {
        contratoDAO.buscar();
        return "Busca de dados do banco de dados com sucesso!";
    }

    @Override
    public String excluir() {
        contratoDAO.excluir();
        return "Dados excluidos com sucesso!";
    }

    @Override
    public String atualizar() {
        contratoDAO.atualizar();
        return "Dados atualizados com sucesso!";
    }
}
