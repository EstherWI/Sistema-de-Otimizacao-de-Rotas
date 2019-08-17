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

import util.Vertice;
import java.io.Serializable;

/**
 *
 * @authors Esther Araújo e Ariana Pereira
 */
public class Carro implements Serializable{
    private String tipo;
    private String capacidadeCarga;
    private double kmLitro;
    String newLine = System.getProperty("line.separator");

    public Carro(String tipo, String capacidadeCarga ,double kmLitro) {
        this.tipo = tipo;
        this.capacidadeCarga = capacidadeCarga;
        this.kmLitro = kmLitro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKmLitro() {
        return kmLitro;
    }

    public void setKmLitro(double kmLitro) {
        this.kmLitro = kmLitro;
    }
    
    public Double consumo (int somaKm) {
        double consumoTotal;
        consumoTotal = ((somaKm) / getKmLitro() ) * 3.45;
        return consumoTotal;
    }

    @Override
    public String toString() {
        return "Carro: " + "Modelo - " + tipo + newLine + "Capacidade de Carga - " + capacidadeCarga + newLine +  "Consumo km/L - " + kmLitro;
    }
}
