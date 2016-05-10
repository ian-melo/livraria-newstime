//TODO: Testar
package newstime.DAO;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import newstime.entidade.Livro;
import newstime.entidade.Livro.CategoriaLivro;
import newstime.excecao.BancoException;
import newstime.excecao.NegocioException;

/**
 * Classe de DAO para livro
 * @author Ian Melo
 */
public class LivroDAO implements DAO<Livro> {
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
     * Cria uma DAO de livro, com um banco de dados
     * @param bd Banco de dados a conectar
     */
    public LivroDAO(BancoDados bd) {
        this.bd = bd;
    }
    
    @Override
    public void inserir(Livro o) throws BancoException {
        try {
            //Define String
            sql = "INSERT INTO Livro " +
                "VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,FALSE)";
            //Abre conexao e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atrubui os dados
            pst.setString(1, o.getIsbn());
            pst.setString(2, o.getTitulo());
            pst.setInt(3, o.getAutor().getID());
            pst.setInt(4,o.getEditora().getID());
            pst.setInt(5, o.getAnoPublicacao());
            pst.setString(6, o.getCategoria().toString());
            pst.setString(7, o.getResumo());
            pst.setString(8, o.getSumario());
            pst.setInt(9,o.getQtdEstoque());
            pst.setFloat(10,o.getPrecoVenda());
            pst.setFloat(11,o.getPrecoOferta());
            pst.setFloat(12,o.getPrecoCusto());
            pst.setFloat(13, o.getMargemLucro());
            pst.setBoolean(14, o.isOferta());
            pst.setBoolean(15, o.isDigital());
            //Executa
            pst.executeUpdate();
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao inserir o livro.");
        }
    }

