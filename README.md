# Video Challenge 🎬 (Java OOP)

A Java exercise that models a simple video platform, built to practise the main ideas of object-oriented programming (OOP). Viewers can watch videos, and every view updates the video's view count, the viewer's watch count and the video's rating.

## About the Project

This project was part of an online Java course. It was a challenge exercise to bring together everything learned about OOP: classes, inheritance, abstract classes, interfaces, encapsulation and method overloading.

## Class Structure

| Class | Type | Description |
|---|---|---|
| `Person` | Abstract class | Shared attributes for people: name, age, gender and experience |
| `Gafanhoto` | Class (extends `Person`) | A viewer, with a login and a total number of videos watched |
| `VideoActions` | Interface | Defines `play()`, `pause()` and `like()` |
| `Video` | Class (implements `VideoActions`) | A video with a title, rating, views, likes and play status |
| `Visualisation` | Class | Links a viewer to a video. Each new view adds to both counters and allows the video to be rated |
| `Main` | Class | Creates sample videos, viewers and views and prints the results |

## OOP Concepts Practised

- **Encapsulation:** private and protected attributes with getters and setters
- **Inheritance:** `Gafanhoto` extends the abstract class `Person`
- **Abstraction:** `Person` is abstract and can't be instantiated
- **Interfaces:** `Video` implements the `VideoActions` interface
- **Polymorphism and overloading:** `review()`, `review(int score)` and `review(double perc)` rate a video in different ways
- **Overriding:** custom `toString()` methods
- **Aggregation:** `Visualisation` combines a `Gafanhoto` and a `Video`

## How to Run

Make sure the [Java JDK](https://www.oracle.com/java/technologies/downloads/) is installed, then run:

git clone https://github.com/jt1324/VideoChallenge.git
cd VideoChallenge
javac *.java
java Main

## Technologies

- Java
