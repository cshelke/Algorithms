__author__ = 'Cyril Shelke'
# Lab 4

def swap(i,j):
    temp = A[i]
    A[i] = A[j]
    A[j] = temp

def partition(A,p,r):
    pivot = A[r]
    i = p-1
    for j in range(p,r):
        if A[j]<= pivot:
            i+=1
            swap(i,j)
    swap(i+1,r)
    return i+1

def quicksort(A,p,r):
    if p<r:
        q = partition(A,p,r)
        quicksort(A,p,q-1)
        quicksort(A,q+1,r)


A = [5,1,3,4,-15,0,4,22,8]
quicksort(A,0,len(A)-1)
print A