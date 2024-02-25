# `PayoffDebt.java` Example Prompts

> [!IMPORTANT]
This document outlines several interactions with `PayoffDebt.java`, a course grade calculator program.
> This program details specific scenarios students may face, including but not limited to: having all or some scores, achieving or not achieving the desired grade, figuring out the minimum score to get a projected grade, percentage weights not adding up, and entering invalid grades or inputs.

## Example 1: User Has All Scores

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `3`
- Quizzes: `7`
- Do you know your exam 1 score? `y`
- Score received on exam 1: `92`
- Do you know your exam 2 score? `YES`
- Score received on exam 2: `95`
- Do you know your final exam score? `YeS`
- Score received on final exam: `91`
- Do you know your lab average? `yEs`
- Average lab grade: `92`
- Do you know your project average? `YES`
- Average project grade: `85`
- Do you know your participation average? `YEs`
- Average participation grade: `100`
- Do you know your quiz average? `YeS`
- Average quiz grade: `85`
  >- Current grade score: _**90.75**_
  >- Your current letter grade: _**A**_
  >- _**Congratulations! You received the A that you wanted!**_

## Example 2: User Cannot Get The Desired Grade

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `3`
- Quizzes: `7`
- Do you know your exam 1 score? `YeS`
- Score received on exam 1: `32`
- Do you know your exam 2 score? `yES`
- Score received on exam 2: `48`
- Do you know your final exam score? `YES`
- Score received on final exam: `28`
- Do you know your lab average? `yes`
- Average lab grade: `28`
- Do you know your project average? `no`
- Do you know your participation average? `yes`
- Average participation grade: `0`
- Do you know your quiz average? `NO`
  >- Current grade score: _**33.15**_
  >- Your current letter grade: _**F**_
  >- _**Unfortunately, a grade of A is not possible.**_

## Example 3: User Knows All Scores And Does Not Obtain Desired Grade

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `3`
- Quizzes: `7`
- Do you know your exam 1 score? `yes`
- Score received on exam 1: `79`
- Do you know your exam 2 score? `yes`
- Score received on exam 2: `72`
- Do you know your final exam score? `y`
- Score received on final exam: `91`
- Do you know your lab average? `y`
- Average lab grade: `92`
- Do you know your project average? `yes`
- Average project grade: `87`
- Do you know your participation average? `yes`
- Average participation grade: `97`
- Do you know your quiz average? `y`
- Average quiz grade: `98`
  >- Current grade score: _**85.42**_
  >- Your current letter grade: _**B**_
  >- _**Unfortunately, a grade of A is not possible.**_

## Example 4: User Has Only Some Scores

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `B`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `3`
- Quizzes: `7`
- Do you know your exam 1 score? `nO`
- Do you know your lab average? `yes`
- Average lab grade: `50`
- Do you know your project average? `yeS`
- Average project grade: `80`
- Do you know your participation average? `YES`
- Average participation grade: `100`
- Do you know your quiz average? `no`
  >- Current grade score: _**69.74**_
  >- Your current letter grade: _**D**_
  >- In order to receive a grade of _**B,**_
  >- you need to score an average greater than
  >- or equal to _**86.29**_ in the rest of the grade items.

## Example 5: User Achieves The Grade They Want With Grades Remaining

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `20`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `10`
- Projects: `10`
- Participation: `10`
- Quizzes: `10`
- Do you know your exam 1 score? `y`
- Score received on exam 1: `100`
- Do you know your exam 2 score? `y`
- Score received on exam 2: `100`
- Do you know your final exam score? `Y`
- Score received on final exam: `100`
- Do you know your lab average? `y`
- Average lab grade: `100`
- Do you know your project average? `Y`
- Average project grade: `100`
- Do you know your participation average? `n`
- Do you know your quiz average? `N`
  >- Current grade score: _**100.00**_
  >- Your current letter grade: _**A**_
  >- _**You will receive at least a grade of D.**_
    
## Example 6: User Enters Answers Other Than Yes/No (defaults to no)

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `C`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `20`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `5`
- Quizzes: `5`
- Do you know your exam 1 score? `YeS`
- Score received on exam 1: `45`
- Do you know your exam 2 score? `nope`
- Do you know your lab average? `kinda`
- Do you know your project average? `Nah`
- Do you know your participation average? `no`
- Do you know your quiz average? `yes`
- Average quiz grade: `70`
  >- Current grade score: _**51.25**_
  >- Your current letter grade: _**F**_
  >- In order to receive a grade of _**C,**_
  >- you need to score an average greater than
  >- or equal to _**74.69**_ in the rest of the grade items.

## Example 7: Weights Don’t Add Up

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `A`
- **Enter percentage weights below.**
- Exam 1: `15`
- Exam 2: `15`
- Final Exam: `20`
- Labs: `15`
- Projects: `20`
- Participation: `3`
- Quizzes: `7`
  >- _**Weights don’t add up to 100%, program exiting...**_

> [!WARNING]
> Make sure that the weights of your assignments add up to 100%.

## Example 8: User Enters An Invalid Grade

- **Grading Scale:**
- A &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 90 - 100
- B &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 80 - 89
- C &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 70 - 79
- D &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 60 - 69
- F &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; below 60
- **What letter grade do you want to achieve for the course?** `Z`
  >- _**The input is invalid.**_

> [!WARNING]
> Make sure that you input a valid letter grade.
