//TODO: Testar
package newstime.DAO;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import newstime.entidade.Entrega;
import newstime.excecao.BancoException;

/**
 * Classe de DAO para entrega
 * @author Ian Melo
 */
public class EntregaDAO implements DAO<Entrega> {
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
     * Cria uma DAO de entrega, com um banco de dados
     * @param bd Banco de dados a conectar
     */
    public EntregaDAO(BancoDados bd) {
        this.bd = bd;
    }
    
    @Override
    public void inserir(Entrega o) throws BancoException {
        try {
            //Define String
            sql = "INSERT INTO Entrega " +
                "VALUES (NULL,?,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            pst.setString(1, o.getTipo().toString());
            pst.setFloat(2, o.getPreco());
            pst.setDate(3, (Date) o.getDataEntrega());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate() == 1) {
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao inserir a entrega.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao inserir a entrega.");
        }
    }

    @Override
    public void alterar(Entrega o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Entrega SET Tipo=?, Preco=?, DataEntrega=? " +
                "WHERE CodEntrega=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setString(1, o.getTipo().toString());
            pst.setFloat(2, o.getPreco());
            pst.setDate(3, (Date) o.getDataEntrega());
            pst.setInt(4,o.getID());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate(sql) == 1){
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao alterar a entrega.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao alterar a entrega.");
        }
    }

    @Override
    public void excluir(Entrega o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Entrega SET XDEAD = TRUE WHERE CodEntrega=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e verifica se houve erro, jogando execeção caso houver
            if(pst.executeUpdate(sql) == 1){
                bd.fecharConexao();
                throw new BancoException("Houve um problema ao excluir a entrega.");
            }
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao excluir a entrega.");
        }
    }

    @Override
    public Entrega buscar(Entrega o) throws BancoException {
        try {
            Entrega entrega = null;
            //Define String
            sql = "SELECT * FROM Entrega WHERE Tipo=? AND Preco=? " +
                "AND XDEAD=FALSE ORDER BY CodEntrega DESC";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setString(1, o.getTipo().toString());
            pst.setFloat(2,o.getPreco());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                entrega = new Entrega();
                entrega.setTipo(Entrega.TipoEntrega.valueOf(rs.getString("Tipo")));
                entrega.setPreco(rs.getFloat("Preco"));
                entrega.setDataEntrega(rs.getDate("DataEntrega"));
                entrega.setID(rs.getInt("CodEntrega"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(entrega == null) {
                bd.fecharConexao();
                throw new BancoException("Entrega não foi encontrada.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return entrega;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar a entrega.");
        }
    }
    
    @Override
    public Entrega buscarId(Entrega o) throws BancoException {
        try {
            Entrega entrega = null;
            //Define String
            sql = "SELECT * FROM Entrega WHERE CodEntrega=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                entrega = new Entrega();
                entrega.setTipo(Entrega.TipoEntrega.valueOf(rs.getString("Tipo")));
                entrega.setPreco(rs.getFloat("Preco"));
                entrega.setDataEntrega(rs.getDate("DataEntrega"));
                entrega.setID(rs.getInt("CodEntrega"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(entrega == null) {
                bd.fecharConexao();
                throw new BancoException("Entrega não foi encontrada.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return entrega;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar a entrega.");
        }
    }
    
    @Override
    public List<Entrega> listar() throws BancoException {
        try {
            ArrayList<Entrega> entregas = new ArrayList<>();
            Entrega entrega;
            //Define String
            sql = "SELECT * FROM Entrega WHERE XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
                entrega = new Entrega();
                entrega.setTipo(Entrega.TipoEntrega.valueOf(rs.getString("Tipo")));
                entrega.setPreco(rs.getFloat("Preco"));
                entrega.setDataEntrega(rs.getDate("DataEntrega"));
                entrega.setID(rs.getInt("CodEntrega"));
                //Adiciona à lista
                entregas.add(entrega);
            }
            bd.fecharConexao();
            return entregas;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao listar as entregas.");
        }
    }
}
