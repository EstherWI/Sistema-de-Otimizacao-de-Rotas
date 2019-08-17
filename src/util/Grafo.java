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
import java.util.ArrayList;
import java.util.List;
import model.Cidade;

/**
 *
 * @authors Esther Araújo e Ariana Pereira
 */
public class Grafo implements Serializable {

    private int numDeVertices = 0;
    private List<Vertice> arrayDeVertices = new ArrayList();
    private List<Dijkstra> dijkstra = new ArrayList();
    private List<Aresta> arestaGrafo = new ArrayList();


    /**
     * Método que adiciona uma aresta no grafo
     * @param c1 vértice 
     * @param c2 vértice
     * @param peso distancia entre os vértices (peso da aresta)
     */
    public void addAresta(Vertice c1, Vertice c2, int peso) {
        Aresta a = new Aresta(c1, c2, peso);
        arestaGrafo.add(a);
    }

    public void addVertice(Cidade e) {
        Vertice v = new Vertice(e, numDeVertices);
        arrayDeVertices.add(v);
        numDeVertices++;
    }

    /**
     * @return array com os vértices
     */
    public List getVertices(){
        return arrayDeVertices;
    }

    public Vertice getVertice(int index){
        return arrayDeVertices.get(index);
    }
    public void gerarDijkstra(){
        for(int i=0;i<numDeVertices;i++){
           dijkstra.add(new Dijkstra(this,arrayDeVertices.get(i)));
        }    
    }

    public List getRota(List<Vertice> cidades){
        List<Vertice> rota = new ArrayList();
        int size = cidades.size();
        int j=1;
        for(int i=0; i<size-1;i++){
            rota.addAll(dijkstra.get(cidades.get(i).getId()).encontraCaminho(cidades.get(j)));
            j++; 
        }
        rota.add(arrayDeVertices.get(0));
        return rota;
    }
    
    public int getSomaKm(List<Vertice> cidades) {
        int somaKm = 0;
        for(int i = 0; i < cidades.size(); i++) {
            int j = 1;
            somaKm = somaKm + dijkstra.get(i).getDistancia(cidades.get(j));
            j++;
        }
        return somaKm;
    }
    
    public int getNumVertices() {
        return numDeVertices;
    }
    
    public List getListaArestas() {
        return arestaGrafo;
    }
}
