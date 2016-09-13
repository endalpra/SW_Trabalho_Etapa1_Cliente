
import ServiceCliente.Compra;
import ServiceCliente.ServicoCompraService;


/**
 *
 * @author Érico
 */
public class TesteCliente {
    public static void main(String[] args){
        ServicoCompraService cliente = new ServicoCompraService();
        Compra c = new Compra();
        c.setCEndereco("Endereço");
        c.setCNome("Nome");
        c.setCepDestino("CepDestino");
        c.setCepOrigem("CepOrigem");
        c.setPrazoEntrega(10);
        c.setValorCompra(100.0);
        c.setValorFrete(15.0);
        cliente.getServicoCompraPort().inserir(c);
    }
}
