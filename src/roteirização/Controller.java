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
package roteirização;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import model.Carro;
import util.Vertice;
import util.Grafo;
import view.FinalJFrame;
import view.InfoJPanel;
import view.TheJPanel;

/**
 *
 * @author Esther Araujo e Ariana Pereira
 */
public class Controller {
    private List<Vertice> listaCidades = new ArrayList();
    private List<Vertice> rota;
    private Grafo grafo = new Grafo();
    String newLine = System.getProperty("line.separator");
    private FinalJFrame view;
    private List<Carro> listaCarros = new ArrayList();
    private InfoJPanel info;
    private Carro carroSelecionado;
    
    public Controller() throws FileNotFoundException, IOException, ClassNotFoundException {
        setCarros();
        ObjectInputStream grafoDoArquivo = null;
        grafoDoArquivo = new ObjectInputStream(new FileInputStream("grafoDoMapa"));
        grafo = (Grafo) grafoDoArquivo.readObject();
        view = new FinalJFrame(this);
        listaCidades.add(grafo.getVertice(0));
        listaCidades.add(grafo.getVertice(0));
    }
    
    public void addCidade(int num) {
        listaCidades.remove(listaCidades.size()-1);
        listaCidades.add(grafo.getVertice(num));
        listaCidades.add(grafo.getVertice(0));
    }
    
    public void removeCidade(int num) {
        listaCidades.remove(grafo.getVertice(num));
    }
    
    public void criarRota() throws IOException {
        rota = grafo.getRota(listaCidades);
        view.colorRota(rota);
        imprimeRota();
    }
    
    public void resetRota() {
        listaCidades.clear();
        listaCidades.add(grafo.getVertice(0));
        listaCidades.add(grafo.getVertice(0));
    }
    
    public void imprimeRota() throws IOException {
        File arquivo = new File("RodaDasCidades.txt");
        FileWriter fw = new FileWriter(arquivo);
        
        DecimalFormat valor = new DecimalFormat("0.##");
        String newValor = valor.format(carroSelecionado.consumo(grafo.getSomaKm(listaCidades)));
        
        int size = rota.size();
        fw.write("Roteiro de viagem" + newLine);
        fw.write("Total de Km Percorridos: " + grafo.getSomaKm(listaCidades) + newLine);
        fw.write("Gasto com combustível: " + newValor + " Reais" + newLine);
        for(int i = 0; i < size; i++) {
            fw.write(rota.get(i).getCidade().getNome() + newLine);
        }
        fw.close();
    }

    public List getVerticeFromGrafo() {
        return grafo.getVertices();
    }
    
    public List getArestaFromGrafo() {
        return grafo.getListaArestas();
    }
    
    
    public void setCarros() {
        listaCarros.add(0, new Carro("Mercedes Accelo 1016", "6,4 Toneladas", 6.5));
        listaCarros.add(1, new Carro("Foton 10-16DT", "6,5 Toneladas", 6.2));
        listaCarros.add(2, new Carro("Agrale A8700", "5,6 Toneladas", 6.0));
        listaCarros.add(3, new Carro("Ford Cargo 1119", "7,1 Toneladas", 4.5));
    }
    
    public void setCarroSelecionado(Carro carro) {
        carroSelecionado = carro;
    }
    
    public List getCarros(){
      return listaCarros;
    }
}
