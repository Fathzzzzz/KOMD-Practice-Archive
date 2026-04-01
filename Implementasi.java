package com.mycompany.implementasi;

public class Implementasi {
    public Node root;               //ref to root node on tree
    
    public void addNode(Node node){ //method to add a node on the tree
        if(root == null){           //if the root is empty
            root = node;            //set node as the root of the tree
        }
        else{                       //if the root is not empty
            insertNode(root, node); //insert a node on the tree
        }                           //using function insertNode
    }
    
    public void insertNode(Node parent, Node node){ //method to insert a node on the tree
        if(parent.getValue() > node.getValue()){    //if the value of parent > node
            if(parent.leftChild == null){           //if the leftChild of parent is null
                parent.leftChild = node;            //set node as the leftChild of parent node
            }
            else{                                   //if the leftChild of parent is not null
                insertNode(parent.leftChild, node); //call function insertNode to
            }                                       //insert a node as a child of the leftChild of parent node
        }
        else{                                       //if the value of parent <= node
            if(parent.rightChild == null){          //if the rightChild of parent is null
                parent.rightChild = node;           //set node as the rightChild of parent node
            }
            else{                                   //if the rightChild of parent is not null
                insertNode(parent.rightChild, node);//call function insertNode to
            }                                       //insert a node as a child of the rightChild of parent node
        }
    }
    
    int minValue(Node root){
    int minv = root.value;          // set the value of root tree as minv
    while (root.leftChild != null){ // repeat if the leftChild of root is not null
        minv = root.leftChild.value; // update minv as the value of leftChild of root
        root = root.leftChild;       // update root as the leftChild of root
    }
    return minv; // return the minimum value of the tree
}

public void deleteNode(int value){
    root = deleteFunc(root, value); // method to delete node of the tree based on value
}

public Node deleteFunc(Node root, int value){
    // function to delete node of the tree based on value
    if (root == null){
        return root; // if the tree is empty
    }

    // Otherwise, recur down the tree
    if (value < root.value){
        root.leftChild = deleteFunc(root.leftChild, value); // if value < root
    } else if (value > root.value){
        root.rightChild = deleteFunc(root.rightChild, value); // if value > root
    }

    // if value is same as root's value, then this is the node to be deleted
    else {
        // node with only one child or no child
        if (root.leftChild == null)
            return root.rightChild; // if leftChild is null
        else if (root.rightChild == null)
            return root.leftChild;  // if rightChild is null

        // node with two children
        // get the inorder successor (smallest in the right subtree)
        root.value = minValue(root.rightChild);

        // delete the inorder successor
        root.rightChild = deleteFunc(root.rightChild, root.value);
    }

    return root;
}
public static void preorderPrint(Node root){
    // method to print all elements in a binary tree in preorder process
    // The root node is printed first, then left subtree, and the last is right subtree
    if (root != null){
        System.out.print(root.value + " "); // print the value root node
        preorderPrint(root.leftChild);      // print the item in left subtree recursively
        preorderPrint(root.rightChild);     // print the item in right subtree recursively
    }
}

public static void postorderPrint(Node root){
    // method to print all elements in a binary tree in postorder process
    // The left subtree is printed first, then right subtree and the last is the root node
    if (root != null){
        postorderPrint(root.leftChild);     // print the item in left subtree recursively
        postorderPrint(root.rightChild);    // print the item in right subtree recursively
        System.out.print(root.value + " "); // print the value root node
    }
}

public static void inorderPrint(Node root){
    // method to print all elements in a binary tree in inorder process
    // The left subtree is printed first, then the root node, and the last is right subtree
    if (root != null){
        inorderPrint(root.leftChild);       // print the item in left subtree recursively
        System.out.print(root.value + " "); // print the item root
        inorderPrint(root.rightChild);      // print the item in right subtree recursively
    }
}

public static boolean searchValue(Node root, int value){
    // method to search value in binary tree
    if (root == null){
        return false; // if the tree is empty
    } else {
        if (root.getValue() == value){
            return true; // if the value of root = the value that we search
        } else {
            if (root.getValue() > value){
                return searchValue(root.leftChild, value);  // search in the leftChild
            } else {
                return searchValue(root.rightChild, value); // search in the rightChild
            }
        }
    }
}
}
