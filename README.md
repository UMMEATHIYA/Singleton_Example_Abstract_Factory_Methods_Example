# Singleton and Abstract Factory Design Patterns in Java

This project demonstrates the implementation of two fundamental object-oriented design patterns in Java:

- **Singleton Pattern** (Eager and Lazy Initialization)
- **Abstract Factory Pattern** (Museum Exhibit Example)

## 🧠 Overview

### 1. Singleton Pattern

The Singleton pattern ensures that a class has only a fixed number of instances and provides a global point of access to them.

#### EagerSingleton.java
- Instantiates all 3 objects at class load time.
- Uses a static block to pre-create instances.

#### LazySingleton.java
- Creates instances only when requested (on demand).
- More memory-efficient if not all instances are needed.

### 2. Abstract Factory Pattern

The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

#### Use Case:
Simulates an exhibit creator for a **Natural History Museum**, where each factory produces a group of related artifacts:
- `DinosaurExhibitFactory`
- `JurassicExhibitFactory`
- `FossilExhibitFactory`

## 📁 Project Structure

```
Assignment3_Umme/
│
├── src/
│ └── main/
│ └── java/
│ └── org/
│ └── example/
│ ├── Assignment3Singleton.java
│ ├── EagerSingleton.java
│ ├── LazySingleton.java
│ ├── AbstractFactoryExample.java
│ ├── ExhibitFactory.java
│ ├── DinosaurExhibitFactory.java
│ ├── JurassicExhibitFactory.java
│ ├── FossilExhibitFactory.java
| ├── LandAnimal.java
| ├── SeaAnimal.java
| ├── SkyAnimal.java
| ├── NaturalHistoryMuseum.java
| ├── CenozoicAnimalFactory.java
| ├── LandAnimal.java
└── README.md
```


## 🚀 How to Run

Make sure you’re in the project root directory and run:

```bash
javac src/main/java/org/example/*.java
java -cp src/main/java org.example.Assignment3Singleton

