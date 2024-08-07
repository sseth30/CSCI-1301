# `DrawingShapes.java` Program

>[!IMPORTANT]
The `DrawingShapes.java` Java program is designed to allow users to draw various shapes based on user input. The shapes include rectangles, triangles, hexagons, octagons, and pentagons. This lab focuses on utilizing loops, nested loops, decision statements, and user input to draw the specified shapes.

## Example 1 (rectangle) 

- Enter a shape: r t h o p
- `r`
- Enter a length
- `3`
- Enter a height
- `4`
- Below is a 3 by 4 rectangle of *
```java
***
***
***
***
```
## Example 2 (triangle)

- Enter a shape: r t h o p
- `t`
- Enter a length
- `6`
- Below is a triangle with two side lengths of 6 *
```java
     *
    ***
   *****
  *******
 *********
***********
```
## Example 3 (hexagon)

- Enter a shape: r t h o p
- `h`
- Enter a length
- `10`
- Below is a hexagon with side lengths of 10 *
```java
         **********
        ************
       **************
      ****************
     ******************
    ********************
   **********************
  ************************
 **************************
****************************
 **************************
  ************************
   **********************
    ********************
     ******************
      ****************
       **************
        ************
         **********
```
## Example 4 (octagon)

- Enter a shape: r t h o p
- `o`
- Enter a length
- `9`
- Below is an octagon with side lengths of 9 *
```java
        *********
       ***********
      *************
     ***************
    *****************
   *******************
  *********************
 ***********************
*************************
*************************
*************************
*************************
*************************
*************************
*************************
*************************
*************************
 ***********************
  *********************
   *******************
    *****************
     ***************
      *************
       ***********
        *********
```
## Example 5 (invalid shape) 

- Enter a shape: r t h o p
- `R`
```java
Invalid shape
Goodbye!
```
> [!WARNING]
> Shape must be valid based on the choices given.
## Example 6 (invalid length) 

- Enter a shape: r t h o p
- `r`
- Enter a length
- `1`
```java
Length must be greater than 1
Goodbye!
```
> [!WARNING]
> Length must be greater than 1.
## Example 7 (invalid height) 

- Enter a shape: r t h o p
- `r`
- Enter a length
- `2`
- Enter a height
- `1`
```java
Height must be greater than 1
Goodbye!
```
> [!WARNING]
> Height must be greater than 1.
