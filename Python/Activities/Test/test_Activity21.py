#Create a new test file and write test to validate the following cases:
#Sum of two numbers
#Difference of two numbers
#Product of two numbers
#Quotient of two numbers

from ast import Assert
import pytest

def test_addition() :
    num1 = 40
    num2 = 20
    sum = num1+num2

    assert sum == 60

def test_substraction() :
    num1 = 30
    num2 = 15

    substr = num1-num2
    assert substr == 15

def test_multiplication():
  
	num1 = 5
	num2 = 20
    
	prod = num1 * num2
	assert prod == 100

def test_division():
  
	num1 = 100
	num2 = 5
    
	quot = num1 / num2
 
	assert quot == 20