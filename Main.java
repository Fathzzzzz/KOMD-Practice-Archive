package com.mycompany.implementasi;

public class Main {
    public static void main(String[] args) {
        //Create a binary tree
        Implementasi bt = new Implementasi();
        bt.addNode(new Node(8));
        bt.addNode(new Node(3));
        bt.addNode(new Node(1));
        bt.addNode(new Node(6));
        bt.addNode(new Node(4));
        bt.addNode(new Node(7));
        bt.addNode(new Node(10));
        bt.addNode(new Node(14));
        bt.addNode(new Node(13));

        //Print a binary tree
        System.out.println("\nPREODER: Root - Left - Right");
        Implementasi.preorderPrint(bt.root);

        System.out.println("\nPOSTODER: Left - Right - Root");
        Implementasi.postorderPrint(bt.root);

        System.out.println("\nINODER: Left - Root - Right");
        Implementasi.inorderPrint(bt.root);

        System.out.println("");

        //Search an element in a binary tree
        System.out.println("\nSearch");
        System.out.println(Implementasi.searchValue(bt.root, 3));

        //Delete a node
        System.out.println("\nDelete 4");
        bt.deleteNode(4);

        //Print a binary tree
        System.out.println("\nPREODER: Root - Left - Right");
        Implementasi.preorderPrint(bt.root);

        System.out.println("\nPOSTODER: Left - Right - Root");
       Implementasi.postorderPrint(bt.root);

        System.out.println("\nINODER: Left - Root - Right");
        Implementasi.inorderPrint(bt.root);

        System.out.println("");
    }
}
