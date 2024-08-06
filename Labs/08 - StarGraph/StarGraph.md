# `StarGraph.java` Program

>[!IMPORTANT]
The `StarGraph.java` Java program is designed to create a graphical representation of a mathematical function. It prompts the user for input to generate and display values of **y = 20.0 * |sin x|** for a range of **x** values, visualized using a star graph.

## Program Description

The program starts by asking the user to enter the number of **x** values to process, a minimum **x** value, and the increment for **x**. It then calculates the **y** values based on the mathematical function **y = 20.0 * |sin x|**. The **x** and **y** values are displayed, and the **y** values are visualized using a star graph, with each value represented by a corresponding number of stars.

## Key Features

- **Mathematical Function Calculation:** Computes values based on the function **y = 20.0 * |sin x|**.
- **User Interaction:** Prompts for user input to determine the range and increment of **x** values.
- **Graphical Representation:** Visualizes the computed **y** values using a star graph, enhancing user understanding of the function's behavior.

## Examples -

>[!NOTE]
The program prompts the user for the number of **x** values, the minimum **x** value, and the increment for **x**. These prompts are shown during the program execution but are omitted here for clarity.

### Example 1 -

- **Enter the number of x values to process:** `10`
- **Enter a minimum value for x:** `0`
- **Enter the amount to increment x:** `0.25`

>- **Values**
>
>```
>x: 0.000, y: 0.000
>x: 0.250, y: 4.948
>x: 0.500, y: 9.589
>x: 0.750, y: 13.633
>x: 1.000, y: 16.829
>x: 1.250, y: 18.980
>x: 1.500, y: 19.950
>x: 1.750, y: 19.680
>x: 2.000, y: 18.186
>x: 2.250, y: 15.561
>```

>- **Graph**
>
>```
>:
>:****
>:********
>:*************
>:****************
>:*********************
>:***********************
>:********************
>:*****************
>:**************
>```

### Example 2 -

- **Enter the number of x values to process:** `10`
- **Enter a minimum value for x:** `0`
- **Enter the amount to increment x:** `0.31415926535`

>- **Values**
>
>```
>x: 0.000, y: 0.000
>x: 0.314, y: 6.180
>x: 0.628, y: 11.756
>x: 0.942, y: 16.180
>x: 1.257, y: 19.021
>x: 1.571, y: 20.000
>x: 1.885, y: 19.021
>x: 2.199, y: 16.180
>x: 2.513, y: 11.756
>x: 2.827, y: 6.180
>```

>- **Graph**
>
>```
>:
>:******
>:***********
>:***************
>:*******************
>:********************
>:*******************
>:***************
>:***********
>:******
>```

### Example 3 -

- **Enter the number of x values to process:** `5`
- **Enter a minimum value for x:** `0`
- **Enter the amount to increment x:** `3.14159265359`

>- **Values**
>
>```
>x: 0.000, y: 0.000
>x: 3.142, y: 0.000
>x: 6.283, y: 0.000
>x: 9.425, y: 0.000
>x: 12.566, y: 0.000
>```

>- **Graph**
>
>```
>:
>:
>:
>:
>:
>```

### Example 4 -

- **Enter the number of x values to process:** `9`
- **Enter a minimum value for x:** `-1.5707963267`
- **Enter the amount to increment x:** `0.78539816339`

>- **Values**
>
>```
>x: -1.571, y: 20.000
>x: -0.785, y: 14.142
>x: 0.000, y: 0.000
>x: 0.785, y: 14.142
>x: 1.571, y: 20.000
>x: 2.356, y: 14.142
>x: 3.142, y: 0.000
>x: 3.927, y: 14.142
>x: 4.712, y: 20.000
>```

>- **Graph**
>
>```
>:********************
>:**************
>:
>:**************
>:********************
>:**************
>:
>:**************
>:********************
>```
