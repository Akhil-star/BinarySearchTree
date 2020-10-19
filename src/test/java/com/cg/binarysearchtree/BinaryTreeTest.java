package com.cg.binarysearchtree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void given3NumbersWhenaddedToBinaryTreeShouldReturnSizeThree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int size = binaryTree.getSize();
        Assert.assertEquals(3,size);

    }
    @Test
    public void givenNumberWhenSearchedInBinaryTreeShouldReturnTrue() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(63);
        Assert.assertTrue( binaryTree.search( 63 ) );
    }
}
