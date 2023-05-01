/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Alimento {
    public Alimento(String produto, double preco) {
        this.NomeP = produto;
        this.preco = preco;
    }

    public String getNomeP() {
        return NomeP;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeP(String NomeP) {
        this.NomeP = NomeP;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    private String NomeP;
    private double preco;
    
    @Override
    public String toString() {
        return this.getNomeP() + " " +
                "$" + this.getPreco() + "\n";
    }
}
