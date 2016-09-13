package br.edu.ifsul.controle;

import ServiceCliente.Compra;
import br.edu.ifsul.dao.CompraDAO;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.print.attribute.standard.Compression;

/**
 *
 * @author Érico
 */
@ManagedBean(name="controleCompra")
@SessionScoped
public class ControleCompra implements Serializable{
    private Compra objeto;
    @EJB
    private CompraDAO dao;

    public ControleCompra() {
    }
    
    public String novo(){
        objeto = new Compra();
        objeto.setId(0);
        return "form";
    }
    
    public String gravar(){
        if(objeto.getId()==0){
            dao.inserir(objeto);
        }else{
            dao.alterar(objeto);
        }
        return "index";
    }
    
    public String alterar(Compra obj){
        objeto = obj;
        return "form";
    }
    
    public void remover(Integer id){
        dao.remover(id);
    }

    public Compra getObjeto() {
        return objeto;
    }

    public void setObjeto(Compra objeto) {
        this.objeto = objeto;
    }

    public CompraDAO getDao() {
        return dao;
    }

    public void setDao(CompraDAO dao) {
        this.dao = dao;
    }
    
    
}
