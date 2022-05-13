package resources;

import java.util.*;

public class Create{
    static Tree createRandomTree(int[][] matrix){
        Map<Integer, Tree> m = new HashMap<>();
        System.out.println(matrix.length + " len ");
        for(int[] iter : matrix){
            int num = iter[0];
            if(!m.containsKey(num)){
                Tree t = new Tree(num, setTree(iter[1], m), setTree(iter[2], m), setTree(iter[3], m));
                m.put(num, t);
            }else{
                Tree t = m.get(num);
                t.right = (setTree(iter[1], m));
                t.left = (setTree(iter[2], m));
                t.setRandom(setTree(iter[3], m));
            }
        }

        return m.get(matrix[0][0]);
    }

    static Tree setTree(int data, Map<Integer, Tree> m){
        if(data == -1){
            return null;
        }
        if(m.containsKey(data)){
            return m.get(data);
        }
        Tree tree = new Tree(data);
        m.put(data, tree);
        return tree;
    }


    static Node createBinaryTree(int[] arr){
        if(arr.length < 1){
            return null;
        }
        return binaryTreeHelper(arr);
    }

    static Node binaryTreeHelper(int[] arr){
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        for(int i = 1;i < arr.length;i++){
            Node curr = q.remove();
            if(arr[i] == -1){
                curr.setLeft(null);
            }else{
                Node n = new Node(arr[i]);
                curr.setLeft(n);
                q.add(n);
            }
            i++;
            if(i < arr.length){
                if(arr[i] == -1){
                    curr.setRight(null);
                }else{
                    Node n = new Node(arr[i]);
                    curr.setRight(n);
                    q.add(n);
                }
            }
        }
        return root;
    }

    static void transformTree(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();

            if(curr.left != null){
                if(curr.left.data == -1){
                    curr.prev = curr.left = null;
                }else{
                    q.add(curr.left);
                }
            }
            if(curr.right != null){
                if(curr.right.data == -1){
                    curr.next = curr.right = null;
                }else{
                    q.add(curr.right);
                }
            }
        }
    }

    static Node createBST(int[] arr){
        if(arr.length < 1){
            return null;
        }
        Node root = new Node(arr[0]);
        for(int i = 1;i < arr.length;i++){
            bstAdd(root, arr[i]);
        }
        return root;
    }

    static void bstAdd(Node root, int num){
        if(root != null){
            if(root.data > num){
                if(root.prev != null){
                    bstAdd(root.prev, num);
                }else{
                    root.left = root.prev = new Node(num);
                }
            }else if(root.data < num){
                if(root.next != null){
                    bstAdd(root.next, num);
                }else{
                    root.right = root.next = new Node(num);
                }
            }
        }


    }

    static Node createNodeLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1;i < arr.length;i++){
            trav.left = trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        return head;
    }

    static Node createCircularLinkedList(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node trav = head;
        for(int i = 1;i < arr.length;i++){
            trav.right = trav.next = new Node(arr[i]);
            trav = trav.next;
        }
        trav.next = head;
        return head;
    }

    public static Stack<Integer> createStack(int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int iter : arr){
            s.push(iter);
        }
        return s;
    }

    public static ArrayList<ArrayList<Integer>> createArrayList(int[][] mat){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        for(int[] outer : mat){
            ArrayList<Integer> list = new ArrayList<>();
            for(int iter : outer){
                list.add(iter);
            }
            ret.add(list);
        }

        return ret;
    }
}
