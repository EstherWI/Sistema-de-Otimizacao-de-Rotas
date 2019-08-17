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

import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esther Araújo, Ariana Pereira
 */
public class DijkstraTest {
    
private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo();
        grafo.addVertice(new Cidade("Feira de Santana", 0, 10));
        grafo.addVertice(new Cidade("Cruz das Almas", 20, 10));
        grafo.addVertice(new Cidade("Entre Rios", 30, 50));
        grafo.addVertice(new Cidade("Alagoinhas", 0, 50));
        grafo.addVertice(new Cidade("Salvador", 9, 15));
        grafo.addAresta(grafo.getVertice(0),grafo.getVertice(1) , 50);
        grafo.addAresta(grafo.getVertice(0),grafo.getVertice(3) , 20);
        grafo.addAresta(grafo.getVertice(0),grafo.getVertice(2) , 80);
        grafo.addAresta(grafo.getVertice(2),grafo.getVertice(3), 80);
        grafo.addAresta(grafo.getVertice(3),grafo.getVertice(4) , 80);
        grafo.addAresta(grafo.getVertice(2),grafo.getVertice(4) , 80);
    }

    /**
     * Test of encontraCaminho method, of class Dijkstra.
     */
    @Test
    public void testEncontraCaminho() {
        List<Vertice> cidades = new LinkedList();
        Dijkstra dijkstra = new Dijkstra(grafo, grafo.getVertice(0));
        assertEquals((dijkstra.encontraCaminho(grafo.getVertice(4))).get(0),grafo.getVertice(0));
        assertEquals((dijkstra.encontraCaminho(grafo.getVertice(4))).get(1),grafo.getVertice(3));
        grafo.addVertice(new Cidade("Vitória da Conquista", 0, 0));
        grafo.addAresta(grafo.getVertice(3),grafo.getVertice(5) , 20);
        grafo.addAresta(grafo.getVertice(4),grafo.getVertice(5) , 20);
        dijkstra = new Dijkstra(grafo, grafo.getVertice(0));
        assertEquals((dijkstra.encontraCaminho(grafo.getVertice(5))).get(1),grafo.getVertice(3));
    }

    /**
     * Test of getDistancia method, of class Dijkstra.
     */
    @Test
    public void testGetDistancia() {
        Dijkstra dijkstra = new Dijkstra(grafo, grafo.getVertice(0));
        assertEquals(dijkstra.getDistancia(grafo.getVertice(3)), 20);
        assertEquals(dijkstra.getDistancia(grafo.getVertice(4)), 100);
        assertEquals(dijkstra.getDistancia(grafo.getVertice(1)), 50);
    }
    
}
