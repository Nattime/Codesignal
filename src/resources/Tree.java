package resources;

public class Tree extends Node{
    public Tree random, left, right;

    public Tree(int data){
        super(data);
    }

    public Tree(int data, Tree l, Tree r){
        this.data = data;
        left = l;
        right = r;
    }

    public Tree(int data, Tree l, Tree r, Tree random){
        this.data = data;
        left = l;
        right = r;
        this.random = random;
    }

    public Tree(int data, int l, int r){
        this.data = data;
        left = new Tree(l);
        right = new Tree(r);
    }

    void setRandom(Tree tree){
        random = tree;
    }
}
