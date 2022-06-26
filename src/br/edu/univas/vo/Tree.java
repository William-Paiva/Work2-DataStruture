package br.edu.univas.vo;

import java.util.ArrayList;

public class Tree {

    private Node root;

    public void insertRoot(Product product) {
        root = createNode(product);
        root.dad = null;
        root.sons = new ArrayList<>();
    }

    public Node insertSecondLevelNode(Product product){
        Node rootSecondLevel = createNode(product);
        rootSecondLevel.dad = root;
        rootSecondLevel.sons = new ArrayList<>();
        return rootSecondLevel;
    }

    public Node insertThirdLevelNode(Product product){
        Node rootThirdLevel = createNode(product);
        rootThirdLevel.dad = root;
        rootThirdLevel.sons = new ArrayList<>();
        return rootThirdLevel;
    }

    public Node createNode(Product newProduct) {
        Node newNode = new Node();
        newNode.product = newProduct;
        return newNode;
    }


}
