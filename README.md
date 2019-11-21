# Matrix-Chain-Multiplication
To find the most efficient way to multiply a given sequence of matrices

When we are given some n number of matrices each with their own dimensions it is not very fast to do matrix multiplication. Matrix multiplication is very time consuming task which computers have to crunch to give different outcomes. They are everywhere in the scientific field, be it Machine Learning, Graphics generation, Approximations, Optimazations, Quantum Mechanics, etc. 

The problem is not to actually perform the multiplications but to decide in which order they should be multiplied to increase their efficiency. As they are associative there are many ways we can achieve that and their answers will be same.

Order matters:
- (AB)C = (10×30×5) + (10×5×60) = 1500 + 3000 = 4500 operations
- A(BC) = (30×5×60) + (10×30×60) = 9000 + 18000 = 27000 operations

This problem is solved by using dynamic programming by placing a set of paranthesis by dividing the problem into subproblems of smaller size and storing those small problems so we don't have to repeat them. Hence Dynamic Programming can be applied.

Run Main class of Q2 in src folder
	Takes an input from user for number of matrices 
	and then dimensions of each from 0 to n
