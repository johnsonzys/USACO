class treeTest{

  static class Node{
    int value;
    Node left;
    Node right;

    Node (int value){
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree{
    Node root;

    //constructor
   BinaryTree (Node node){
      this.root = node;
    }

    Node addNode (Node current, int value){
      if(current==null){ //not there - new node
        return new Node(value);
      } // base case
      
      if(value<current.value){
        //left
        current.left = addNode(current.left, value);
      }
      else if(value > current.value){
        current.right = addNode(current.right, value);
      }
      else{
        return current;
      }
      return current;
    }
    Node deleteNode(Node current)
  }
  
  
  public static void main(String[] args){
    BinaryTree bt = new BinaryTree(new Node(2));
    bt.addNode(bt.root, 1);
  }
  
}