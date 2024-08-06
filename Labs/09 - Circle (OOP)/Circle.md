# `Circle.java` Program

>[!IMPORTANT]
The `Circle.java` Java program is designed to represent a circle with various methods to manipulate and obtain information about the circle. It is part of Lab 09, which focuses on classes and methods, fundamental concepts of Object-Oriented Programming (OOP).

## Program Description

The program defines a `Circle` class with private instance variables, accessor and mutator methods, and methods to compute properties such as area, perimeter, and diameter. Additional methods check if the circle is a unit circle, compare circles, and determine if circles intersect.

## Key Features

- **Instance Variables**: `name`, `x`, `y`, and `radius`.
- **Accessor Methods**: `getName`, `getX`, `getY`, `getRadius`.
- **Mutator Methods**: `setName`, `setX`, `setY`, `setRadius`.
- **Other Methods**: `toString`, `area`, `perimeter`, `diameter`, `isUnitCircle`, `equals`, `distance`, `isSmaller`, `compareTo`, `intersects`.

## Example with a 100% pass rate

### CircleMethodCheck.java -

```java
Circle instance variables:
String name:	passed
~~~~~~~~~~~~~~~~~~~~~~
double radius:	passed
~~~~~~~~~~~~~~~~~~~~~~
double x:	passed
~~~~~~~~~~~~~~~~~~~~~~
double y:	passed
~~~~~~~~~~~~~~~~~~~~~~
setX:		passed

----------------------
setName:	passed

----------------------
setY:		passed

----------------------
setRadius:	passed

----------------------
getX:		passed

----------------------
getName:	passed

----------------------
getY:		passed

----------------------
getRadius:	passed

----------------------
diameter:	passed

----------------------
area:		passed

----------------------
perimeter:	passed

----------------------
isUnitCircle:	passed

----------------------
toString:	passed

----------------------
intersects:	passed

----------------------
equals:		passed

----------------------
compareTo:	passed

----------------------
isSmaller:	passed

----------------------
distance:	passed

----------------------
```
Since `CircleMethodCheck.java` has passed all of the instance variables and getter/setter methods, it is acceptable to test using `CircleTester.java`:

### CircleTester.java (example) -

```java
circle1=Circle@7ad041f3
circle2=Circle@7344699f
PASSED: Set Radius
name: Circle 1
center: (-3.0, 4.0)
radius: 2.0
name: Circle 2
center: (2.0, 1.0)
radius: 5.3
circle1 diameter, area, and perimeter:
diameter: 4.0
area: 12.566370614359172
perimeter: 12.566370614359172
circle2 diameter, area, and perimeter:
diameter: 10.6
area: 88.24733763933729
perimeter: 33.3008821280518
is circle1 a unit circle?: false
is circle2 a unit circle?: false

Additional Tests:
circle1 equals circle2: false
circle2 equals circle1: false

Distance between circle1 and circle2: 5.830951894845301
Distance between circle2 and circle1: 5.830951894845301
Both circles are exactly the same length away.

Is circle1 smaller than circle2? true
Is circle2 smaller than circle1? false

Comparing circle1 to circle2: -1
Comparing circle2 to circle1: 1

Does circle1 intersect circle2? true
Does circle2 intersect circle1? true

```
