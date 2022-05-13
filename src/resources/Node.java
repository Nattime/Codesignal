package resources;

public class Node{
    public int data;
    public Node next, prev, left, right;

    public Node(){
    }

    public Node(int data){
        setData(data);
        next = prev = left = right = null;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node n){
        right = next = n;
    }

    public void setPrev(Node n){
        left = prev = n;
    }

    public void setLeft(Node n){
        setPrev(n);
    }

    public void setRight(Node n){
        setNext(n);
    }

    public int getData(){
        return data;
    }

    public Node getPrev(){
        if(left != null){
            return left;
        }
        return prev;
    }

    public Node getNext(){
        if(right != null){
            return right;
        }
        return next;
    }

    @Override
    public String toString(){
        return getData() + " ";
    }

    public Node getLeft(){
        return getPrev();
    }

    public Node getRight(){
        return getNext();
    }
}
