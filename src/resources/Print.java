package resources;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Print{
    public static boolean test = false;
//    public static boolean test = true;

    public static void testPrint(){
        test = true;
        int[] intarr = {1, 2, 3, 4};
        long[] longarr = {1L, 2L, 3L, 4L};
        boolean[] boolarr = {true, false};
        String[] strarr = {"1", "2", "three", "four"};
        Long[] Longarr = {1L, 2L, 3L, 4L};
        Print.print(intarr);
        Print.print(longarr);
        Print.print(boolarr);
        Print.print(strarr);
        Print.print(Longarr);

        int[][] intmatrix = {{1, 2, 3}, {4, 5, 6}};
        Long[][] Longmatrix = {{1L, 2L, 3L}, {4L, 5L, 6L}};
        String[][] strmatrix = {{"one", "two"}, {"three", "four"}};
        Print.print(intmatrix);
        Print.print(Longmatrix);
        Print.print(strmatrix);

        Print.print(1);
        Print.print(1L);
        Print.print(true);
        Print.print("string");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.setNext(n2);
        Node n3 = new Node(3);
        n2.setNext(n3);
        Print.print(n1);

        test = false;
    }

    private static void print(boolean @NotNull [] arr){
        if(test) System.out.println("boolean arr");
        for(boolean iter : arr){
            System.out.print(iter + " ");
        }
        System.out.println();
    }

    private static void print(long[] arr){
        if(test) System.out.println("long arr");
        for(long iter : arr){
            System.out.print(iter + " ");
        }
        System.out.println();
    }

    public static <T> void print(T @NotNull [] arr){
        if(test) System.out.println("T arr");
        for(T iter : arr){
            System.out.print(iter + " ");
        }
        System.out.println();
    }

    public static void print(int[] arr){
        if(test) System.out.println("int arr");
        if(arr == null || arr.length == 0){
            System.out.println("Is empty");
        }else{
            for(int iter : arr){
                System.out.print(iter + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[] arr){
        if(test) System.out.println("double arr");
        if(arr == null || arr.length == 0){
            System.out.println("Is empty");
        }else{
            for(double iter : arr){
                System.out.print(iter + " ");
            }
            System.out.println();
        }
    }

    public static void print(boolean bool){
        if(test) System.out.println("boolean");
        System.out.println(bool);
    }

    public static void print(long num){
        if(test) System.out.println("long");
        System.out.println(num);
    }

    public static void print(int num){
        if(test) System.out.println("int");
        System.out.println(num);
    }

    public static <T> void print(T var){
        if(test) System.out.println("T");
        if(var instanceof short[]){
            print((short[])var);
        }else if(var instanceof int[]){
            print((int[])var);
        }else if(var instanceof long[]){
            print((long[])var);
        }else if(var instanceof float[]){
            print((float[])var);
        }else if(var instanceof double[]){
            print((double[])var);
        }else if(var instanceof char[]){
            print((char[])var);
        }else if(var instanceof String[]){
            print((String[])var);
        }else if(var instanceof boolean[]){
            print((boolean[])var);
        }else{
            System.out.println(var);
        }
    }

    public static <T> void print(List<T> list){
        if(test) System.out.println("List<T>");
        if(list == null || list.isEmpty()){
            System.out.println("Is empty");
        }else{
            for(T iter : list){
                System.out.print(iter + " ");
            }
            System.out.println();
        }
    }

    public static void printNodeLinkedList(Node root){
        if(root == null){
            System.out.println("Is empty.");
        }
        assert root != null;
        if(root.getRight() != null){
            while(root != null){
                System.out.print(root.getData() + " ");
                root = root.getRight();
            }
            System.out.println();
        }else{
            while(root != null){
                System.out.print(root.getData() + " ");
                root = root.getNext();
            }
            System.out.println();
        }
    }

    public static void printInOrder(Node node){
        printInOrderHelper(node);
        System.out.println();
    }

    private static void printInOrderHelper(Node node){
        if(node != null){
            printInOrderHelper(node.getPrev());
            System.out.print(node.getData() + " ");
            printInOrderHelper(node.getNext());
        }
    }

    public static void printPreOrderHelper(Node node){
        if(node != null){
            System.out.print(node.getData() + " ");
            printPreOrderHelper(node.getPrev());
            printPreOrderHelper(node.getNext());
        }
    }

    public static void printPostOrderHelper(Node node){
        if(node != null){
            printPostOrderHelper(node.getPrev());
            printPostOrderHelper(node.getNext());
            System.out.print(node.getData() + " ");
        }
    }


    public static void printCircular(Node n){
        if(n == null){
            System.out.println("Is Empty");
        }else{
            System.out.print(n.getData());
            Node trav = n.getNext();
            while(trav != n){
                System.out.print(" " + trav.getData());
                trav = trav.getNext();
            }
            System.out.println();
        }
    }

    public static void printPreOrder(Node root){
        printPreOrderHelper(root);
        System.out.println();
    }

    public static void printPostOrder(Node root){
        printPostOrderHelper(root);
        System.out.println();
    }

    public static void printLevelOrder(Node root){
        printLevelOrderHelper(root);
        System.out.println();
    }

    private static void printLevelOrderHelper(Node root){
        if(root == null){
            System.out.println("Empty tree");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.print("N ");
            }else{
                System.out.print(curr.getData() + " ");
                q.add(curr.getLeft());
                q.add(curr.getRight());
            }
        }
    }

    public static void printBinaryTree(Node root){
        printLevelOrder(root);
    }


    public static void printRandomTree(Tree root){
        if(root == null){
            System.out.println("Is empty.");
        }else{
            Queue<Tree> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Tree curr = q.remove();
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                    System.out.print(curr.left.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.right != null){
                    q.add(curr.right);
                    System.out.print(curr.right.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.random != null){
                    System.out.print(curr.random.data);
                }else{
                    System.out.print("N ");
                }
                System.out.println();
            }
        }
    }

    public static <T> void print(T[] arr, boolean newLine){
        if(newLine){
            for(T iter : arr){
                System.out.println(iter.toString());
            }
        }else{
            for(T iter : arr){
                System.out.print(iter.toString() + " ");
            }
        }
        System.out.println();
    }

    public static void print(int[] @NotNull [] matrix){
        if(test) System.out.println("int matrix");
        for(int[] outer : matrix){
            for(int in : outer){
                System.out.print(in + " ");
            }
            System.out.println();
        }
    }

    public static <T> void print(T[] @NotNull [] matrix){
        if(test) System.out.println("T matrix");
        for(T[] outer : matrix){
            for(T in : outer){
                System.out.print(in + " ");
            }
            System.out.println();
        }
    }

    public static <T> void print(@NotNull Set<T> set){
        if(test) System.out.println("Set<T>");
        for(T iter : set){
            System.out.print(iter + " ");
        }
        System.out.println();
    }
}
