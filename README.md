# Solution-Homework-3
Dungeon Builder and Prototype

I created this project to explore the Builder and Prototype design patterns in Java. The project includes different ways to build and clone objects in a game-like environment.

Project Structure

MUDGame/
│── src/
│   ├── builder/
│   │   ├── Dungeon.java
│   │   ├── IDungeonBuilder.java
│   │   ├── SimpleDungeonBuilder.java
│   ├── demo/
│   │   ├── MUDBuilderDemo.java
│   │   ├── MUDCombinedDemo.java
│   │   ├── MUDPrototypeDemo.java
│   ├── prototype/
│   │   ├── CloneableGameEntity.java
│   │   ├── NPC.java
│   │   ├── Room.java
│── README.md

Features

1. Builder Pattern

Implemented IDungeonBuilder to define how to construct a Dungeon.

Created SimpleDungeonBuilder to allow step-by-step configuration.

The Dungeon class includes:

Name

List of rooms

List of NPCs (including boss monsters).

A demo (MUDBuilderDemo.java) showcases how to build a dungeon using this pattern.

2. Prototype Pattern

Implemented CloneableGameEntity for cloning objects.

Updated Room and NPC classes with cloneEntity() to create copies.

A demo (MUDPrototypeDemo.java) demonstrates cloning entities and modifying them independently.

3. Combining Builder and Prototype

Used the Builder pattern to construct a Dungeon.

Added Prototype functionality to clone rooms easily.

A demo (MUDCombinedDemo.java) shows how to create a dungeon and add cloned rooms dynamically.

How to Run

Compile all Java files.

Run MUDBuilderDemo.java to see the Builder pattern in action.

Run MUDPrototypeDemo.java to test object cloning.

Run MUDCombinedDemo.java to see both patterns working together.

Additional Features

Added optional features like traps, treasure rooms, and secret passages.

Implemented deep cloning for complex objects.

This project helped me practice and understand advanced object creation techniques in Java.

