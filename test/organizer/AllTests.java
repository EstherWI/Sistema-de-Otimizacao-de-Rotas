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
package organizer;



import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import util.DijkstraTest;
import util.GrafoTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        DijkstraTest.class,
        GrafoTest.class
})
public class AllTests { }

