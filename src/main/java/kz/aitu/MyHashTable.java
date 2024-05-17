package kz.aitu;

public class MyHashTable<K, V> {
    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        private HashNode(K key, V value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString(){
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K,V>[] chainArray;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        capacity = 11; // Default capacity
        chainArray = new HashNode[capacity];
    }

    @SuppressWarnings("unchecked")
    public MyHashTable(int capacity) {
        this.capacity = capacity;
        chainArray = new HashNode[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int index = hash(key);
        if(chainArray[index] == null) {
            chainArray[index] = new HashNode<>(key, value);
        } else {
            // Handle collision by chaining (simple approach)
            HashNode<K, V> currentNode = chainArray[index];
            while(currentNode != null) {
                if(currentNode.key.equals(key)) {
                    currentNode.value = value;
                    return;
                }
                if(currentNode.next == null)
                    break;
                currentNode = currentNode.next;
            }
            currentNode.next = new HashNode<>(key, value);
        }
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        HashNode<K, V> currentNode = chainArray[index];
        while(currentNode != null) {
            if(currentNode.key.equals(key)) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        HashNode<K, V> currentNode = chainArray[index];
        HashNode<K, V> prevNode = null;
        while(currentNode != null) {
            if(currentNode.key.equals(key)) {
                if(prevNode == null) {
                    chainArray[index] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                return currentNode.value;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public boolean containsValue(V value) {
        for(int i = 0; i < capacity; i++) {
            HashNode<K, V> currentNode = chainArray[i];
            while(currentNode != null) {
                if(currentNode.value.equals(value)) {
                    return true;
                }
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public K getKey(V value) {
        for(int i = 0; i < capacity; i++) {
            HashNode<K, V> currentNode = chainArray[i];
            while(currentNode != null) {
                if(currentNode.value.equals(value)) {
                    return currentNode.key;
                }
                currentNode = currentNode.next;
            }
        }
        return null;
    }
}
