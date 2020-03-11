package Sorting;

import java.util.*;

class TrieSort {
    private Node rootNode;

    TrieSort(){rootNode = null;}
    int tempArrayIndex = 0;
    String[]tempArray;

    void insert(String key, int index) {
        if (rootNode == null) rootNode = new Node();
        Node currentNode = rootNode;
        for (int i = 0;i < key.length();i++)
        {
            char keyChar = key.charAt(i);
            if (currentNode.getChild(keyChar) == null) {
                currentNode.addChild(keyChar);
            }
            currentNode = currentNode.getChild(keyChar);
        }
        currentNode.addIndex(index);
    }

    String[] traversePreorder(String[] array) {
        tempArray = new String[array.length];

        traversePreorder(rootNode, array);
        return tempArray;
    }

    private void traversePreorder(Node node, String[] array) {
        if (node == null) return;
        if (node.getIndices().size() > 0)
        {
            for (int index : node.getIndices())
            {
                tempArray[tempArrayIndex++] = array[index];
            }
        }

        for (char index = 'a';index <= 'z';index++)
        {
            traversePreorder(node.getChild(index), array);
        }
    }

    private static class Node {
        private Node[] children;
        private List<Integer> indices;
        Node() {
            children = new Node[26];
            indices = new ArrayList<>(0);
        }
        Node getChild(char index) {
            if (index < 'a' || index > 'z') return null;
            return children[index - 'a'];
        }

        void addChild(char index) {
            if (index < 'a' || index > 'z') return;
            Node node = new Node();
            children[index - 'a'] = node;
        }

        List<Integer> getIndices()
        {
            return indices;
        }

        void addIndex(int index)
        {
            indices.add(index);
        }
    }
}

class SortStrings {

    public static String[] printInSortedOrder(String[] array) {
        TrieSort trie = new TrieSort();
        for (int i = 0;i < array.length;i++)
        {
            trie.insert(array[i], i);
        }
        return trie.traversePreorder(array);
    }
} 

