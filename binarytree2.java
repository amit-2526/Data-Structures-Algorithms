public class binarytree2{

  public node root;

  class node{
    int key;
    node left,right;


    public node(int item){
      item = key;
      left = right = null;
    }
  }

  public void createBinaryTree(){

    node first = new node(1);
    node second = new node(2);
    node third = new node(3);
    node fourth = new node(4);
    node fifth = new node(5);

    root = first;
    first.left = second;
    first.right = third;
    first.left.left = fourth;
    first.left.right = fifth;
  }

  public static void main(String[] args) {

    binarytree2 bt = new binarytree2();
    bt.createBinaryTree();
    System.out.println(bt);
  }
}