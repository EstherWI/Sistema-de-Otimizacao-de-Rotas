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

import util.Aresta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Cidade;

/**
 *
 * @authors Esther Araújo e Ariana Pereira
 */
public class Vertice implements Serializable {
    private Cidade cidade;
    private List<Aresta> arestas = new ArrayList<Aresta>();
    private int ID;
    private int peso;

    /**
     * Construtor padrão da classe.
     * @param cidade 
     */
    public Vertice(Cidade cidade, int ID) {
        this.cidade = cidade;
        this.ID=ID++;
    }

    /**
     * Retorna a distancia para este vértice.
     * @return distancia 
     */
    public int getDistancia(){
        return peso;
    }
    
    /**
     * Adiciona uma aresta
     * @param aresta 
     */
    public void addAresta(Aresta aresta){
        arestas.add(aresta);
    }

    public int getId(){
        return this.ID;
    }
    
    public Cidade getCidade(){
        return cidade;
    }
    public List<Aresta> getArestas(){
        return arestas;
    }  

    public void setDistancia(int distancia){
        this.peso=distancia;
    }
    /**
     * Verifica se algum vértice é o mesmo que este.
     *
     * @param vertex vértice a ser comparado
     * @return true se for o mesmo vértice, e false caso não seja
     */
    @Override
    public boolean equals(Object vertex) {
        if (vertex instanceof Vertice) {
            Vertice outro = (Vertice) vertex;
            return this.ID == outro.getId();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vertice{" + "Cidade" + ID + '}';
    }

}
