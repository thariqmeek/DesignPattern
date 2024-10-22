# DesignPattern
A Repository to explain Design patterns with Practical Implementation

## Table of Contents
- [Singleton Pattern](#singleton-pattern)

## Singleton Pattern

### What is Singleton Class
- Singleton means **one**, i.e., only **one instance** of the class can be created.

### Steps to create a Singleton Class:
1. In the `SingletonService` class, we create a **static instance object** (`obj`) for the class `Abc`.
2. The default constructor of the class is made **private**, so no additional objects can be created from outside the class.
3. A **static method** (`getInstance()`) is created that will return the single object (`obj`) of the class `Abc`.
