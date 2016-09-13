package br.edu.ifsul.dao;

import ServiceCliente.Compra;
import ServiceCliente.ServicoCompraService;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Érico
 */
@Stateless
public class CompraDAO implements Serializable{
    private ServicoCompraService cliente;

    public CompraDAO() {
        cliente = new ServicoCompraService();
    }
    
    public List<Compra> getListaCompras(){
        return cliente.getServicoCompraPort().listaCompras();
    }
    
    public void inserir(Compra compra){
        cliente.getServicoCompraPort().inserir(compra);
    }
    
    public void alterar(Compra compra){
        cliente.getServicoCompraPort().alterar(compra);
    }
    
    public void remover(Integer id){
        cliente.getServicoCompraPort().remover(id);
    }

    public ServicoCompraService getCliente() {
        return cliente;
    }

    public void setCliente(ServicoCompraService cliente) {
        this.cliente = cliente;
    }       
    
}
