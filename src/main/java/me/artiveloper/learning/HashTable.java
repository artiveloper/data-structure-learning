package me.artiveloper.learning;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<Node> [] data;

    public HashTable(int size) {
        this.data = new LinkedList[size];
    }

    private int getHashCode(String key) {
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    private int convertToIndex(int hashcode) {
        return hashcode % data.length;
    }

    private Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) return null;
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node;
            }
        }
        return null;
    }

    public void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.value(value);
        }
    }

    public String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.value();
    }

    class Node {
        String key;
        String value;

        private Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        private String value() {
            return value;
        }

        private void value(String value) {
            this.value = value;
        }
    }

}