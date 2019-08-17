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
package util;

import java.io.Serializable;

/**
 *
 * @authors Esther Araújo e Ariana Pereira
 */
public class Aresta implements Serializable {

    private Vertice[] vertex;
    private int ID, peso;
    private static int id = 0;

    /**
     * Construtor da classe, que é responsável por unir dois vértices através de
     * uma aresta ponderada.
     *
     * @param a vértice
     * @param b vértice
     * @param peso peso da aresta
     */
    public Aresta(Vertice a, Vertice b, int peso) {
        vertex = new Vertice[2];
        vertex[0] = a;
        vertex[1] = b;
        ID = id++;
        vertex[0].addAresta(this);
        vertex[1].addAresta(this);
        this.peso=peso;
    }

    /**
     * Métoro que retorna o vértice.
     * @param x índice do vértice
     * @return vértice correspondente ao índice
     */
    public Vertice getVertice(Vertice x) {
        if (x == vertex[0]) {
            return vertex[1];
        }
        return vertex[0];
    }

    /**
     * Método que modifica o peso de uma aresta.
     * @param peso 
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Método que retorna o peso de uma aresta.
     * @return peso
     */
    public int getPeso() {
        return peso;
    }
    
    public Vertice[] getVertices() {
        return vertex;
    }
}
