package br.edu.univas.vo;

import java.util.List;

public class Product {

    public String nome;
    public float unitPrice;
    public int quantity;
    public List<Product> productSons;

    public Product(String nome, float unitPrice, int quantity){
        this.nome = nome;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

}
