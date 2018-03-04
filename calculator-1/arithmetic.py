"""Math functions for calculator."""


def add(num1, num2):
    """Return the sum of the two inputs."""

    return num1 + num2


def subtract(num1, num2):
    """Return the second number subtracted from the first."""

    return num1 - num2


def multiply(num1, num2):
    """Multiply the two inputs together."""

    return num1 * num2


def divide(num1, num2):
    """Divide the first input by the second and return the result."""

    return num1 / num2

def square(num1):
    """Return the square of the input."""
    
    return power(num1, 2)

def cube(num1):
    """Return the cube of the input."""

    return power(num1, 3)

def power(num1, num2):
    """Raise num1 to the power of num2 and return the value."""

    return num1 ** num2

def mod(num1, num2):
    """Return the remainder of num1 / num2."""

    return num1 % num2

def add_mult(num1, num2, num3):
    """Takes 3 numbers adds the first 2 and multiplies the sum with the 3rd and returns the result."""

    return (num1 + num2) * num3

def add_cubes(num1, num2):
    """Takes two numbers and cubes each of them and adds the cubes together, and returns the result."""

    return cube(num1) + cube(num2)
    
def assign(var1, num1):
    """Assigns a number to a variable. and returns the value of the variable"""
   
    var1 = num1
    return var1
