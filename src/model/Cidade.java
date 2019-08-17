/** ***************************************************************************************
 * Autora: Esther de Santana Araújo e Ariana de Jesus Santos Pereira
 * Componente Curricular: MI-Programação
 * Concluido em: 08/02/2019
 * Declaro que este código foi elaborado por nós de forma individual e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de livros e
 * apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
 * de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
 * do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
 ***************************************************************************************** */
package model;

import java.io.Serializable;

/**
 * Objeto responsável por representar uma cidade do mapa e cada cidade é
 * identificada através de seu nome.
 *
 * @authors Esther Araújo e Ariana Pereira
 */
public class Cidade implements Serializable{

    private String nome;
    private int x;
    private int y;

    /**
     * Construtor padrão da classe.
     * @param nome nome da cidade
     * @param y coordenada y
     * @param x coordenada x
     */
    public Cidade(String nome, int y, int x) {
        this.nome = nome;
        this.x=x;
        this.y=y;
    }

    /**
     * Método responsável por retornar o nome de uma cidade.
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método responsável por modificar o nome de uma cidade.
     * @param nome novo nome da cidade
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getY() {
        return y;
    }
    
    public int getX() {
        return x;
    }
}
