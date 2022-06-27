package br.edu.univas.main;

import br.edu.univas.vo.Product;
import br.edu.univas.vo.Tree;
import java.util.Scanner;

public class StartApp {

    Scanner scanner = new Scanner(System.in);
    public void start(){

        Tree tree = new Tree();

        // Enter "Violão";
        System.out.println("Enter the root product: ");
        insertProductRoot(tree);

        //Enter "Corpo", "Braço", "Mão";
        for(int i=0; i<3; i++){
            System.out.println("Enter the " + i+1 + "º second level product: ");
            insertSecondLevelProduct(tree);
        }

        //Enter "Trastes", "Tarraxas";

    }

    public void insertProductRoot(Tree tree){

        Product productRoot = productSets();
        tree.insertRoot(productRoot);
    }
    public void insertSecondLevelProduct(Tree tree){

        Product secondLevelProduct = productSets();
        tree.insertSecondLevelNode(secondLevelProduct);
    }
    public void insertThirdLevelProduct(Tree tree){

        Product thirdLevelProduct = productSets();
        tree.insertFirstThirdLevelNode(thirdLevelProduct);
    }
    public Product productSets(){
        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the product unit price: ");
        float unitPrice = scanner.nextFloat();
        System.out.println("Enter the product quantity to make Node dad: ");
        int quantity = scanner.nextInt(); scanner.nextLine();

       Product product = new Product(name, unitPrice, quantity);

       return product;
    }
}
