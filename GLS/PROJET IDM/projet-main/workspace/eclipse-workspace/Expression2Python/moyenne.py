
import math

def calc_addition(a, b):
    return a + b

def calc_multiplication(a, b):
    return a * b

def calc_soustraction(a, b):
    return a - b

def calc_division(a, b):
    return a / b

def calc_inverse(a):
    return 1/a

def calc_oppose(a):
    return -a

def calc_minimum(a,b):
    if a < b:
        return a
    else:
        return b

def calc_maximum(a,b):
    if a > b:
        return a
    else:
        return b

def calc_sqrt(a):
    return math.sqrt(a)

def calcul(val_min ,val_max ):
    return calc_division(calc_addition(val_min,val_max),2.0)
     

