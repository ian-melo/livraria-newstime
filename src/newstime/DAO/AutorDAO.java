package newstime.DAO;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import newstime.entidade.Autor;
import newstime.excecao.BancoException;

/**
 * Classe de DAO para autor
 * @author Ian Melo
 */
public class AutorDAO implements DAO<Autor> {
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
     * Cria uma DAO de autor, com um banco de dados
     * @param bd Banco de dados a conectar
     */
    public AutorDAO(BancoDados bd) {
        this.bd = bd;
    }
    
    @Override
    public void inserir(Autor o) throws BancoException {
        try {
            //Define String
            sql = "INSERT INTO Autor VALUES (NULL,?,?,?,?,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            pst.setString(1, o.getCodigo());
            pst.setString(2, o.getNome());
            pst.setDate(3, new java.sql.Date(o.getDataNasci().getTime()));
            pst.setDate(4, new java.sql.Date(o.getDataMorte().getTime()));
            pst.setString(5, o.getLocalNasci());
            pst.setString(6, o.getLocalMorte());
            //Executa
            pst.executeUpdate();
            //Fecha
            bd.fecharConexao();
        } catch (SQLException ex) {
            //Fecha
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao inserir o autor.");
        }
    }

    @Override
    public void alterar(Autor o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Autor SET " +
                "CodigoAlt='"+o.getCodigo()+"', Nome='"+o.getNome()+"', DataNasci='"+new java.sql.Date(o.getDataNasci().getTime())+"', " +
                "DataMorte='"+new java.sql.Date(o.getDataMorte().getTime())+"', LocalNasci='"+o.getLocalNasci()+"', LocalMorte='"+o.getLocalMorte()+"' " +
                "WHERE CodAutor="+o.getID();
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa
            pst.executeUpdate(sql);
            //Fecha
            bd.fecharConexao();
        } catch (SQLException ex) {
            //Fecha
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao alterar o autor.");
        }
    }

    @Override
    public void excluir(Autor o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Autor SET XDEAD = TRUE WHERE CodAutor="+o.getID();
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa
            pst.executeUpdate(sql);
            //Fecha
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao excluir o autor.");
        }
    }

    @Override
    public Autor buscar(Autor o) throws BancoException {
        try {
            Autor autor = null;
            //Define String
            sql = "SELECT * FROM Autor WHERE Nome=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setString(1, o.getNome());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                autor = new Autor();
                autor.setCodigo(rs.getString("CodigoAlt"));
                autor.setNome(rs.getString("Nome"));
                autor.setDataNasci(rs.getDate("DataNasci"));
                autor.setDataMorte(rs.getDate("DataMorte"));
                autor.setLocalNasci(rs.getString("LocalNasci"));
                autor.setLocalMorte(rs.getString("LocalMorte"));
                autor.setID(rs.getInt("CodAutor"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(autor == null) {
                bd.fecharConexao();
                throw new BancoException("Autor não foi encontrado.");
            }
            //Fecha
            bd.fecharConexao();
            return autor;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o autor.");
        }
    }
    
    @Override
    public Autor buscarId(Autor o) throws BancoException {
        try {
            Autor autor = null;
            //Define String
            sql = "SELECT * FROM Autor WHERE CodAutor=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                autor = new Autor();
                autor.setCodigo(rs.getString("CodigoAlt"));
                autor.setNome(rs.getString("Nome"));
                autor.setDataNasci(rs.getDate("DataNasci"));
                autor.setDataMorte(rs.getDate("DataMorte"));
                autor.setLocalNasci(rs.getString("LocalNasci"));
                autor.setLocalMorte(rs.getString("LocalMorte"));
                autor.setID(rs.getInt("CodAutor"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(autor == null) {
                bd.fecharConexao();
                throw new BancoException("Autor não foi encontrado.");
            }
            //Fecha
            bd.fecharConexao();
            return autor;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o autor.");
        }
    }
    
    @Override
    public List<Autor> listar() throws BancoException {
        try {
            ArrayList<Autor> autores = new ArrayList<>();
            Autor autor;
            //Define String
            sql = "SELECT * FROM Autor WHERE XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
                autor = new Autor();
                autor.setCodigo(rs.getString("CodigoAlt"));
                autor.setNome(rs.getString("Nome"));
                autor.setDataNasci(rs.getDate("DataNasci"));
                autor.setDataMorte(rs.getDate("DataMorte"));
                autor.setLocalNasci(rs.getString("LocalNasci"));
                autor.setLocalMorte(rs.getString("LocalMorte"));
                autor.setID(rs.getInt("CodAutor"));
                //Adiciona à lista
                autores.add(autor);
            }
            //Fecha
            bd.fecharConexao();
            return autores;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao listar os autores.");
        }
    }
}
