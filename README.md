# ADS3

This repository contains implementations of various data structures in Java, including a Binary Search Tree (BST) and a Hash Table.

## Table of Contents

- [BinarySearchTree](#binarysearchtree)
  - [Methods](#methods)
- [MyHashTable](#myhashtable)
  - [Methods](#methods-1)
- [MyTestingClass](#mytestingclass)
- [Unit Tests](#unit-tests)
- [How to Run](#how-to-run)
- [License](#license)


## BinarySearchTree

`BinarySearchTree` is a generic implementation of a binary search tree.

### Methods

- **put(K key, V val)**: Inserts a key-value pair into the BST.
- **get(K key)**: Retrieves the value associated with the given key.
- **delete(K key)**: Deletes the node with the specified key.
- **iterator()**: Returns an iterator over the key-value pairs in the BST.
- **size()**: Returns the number of elements in the BST.

## MyHashTable

`MyHashTable` is a generic implementation of a hash table using chaining for collision resolution.

### Methods

- **put(K key, V value)**: Inserts a key-value pair into the hash table.
- **get(K key)**: Retrieves the value associated with the given key.
- **remove(K key)**: Removes the key-value pair associated with the given key.
- **containsValue(V value)**: Checks if the hash table contains the given value.
- **getKey(V value)**: Retrieves the key associated with the given value.

## MyTestingClass

`MyTestingClass` is a custom class with hash code methods.

### Methods

- **customHashCode()**: Generates a custom hash code.
- **customImprovedHashCode()**: Generates an improved custom hash code using bit manipulation.

## Unit Tests

Unit tests for `MyHashTable` are provided using JUnit 5.
