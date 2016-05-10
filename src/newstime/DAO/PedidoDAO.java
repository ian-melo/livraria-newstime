//TODO: Testar
package newstime.DAO;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import newstime.entidade.Pedido;
import newstime.excecao.BancoException;

/**
 * Classe de DAO para pedido
 * @author Ian Melo
 */
public class PedidoDAO implements DAO<Pedido> {
    /**
     * Banco de dados para conexão
     */
    private final BancoDados bd;
    /**
     * Leitor de resultados
     */
    private PreparedStatement pst;
    /**
     * Gatilho para comandos
     */
    private ResultSet rs;
    /**
     * Texto de Query SQL
     */
    private String sql;
    
    /**
     * Cria uma DAO de pedido, com um banco de dados
     * @param bd Banco de dados a conectar
     */
    public PedidoDAO(BancoDados bd) {
        this.bd = bd;
    }
    
    @Override
    public void inserir(Pedido o) throws BancoException {
        try {
            //Define String
            sql = "INSERT INTO Pedido VALUES (NULL,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            pst.setInt(1,o.getCliente().getID());
            pst.setDate(2, (Date) o.getDataHora());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate() == 1) {
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao inserir o pedido.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao inserir o pedido.");
        }
    }

    @Override
    public void alterar(Pedido o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Pedido SET IdCliente=?, Data=? " +
                "WHERE IdPedido=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1,o.getCliente().getID());
            pst.setDate(2, (Date) o.getDataHora());
            pst.setInt(3,o.getID());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate(sql) == 1){
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao alterar o pedido.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao alterar o pedido.");
        }
    }

    @Override
    public void excluir(Pedido o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Pedido SET XDEAD = TRUE WHERE IdPedido=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate(sql) == 1){
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao excluir o pedido.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao excluir o pedido.");
        }
    }

    @Override
    public Pedido buscar(Pedido o) throws BancoException {
        try {
            Pedido pedido = null;
            //Define String
            sql = "SELECT * FROM Pedido WHERE IdCliente=? AND Data=? " +
                "AND XDEAD=FALSE ORDER BY IdPedido DESC";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID_CLIENTE());
            pst.setDate(2, (Date) o.getDataHora());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                pedido = new Pedido();
                pedido.setDataHora(rs.getDate("Data"));
                pedido.setID(rs.getInt("IdPedido"));
                pedido.setID_CLIENTE(rs.getInt("IdCliente"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(pedido == null) {
                bd.fecharConexao();
                throw new BancoException("Pedido não foi encontrado.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return pedido;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o pedido.");
        }
    }
    
    @Override
    public Pedido buscarId(Pedido o) throws BancoException {
        try {
            Pedido pedido = null;
            //Define String
            sql = "SELECT * FROM Pedido WHERE IdPedido=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                pedido = new Pedido();
                pedido.setDataHora(rs.getDate("Data"));
                pedido.setID(rs.getInt("IdPedido"));
                pedido.setID_CLIENTE(rs.getInt("IdCliente"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(pedido == null) {
                bd.fecharConexao();
                throw new BancoException("Pedido não foi encontrado.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return pedido;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o pedido.");
        }
    }
    
    @Override
    public List<Pedido> listar() throws BancoException {
        try {
            ArrayList<Pedido> pedidos = new ArrayList<>();
            Pedido pedido;
            //Define String
            sql = "SELECT * FROM Pedido WHERE XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
                pedido = new Pedido();
                pedido.setDataHora(rs.getDate("Data"));
                pedido.setID(rs.getInt("IdPedido"));
                pedido.setID_CLIENTE(rs.getInt("IdCliente"));
                //Adiciona à lista
                pedidos.add(pedido);
            }
            bd.fecharConexao();
            return pedidos;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao listar os pedidos.");
        }
    }
}
