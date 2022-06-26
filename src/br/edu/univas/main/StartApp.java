package br.edu.univas.main;

import br.edu.univas.vo.Node;
import br.edu.univas.vo.Product;
import br.edu.univas.vo.Tree;

import java.util.Scanner;

public class StartApp {

    Scanner scanner = new Scanner(System.in);


    public void start(){
        Tree tree = new Tree();

        //Product root "Violão".
        insertProductRoot(tree);

        //Products Second Level "Corpo", "Braço", "Mão".

        insertSecondLevelProduct(tree);

        insertSecondLevelProduct(tree);

        insertSecondLevelProduct(tree);

        //Product Third Level "Mão", "Trastes";




    }

    public void insertProductRoot(Tree tree){

        String name = scanner.nextLine();
        float unitPrice = scanner.nextFloat();
        int quantity = scanner.nextInt(); scanner.nextLine();

        Product productRoot = new Product(name, unitPrice , quantity);
        tree.insertRoot(productRoot);
    }

    public void insertSecondLevelProduct(Tree tree){

        String name = scanner.nextLine();
        float unitPrice = scanner.nextFloat();
        int quantity = scanner.nextInt(); scanner.nextLine();

        Product secondLevelProduct = new Product(name, unitPrice , quantity);
        tree.insertSecondLevelNode(secondLevelProduct);

    }

    public void insertThirdLevelProduct(Tree tree){

        String name = scanner.nextLine();
        float unitPrice = scanner.nextFloat();
        int quantity = scanner.nextInt(); scanner.nextLine();

        Product thirdLevelProduct = new Product(name, unitPrice , quantity);
        tree.insertThirdLevelNode(thirdLevelProduct);
    }
}
