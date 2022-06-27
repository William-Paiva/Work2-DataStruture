package br.edu.univas.vo;

import java.util.List;

public class Node {

    public Product product;
    public Node dad;
    public List<Node> sons;

    public Node searcher(String theChosen) {
        if (theChosen.equals(product)) return this;
        for (Node son : sons) {
            Node ok = son.searcher(theChosen);
            if (ok != null) return ok;
        }
        return null;
    }

}


