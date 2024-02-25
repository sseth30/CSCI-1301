# PayoffDebt.java Example Prompts

> [!IMPORTANT]
This document outlines several examples of interactions with a course grade calculator program, detailing scenarios such as weights not adding up, having all or only some scores, entering invalid grades, and achieving or not achieving the desired grade.

## Example 1: Weights Don’t Add Up

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `15%`
- Exam 2: `15%`
- Final Exam: `20%`
- Labs: `15%`
- Projects: `20%`
- Participation: `3%`
- Quizzes: `7%`
  - _**`Weights don’t add up to 100%, program exiting...`**_

> [!WARNING]
> Make sure that the weights of your assignments add up to 100%!

## Example 2: User Has All Scores

- **Grading Scale:** Same as above
- **Desired Grade:** A
- **Input Weights and Scores:**
  - Exam 1: 15% (Score: 92)
  - Exam 2: 20% (Score: 95)
  - Final Exam: 20% (Score: 91)
  - Labs: 15% (Average: 92)
  - Projects: 20% (Average: 85)
  - Participation: 3% (Average: 100)
  - Quizzes: 7% (Average: 85)
- **Outcome:** Current grade score: 90.75, Letter Grade: A. Congratulations message.

## Example 3: User Has Only Some Scores

- **Grading Scale:** Same as above
- **Desired Grade:** B
- **Input Weights and Known Scores:**
  - Exam 1: 15% (No score)
  - Labs: 15% (Average: 50)
  - Projects: 20% (Average: 80)
  - Participation: 3% (Average: 100)
  - Quizzes: 7% (No score)
- **Outcome:** Current grade score: 69.74, Letter Grade: D. Advice on achieving a B.

## Example 4: User Cannot Get The Desired Grade

- **Grading Scale:** Same as above
- **Desired Grade:** A
- **Input Weights and Scores:**
  - Exam 1: 15% (Score: 32)
  - Exam 2: 20% (Score: 48)
  - Final Exam: 20% (Score: 28)
  - Labs: 15% (Average: 28)
  - Participation: 3% (Average: 0)
  - Quizzes: 7% (No score)
- **Outcome:** Current grade score: 33.15, Letter Grade: F. A grade of A is not possible.

## Example 5: User Enters Answers Other Than Yes/No

- **Grading Scale:** Same as above
- **Desired Grade:** C
- **Input Weights and Some Scores:**
  - Exam 1: 15% (Score: 45)
  - Lab: 15% (No specific score, treated as no)
  - Projects: 20% (No score, treated as no)
  - Participation: 5% (No score, treated as no)
  - Quizzes: 5% (Average: 70)
- **Outcome:** Current grade score: 51.25, Letter Grade: F. Advice on achieving a C.

## Example 6: User Enters An Invalid Grade

- **Grading Scale:** Same as above
- **Desired Grade:** Z (Invalid)
- **Outcome:** The input is invalid.

## Example 7: User Achieves The Grade They Want With Grades Remaining

- **Desired Grade:** D
- **Input Weights and Scores:**
  - Exam 1: 20% (Score: 100)
  - Exam 2: 20% (Score: 100)
  - Final Exam: 20% (Score: 100)
  - Labs: 10% (Average: 100)
  - Projects: 10% (Average: 100)
  - Participation: 10% (No score)
  - Quizzes: 10% (No score)
- **Outcome:** Current grade score: 100.00, Letter Grade: A. Assurance of at least a D grade.

## Example 8: User Knows All Scores And Does Not Obtain Desired Grade

- **Desired Grade:** A
- **Input Weights and Scores:**
  - Exam 1: 15% (Score: 79)
  - Exam 2: 20% (Score: 72)
  - Final Exam: 20% (Score: 91)
  - Labs: 15% (Average: 92)
  - Projects: 20% (Average: 87)
  - Participation: 3% (Average: 97)
  - Quizzes: 7% (Average: 98)
- **Outcome:** Current grade score: 85.42, Letter Grade: B. A grade of A is not possible.

_Note: It is essential to thoroughly test your program with various input values to ensure correctness. The above examples do not cover all possible error scenarios._
