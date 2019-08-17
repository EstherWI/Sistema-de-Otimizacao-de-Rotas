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
package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.List;
import javax.swing.ImageIcon;
import util.Vertice;
import roteirização.Controller;
import util.Aresta;

/**
 *
 * @author Esther Araujp e Ariana Pereira
 */
public class MapaJPanel extends javax.swing.JPanel {
    private ImageIcon mapa;
    private List<Vertice> vertices;
    private List<Aresta> arestas;
    private List<Vertice> rota;
    /**
     * Creates new form MapaJPanel
     */
    public MapaJPanel() {
        initComponents();
        mapa = new ImageIcon(getClass().getResource("bahia2.png"));
        setPreferredSize(new Dimension(680, 680));
        setMinimumSize(new Dimension(600, 600));
    }
  
    public void getVertice(Controller controller) {
        vertices = controller.getVerticeFromGrafo();
        arestas = controller.getArestaFromGrafo(); 
    }
    
    public void getRota(List<Vertice> rota) {
        this.rota = rota;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics img) {
        super.paintComponent(img);
        img.drawImage(mapa.getImage(), 0, 0, getWidth(), getHeight(), null);
        
        Graphics2D imgMapa = (Graphics2D) img;
        Stroke pincel = new BasicStroke(7, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        
        if (! (vertices == null)) {
            for(int i = 0; i <30; i++) {
                imgMapa.fillOval(vertices.get(i).getCidade().getX()*7, vertices.get(i).getCidade().getY()*7, 7, 7);
            }   
        }
        
        if (! (arestas == null)) {
            for (int i = 0; i < arestas.size(); i++) {
                Vertice[] vertice = arestas.get(i).getVertices();
                imgMapa.drawLine(vertice[0].getCidade().getX()*7, vertice[0].getCidade().getY()*7, vertice[1].getCidade().getX()*7, vertice[1].getCidade().getY()*7);
            }
        }
        
        imgMapa.setColor(Color.red);
        if (! (rota == null)) {
            int fim = rota.size();
            for (int i = 0; i < (fim - 1); i++) {
                imgMapa.drawLine(rota.get(i).getCidade().getX()*7, rota.get(i).getCidade().getY()*7, rota.get(i + 1).getCidade().getX()*7, rota.get(i + 1).getCidade().getY()*7);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}