    @Override
    public void alterar(Livro o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Livro SET " +
                "Isbn=?, Titulo=?, CodAutor=?, CodEditora=?, AnoPublicacao=?, Categoria=?, Resumo=?, Sumario=?, " +
                "QtdEstoque=?, PrecoVenda=?, PrecoOferta=?, PrecoCusto=?, MargemLucro=?, Q_Oferta=?, Q_Digital=? " +
                "WHERE CodLivro=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setString(1, o.getIsbn());
            pst.setString(2,o.getTitulo());
            pst.setInt(3, o.getAutor().getID());
            pst.setInt(4, o.getEditora().getID());
            pst.setInt(5, o.getAnoPublicacao());
            pst.setString(6, o.getCategoria().toString());
            pst.setString(7, o.getResumo());
            pst.setString(8, o.getSumario());
            pst.setInt(9,o.getQtdEstoque());
            pst.setFloat(10,o.getPrecoVenda());
            pst.setFloat(11,o.getPrecoOferta());
            pst.setFloat(12,o.getPrecoCusto());
            pst.setFloat(13, o.getMargemLucro());
            pst.setBoolean(14, o.isOferta());
            pst.setBoolean(15, o.isDigital());
            pst.setInt(16, o.getID());
            //Executa
            pst.executeUpdate(sql);
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao alterar o livro.");
        }
    }

    @Override
    public void excluir(Livro o) throws BancoException {
        try {
            //Define String
            sql = "UPDATE Livro SET XDEAD=TRUE WHERE CodLivro=?";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa
            pst.executeUpdate(sql);
            bd.fecharConexao();
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao excluir o livro.");
        }
    }

    @Override
    public Livro buscar(Livro o) throws BancoException {
        try {
            Livro livro = null;
            //Define String
            sql = "SELECT * FROM Livro WHERE Isbn=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setString(1, o.getIsbn());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                livro = new Livro();
                livro.setIsbn(rs.getString("Isbn"));
                livro.setTitulo(rs.getString("Titulo"));
                livro.setAnoPublicacao(rs.getInt("AnoPublicacao"));
                livro.setCategoria(CategoriaLivro.valueOf(rs.getString("Categoria")));
                livro.setResumo(rs.getString("Resumo"));
                livro.setSumario(rs.getString("Sumario"));
                try {
                    livro.setQtdEstoque(rs.getInt("QtdEstoque"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoVenda(rs.getFloat("PrecoVenda"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoOferta(rs.getFloat("PrecoOferta"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoCusto(rs.getFloat("PrecoCusto"));
                } catch (NegocioException ex) {}
                try {
                    livro.setMargemLucro(rs.getFloat("MargemLucro"));
                } catch (NegocioException ex) {}
                livro.setOferta(rs.getBoolean("Q_Oferta"));
                livro.setDigital(rs.getBoolean("Q_Digital"));
                livro.setID(rs.getInt("CodLivro"));
                livro.setID_AUTOR(rs.getInt("CodAutor"));
                livro.setID_EDITORA(rs.getInt("CodEditora"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(livro == null) {
                bd.fecharConexao();
                throw new BancoException("Livro não foi encontrado.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return livro;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o livro.");
        }
    }
    
    @Override
    public Livro buscarId(Livro o) throws BancoException {
        try {
            Livro livro = null;
            //Define String
            sql = "SELECT * FROM Livro WHERE CodLivro=? AND XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Atribui os dados
            pst.setInt(1, o.getID());
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            if(rs.next()){
                livro = new Livro();
                livro.setIsbn(rs.getString("Isbn"));
                livro.setTitulo(rs.getString("Titulo"));
                livro.setAnoPublicacao(rs.getInt("AnoPublicacao"));
                livro.setCategoria(CategoriaLivro.valueOf(rs.getString("Categoria")));
                livro.setResumo(rs.getString("Resumo"));
                livro.setSumario(rs.getString("Sumario"));
                try {
                    livro.setQtdEstoque(rs.getInt("QtdEstoque"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoVenda(rs.getFloat("PrecoVenda"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoOferta(rs.getFloat("PrecoOferta"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoCusto(rs.getFloat("PrecoCusto"));
                } catch (NegocioException ex) {}
                try {
                    livro.setMargemLucro(rs.getFloat("MargemLucro"));
                } catch (NegocioException ex) {}
                livro.setOferta(rs.getBoolean("Q_Oferta"));
                livro.setDigital(rs.getBoolean("Q_Digital"));
                livro.setID(rs.getInt("CodLivro"));
                livro.setID_AUTOR(rs.getInt("CodAutor"));
                livro.setID_EDITORA(rs.getInt("CodEditora"));
            }
            //Verifica se o objeto foi nulo e joga uma exceção, caso não foi encontrado
            if(livro == null) {
                bd.fecharConexao();
                throw new BancoException("Livro não foi encontrado.");
            }
            //Prossegue procedimento, caso tenha encontrado
            bd.fecharConexao();
            return livro;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao buscar o livro.");
        }
    }

    @Override
    public List<Livro> listar() throws BancoException {
        try {
            ArrayList<Livro> livros = new ArrayList<>();
            Livro livro;
            //Define String
            sql = "SELECT * FROM Livro WHERE XDEAD=FALSE";
            //Abre banco e prepara gatilho
            pst = bd.abrirConexao().prepareStatement(sql);
            //Executa e puxa a busca
            rs = pst.executeQuery();
            //Verifica se houve resultados e atribui valores ao objeto
            while(rs.next()){
                livro = new Livro();
                livro.setIsbn(rs.getString("Isbn"));
                livro.setTitulo(rs.getString("Titulo"));
                livro.setAnoPublicacao(rs.getInt("AnoPublicacao"));
                livro.setCategoria(CategoriaLivro.valueOf(rs.getString("Categoria")));
                livro.setResumo(rs.getString("Resumo"));
                livro.setSumario(rs.getString("Sumario"));
                try {
                    livro.setQtdEstoque(rs.getInt("QtdEstoque"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoVenda(rs.getFloat("PrecoVenda"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoOferta(rs.getFloat("PrecoOferta"));
                } catch (NegocioException ex) {}
                try {
                    livro.setPrecoCusto(rs.getFloat("PrecoCusto"));
                } catch (NegocioException ex) {}
                try {
                    livro.setMargemLucro(rs.getFloat("MargemLucro"));
                } catch (NegocioException ex) {}
                livro.setOferta(rs.getBoolean("Q_Oferta"));
                livro.setDigital(rs.getBoolean("Q_Digital"));
                livro.setID(rs.getInt("CodLivro"));
                livro.setID_AUTOR(rs.getInt("CodAutor"));
                livro.setID_EDITORA(rs.getInt("CodEditora"));
                //Adiciona à lista
                livros.add(livro);
            }
            bd.fecharConexao();
            return livros;
        } catch (SQLException ex) {
            bd.fecharConexao();
            throw new BancoException("Houve um problema ao listar os livros.");
        }
    }
}