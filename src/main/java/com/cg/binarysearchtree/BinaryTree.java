package com.cg.binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {

    private BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root,key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current,K key){
        if(current == null){
            return new BinaryNode<>(key);
        }
        int compareResult = key.compareTo( current.key );
        if(compareResult == 0){
            return current;
        } if(compareResult < 0){
            current.left = addRecursively( current.left,key );
        }else {
            current.right = addRecursively( current.right,key );
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(BinaryNode<K> current){
        return current == null ? 0 : 1+this.getSizeRecursive( current.left )+this.getSizeRecursive( current.right );
    }

    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(BinaryNode current, K key) {

        if(key.compareTo( (K) current.key ) == 0){
            return true;
        }
        else if(key.compareTo( (K) current.key ) < 0){
            if(current.left==null)
                return false;
            else
                return searchRecursively(current.left, key);
        }
        else{
            if(current.right == null)
                return false;
            else
                return searchRecursively(current.right, key);
        }
    }
}
