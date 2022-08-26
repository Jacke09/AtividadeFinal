/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author vfelinto54
 */
public class Produto {
    private int idProduto;
    private double valor;
    private String nome, categoria;

    public Produto(int idProduto, double valor, String nome, String categoria) {
        this.idProduto = idProduto;
        this.valor = valor;
        this.nome = nome;
        this.categoria = categoria;
    }

 public Produto(double valor, String nome, String categoria) {
       this.valor = valor;
      this.nome = nome;
       this.categoria = categoria;
   }

    public int getIdProduto() {
        return idProduto;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
    
}
