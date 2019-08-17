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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Esther Araújo e Ariana Pereira
 */
public class Dijkstra implements Serializable {

    private final int OO = 2147483647;//infinito 
    private List naoVisitados = new ArrayList();
    private int[] antecessores = new int[30];
    private List<Vertice> vertices = new ArrayList();
    private int[] distancia = new int[30];
    private Vertice origem;

    public Dijkstra(Grafo grafo, Vertice origem) {
        this.origem = origem;
        antecessores[origem.getId()]=origem.getId();
        for (int i = 0; i < grafo.getVertices().size(); i++) {
            ((Vertice) grafo.getVertices().get(i)).setDistancia(OO);
            naoVisitados.add((Vertice) grafo.getVertices().get(i));
            vertices.add((Vertice) grafo.getVertices().get(i));     
        }
        origem.setDistancia(0);
        Collections.sort(naoVisitados, new ComparAresta());
        while (!naoVisitados.isEmpty()){
            Vertice v = (Vertice) naoVisitados.remove(0);
            List<Aresta> arestas = v.getArestas();
            int custoCaminho = v.getDistancia();
            for (Aresta a : arestas){
                int peso = (a.getPeso() + custoCaminho);
                Vertice vertex = a.getVertice(v);
                if (peso < vertex.getDistancia()) {
                    vertex.setDistancia(peso);
                    antecessores[vertex.getId()]= v.getId();
                    distancia[vertex.getId()]= peso;
                }
            }
            Collections.sort(naoVisitados, new ComparAresta());
        }
    }

    public List<Vertice> encontraCaminho(Vertice destino) {
        List<Vertice> rota = new ArrayList();
        int index;
        index = destino.getId();
        while((Integer)antecessores[index]!= origem.getId()){
            rota.add(0,vertices.get(antecessores[index]));
            index=antecessores[index];
        }
        rota.add(0, origem);
        return rota;
    }

    public int getDistancia(Vertice destino){
        return (Integer)distancia[destino.getId()];
    }
    private class ComparAresta implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Vertice v1 = (Vertice) o1;
            Vertice v2 = (Vertice) o2;
            return v1.getDistancia() - v2.getDistancia();
        }
    }
}
