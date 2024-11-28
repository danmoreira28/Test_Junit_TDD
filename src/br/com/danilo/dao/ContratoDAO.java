package br.com.danilo.dao;

/**
 * @author danmoreira28
 */

public class ContratoDAO implements IContratoDAO{

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não tem acesso ao Banco!");
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Não foi possivel Buscar no BD!");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Não tem acesso ao Banco!");
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Não tem acesso ao Banco!");
    }
}
