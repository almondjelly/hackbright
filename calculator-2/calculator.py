"""A prefix-notation calculator.

Using the arithmetic.py file from Calculator Part 1, create the
calculator program yourself in this file.
"""

from arithmetic import *


# Your code goes here
def calculate():
    calc_input = raw_input("> ")
    tokens = calc_input.split(" ")
    operator = tokens[0]

    if len(tokens) > 1:
        num1 = float(tokens[1])
    
    if len(tokens) > 2:
        num2 = float(tokens[2])

    if operator == "q":
        return ""
    elif operator == "+":
        return add(num1, num2)
    elif operator == "-":
        return subtract(num1, num2)
    elif operator == "*":
        return multiply(num1, num2)
    elif operator == "/":
        return divide(num1, num2)
    elif operator == "square":
        return square(num1)
    elif operator == "cube":
        return cube(num1)
    elif operator == "pow":
        return power(num1, num2)
    elif operator == "mod":
        return mod(num1, num2)


print calculate()
