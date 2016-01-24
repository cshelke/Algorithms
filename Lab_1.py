__author__ = 'Cyril Shelke'

# First algorithm: find out the minimum value among a bunch of numbers:

def findmin(A):
    min = 1000
    for num in A:
        if num < min:
            min = num
    print min


A = [4,6,10,2,19,33,-100]
findmin(A)
