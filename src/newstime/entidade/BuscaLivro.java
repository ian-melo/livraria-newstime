//TODO: Implementar
package newstime.entidade;

import java.util.ArrayList;

/**
 * Classe de entidade que representa a atividade de busca de livros
 * @author Ian Melo
 */
public class BuscaLivro {
    /**
     * Lista de livros da busca de livros
     */
    private final ArrayList<Livro> livros = new ArrayList<>();
    
    /**
     * Tipos de critério de organização de busca de livros
     */
    public static enum OrganizacaoBusca {
        /**
         * Ordem alfabética crescente
         */
        ALFA_ASC,
        /**
         * Ordem alfabética decrescente
         */
        ALFA_DESC,
        /**
         * Ordem de preço crescente
         */
        PRECO_ASC,
        /**
         * Ordem de preço decrescente
         */
        PRECO_DESC
    }
    /**
     * Tipos de critério de busca de livros
     */
    public static enum CriterioBusca {
        /**
         * Busca por categoria
         */
        CATEGORIA,
        /**
         * Busca por editora
         */
        EDITORA,
        /**
         * Busca por título
         */
        TITULO,
        /**
         * Busca por autor
         */
        AUTOR
    }
    
    /**
     * Busca uma lista de livros que condizem com os parâmetros
     * @param palChave Palavra chave
     * @param criterio Critério de busca
     * @return Lista de livros que condizem com os parâmetros
     */
    public ArrayList<Livro> buscarLivros(String palChave, CriterioBusca criterio) {
        return null;
    }
    /**
     * Busca uma lista de livros que condizem com os parâmetros
     * @param palChave Palavra chave
     * @param criterio Critério de busca
     * @param organizacao Critério de organização de busca
     * @return Lista de livros que condizem com os parâmetros
     */
    public ArrayList<Livro> buscarLivros(String palChave, CriterioBusca criterio, OrganizacaoBusca organizacao) {
        return null;
    }
    /**
     * Busca uma lista de livros que estejam em oferta
     * @return Lista de livros que estejam em oferta
     */
    public ArrayList<Livro> buscarOfertas() {
        return null;
    }
    /**
     * Busca uma lista de lista de livros mais vendidos
     * @return Lista de lista de livros mais vendidos
     */
    public ArrayList<Livro> buscarMaisVendidos() {
        return null;
    }
    /**
     * Busca uma lista de lista de livros por categorias
     * @return Lista de lista de livros por categorias
     */
    public ArrayList<Livro> buscarCategorias() {
        return null;
    }
    /**
     * Busca uma lista de lista de livros que sejam físicos
     * @return Lista de lista de livros que sejam físicos
     */
    public ArrayList<Livro> buscarFisicos() {
        return null;
    }
    /**
     * Busca uma lista de lista de livros que sejam digitais
     * @return Lista de lista de livros que sejam digitais
     */
    public ArrayList<Livro> buscarDigitais() {
        return null;
    }
}
