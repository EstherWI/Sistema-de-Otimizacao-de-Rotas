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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import model.Cidade;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Esther Araújo e Ariana Pereira
 */
public class GrafoTest {

    private Grafo grafo;

    @Before
    public void setUp() {
        grafo = new Grafo();
        grafo.addVertice(new Cidade("Feira de Santana", 0, 10));
        grafo.addVertice(new Cidade("Cruz das Almas", 20, 10));
        grafo.addVertice(new Cidade("Entre Rios", 30, 50));
        grafo.addVertice(new Cidade("Alagoinhas", 0, 50));
        grafo.addVertice(new Cidade("Salvador", 9, 15));
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(1), 50);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(3), 20);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(2), 80);
    }
    @Test
    public void setGrapho() throws FileNotFoundException, IOException {
        grafo = new Grafo();
        grafo.addVertice(new Cidade("Feira de Santana", 36, 77));
        grafo.addVertice(new Cidade("Salvador", 43, 84));
        grafo.addVertice(new Cidade("Alagoinhas", 35, 85));
        grafo.addVertice(new Cidade("Pé de Serra", 32, 68));
        grafo.addVertice(new Cidade("Conceição do Coité", 31, 70));
        grafo.addVertice(new Cidade("Jequié", 51, 67));
        grafo.addVertice(new Cidade("Juazeiro", 8, 60));
        grafo.addVertice(new Cidade("Senhor do Bonfim", 14, 63));
        grafo.addVertice(new Cidade("Irecê", 22, 40));
        grafo.addVertice(new Cidade("Jacobina", 19, 59));
        grafo.addVertice(new Cidade("Xique-xique", 15, 34));
        grafo.addVertice(new Cidade("Barreiras", 35, 15));
        grafo.addVertice(new Cidade("Lençóis", 33, 50));
        grafo.addVertice(new Cidade("Ibotirama", 36, 33));
        grafo.addVertice(new Cidade("Bom Jesus da Lapa", 45, 31));
        grafo.addVertice(new Cidade("Vitória da Conquista", 61, 57));
        grafo.addVertice(new Cidade("Itapetinga", 67, 67));
        grafo.addVertice(new Cidade("Ilhéus", 61, 78));
        grafo.addVertice(new Cidade("Conceição do Jacuipe", 37, 79));
        grafo.addVertice(new Cidade("Porto Seguro", 80, 77));
        grafo.addVertice(new Cidade("Teixeira de Freitas", 90, 70));
        grafo.addVertice(new Cidade("Eunápolis", 80, 70));
        grafo.addVertice(new Cidade("St. Antônio de Jesus", 42, 72));
        grafo.addVertice(new Cidade("Entre Rios", 33, 88));
        grafo.addVertice(new Cidade("Esplanada", 32, 89));
        grafo.addVertice(new Cidade("Cruz das Almas", 39, 75));
        grafo.addVertice(new Cidade("Correntina", 47, 21));
        grafo.addVertice(new Cidade("Caetité", 53, 42));
        grafo.addVertice(new Cidade("Camaçari", 41, 86));
        grafo.addVertice(new Cidade("Rio Real", 29, 91));
        
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(2), 58);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(3), 84);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(18), 22);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(1), 95);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(17), 281);
        grafo.addAresta(grafo.getVertice(0), grafo.getVertice(25), 28);
        
        grafo.addAresta(grafo.getVertice(1), grafo.getVertice(18), 77);
        grafo.addAresta(grafo.getVertice(1), grafo.getVertice(28), 38);
        grafo.addAresta(grafo.getVertice(1), grafo.getVertice(17), 208);
        
        grafo.addAresta(grafo.getVertice(2), grafo.getVertice(28), 64);
        grafo.addAresta(grafo.getVertice(2), grafo.getVertice(23), 42);
        grafo.addAresta(grafo.getVertice(2), grafo.getVertice(4), 113);
        
        grafo.addAresta(grafo.getVertice(3), grafo.getVertice(4), 46);
        grafo.addAresta(grafo.getVertice(3), grafo.getVertice(22), 129);
        grafo.addAresta(grafo.getVertice(3), grafo.getVertice(9), 123);
        
        grafo.addAresta(grafo.getVertice(4), grafo.getVertice(7), 155);
        grafo.addAresta(grafo.getVertice(4), grafo.getVertice(29), 148);
        
        grafo.addAresta(grafo.getVertice(5), grafo.getVertice(22), 130);
        grafo.addAresta(grafo.getVertice(5), grafo.getVertice(17), 153);
        grafo.addAresta(grafo.getVertice(5), grafo.getVertice(15), 137);
        grafo.addAresta(grafo.getVertice(5), grafo.getVertice(12), 200);
        
        grafo.addAresta(grafo.getVertice(6), grafo.getVertice(7), 120);
        grafo.addAresta(grafo.getVertice(6), grafo.getVertice(9), 194);
        grafo.addAresta(grafo.getVertice(6), grafo.getVertice(8), 256);
        
        grafo.addAresta(grafo.getVertice(8), grafo.getVertice(9), 159);
        grafo.addAresta(grafo.getVertice(8), grafo.getVertice(10), 107);
        
        grafo.addAresta(grafo.getVertice(9), grafo.getVertice(12), 182);
        
        grafo.addAresta(grafo.getVertice(10), grafo.getVertice(11), 287);
        
        grafo.addAresta(grafo.getVertice(11), grafo.getVertice(13), 194);
        grafo.addAresta(grafo.getVertice(11), grafo.getVertice(26), 143);
        
        grafo.addAresta(grafo.getVertice(12), grafo.getVertice(13), 203);
        grafo.addAresta(grafo.getVertice(12), grafo.getVertice(14), 232);
        
        grafo.addAresta(grafo.getVertice(13), grafo.getVertice(14), 118);
        
        grafo.addAresta(grafo.getVertice(14), grafo.getVertice(26), 133);
        
        grafo.addAresta(grafo.getVertice(15), grafo.getVertice(16), 77);
        grafo.addAresta(grafo.getVertice(15), grafo.getVertice(27), 195);
        
        grafo.addAresta(grafo.getVertice(16), grafo.getVertice(17), 139);
        grafo.addAresta(grafo.getVertice(16), grafo.getVertice(21), 145);
        
        grafo.addAresta(grafo.getVertice(17), grafo.getVertice(20), 181);
        grafo.addAresta(grafo.getVertice(17), grafo.getVertice(21), 182);
        
        grafo.addAresta(grafo.getVertice(19), grafo.getVertice(20), 139);
        grafo.addAresta(grafo.getVertice(19), grafo.getVertice(21), 53);
        
        grafo.addAresta(grafo.getVertice(20), grafo.getVertice(21), 128);
        
        grafo.addAresta(grafo.getVertice(22), grafo.getVertice(25), 38);
        
        grafo.addAresta(grafo.getVertice(23), grafo.getVertice(24), 21);
        
        grafo.addAresta(grafo.getVertice(24), grafo.getVertice(29), 34);
        
        grafo.addAresta(grafo.getVertice(26), grafo.getVertice(27), 245);
        
        grafo.gerarDijkstra();
        ObjectOutputStream grafoMapa = new ObjectOutputStream(new FileOutputStream("grafoDoMapa"));
        grafoMapa.writeObject(grafo);
    }    
    /**
     * Test of addAresta method, of class Grafo.
     */
    @Test
    public void testAddAresta() {
        grafo.addAresta(grafo.getVertice(2), grafo.getVertice(3), 80);
        List feira = grafo.getVertice(0).getArestas();
        List entreRios = grafo.getVertice(2).getArestas();
        List alagoinhas = grafo.getVertice(3).getArestas();
        assertTrue(feira.contains(entreRios.get(0)));
        assertTrue(alagoinhas.contains(entreRios.get(1)));
        assertTrue(alagoinhas.contains(feira.get(1)));
    }

    /**
     * Test of addVertice method, of class Grafo.
     */
    @Test
    public void testAddVertice() {
        assertEquals(grafo.getNumVertices(), 5);
        grafo.addVertice(new Cidade("Pé de Serra", 0, 20));
        grafo.addVertice(new Cidade("Camaçari", 40, 15));
        assertEquals(grafo.getNumVertices(), 7);
    }

    /**
     * Test of getRota method, of class Grafo.
     */
    @Test
    public void testGetRota() {
        List<Vertice> cidades = new LinkedList();
        cidades.add(grafo.getVertice(0));
        cidades.add(grafo.getVertice(4));
        cidades.add(grafo.getVertice(2));
        grafo.addAresta(grafo.getVertice(3), grafo.getVertice(4), 80);
        grafo.addAresta(grafo.getVertice(2), grafo.getVertice(4), 10);
        grafo.gerarDijkstra();
        assertEquals((grafo.getRota(cidades)).get(0), grafo.getVertice(0));
        assertEquals((grafo.getRota(cidades)).get(1), grafo.getVertice(2));
    }

}
