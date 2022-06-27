package br.edu.univas.vo;

import java.util.List;
import java.util.Objects;

public class Product {

    public String name;
    public float unitPrice;
    public int quantity;
    public List<Product> productSons;

    public Product(String name, float unitPrice, int quantity){
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
