package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.Scanner;


public class Tree {

    private Node root;
    Scanner scanner = new Scanner(System.in);

    public void insertRoot(Product product) {
        root = createNode(product);
        root.dad = null;
        root.sons = new ArrayList<>();
    }

    public void insertSecondLevelNode(Product product){
        Node rootSecondLevel = createNode(product);
        rootSecondLevel.dad = root;
        rootSecondLevel.sons = new ArrayList<>();
        root.sons.add(rootSecondLevel);
    }

    public void insertFirstThirdLevelNode(Product product){
        Node rootThirdLevel = createNode(product);
        rootThirdLevel.dad = ;
        rootThirdLevel.sons = new ArrayList<>();
    }

    public void insertSecondThirdLevelNode(Product product){
        Node rootThirdLevel = createNode(product);
        Node dad = rootThirdLevel.searcher(String.valueOf(product));
        rootThirdLevel.dad = dad;
        rootThirdLevel.sons = new ArrayList<>();

    }

    public Node createNode(Product newProduct) {
        Node newNode = new Node();
        newNode.product = newProduct;
        return newNode;
    }




}
