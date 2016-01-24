__author__ = 'Cyril Shelke'

def Merge(A,begin,mid,end):
    low = begin
    begin1 = begin
    end1 = mid
    begin2 = mid+1
    end2 = end
    temp = []
    i=0
    while begin1<= end1 and begin2<= end2:
        if A[begin1] < A[begin2]:
            temp.append(A[begin1])
            begin1+=1
        else:
            temp.append(A[begin2])
            begin2+=1
        i+=1
    if begin1<=end1:
        for j in range(begin1,end1+1):
            temp.append(A[j])
            i+=1
    elif begin2<=end2:
        for j in range(begin2,end2+1):
            temp.append(A[j])
            i+=1
    for item in temp:
        A[low] = item
        low+=1

def MergeSort(A,begin, end):
    mid = 0
    if begin<end:
        mid = (begin +  end)/2
        MergeSort(A,begin,mid)
        MergeSort(A,mid+1,end)
        Merge(A,begin,mid,end)
    print A

def InsertionSort(A):
    i=0
    if len(A)<=1:
        return
    for i in range(1,len(A)):
        hold = A[i]
        j = i
        while j>0 and A[j]<A[j-1]:
            A[j] = A[j-1]
            j-=1
        A[j] = hold
    print A

def BubbleSort(A):
    for i in range(0,len(A)):
        j = i
        while j<len(A)-1-i:
            if A[j]>A[j+1]:
                temp = A[j]
                A[j] = A[j+1]
                A[j+1]= temp
            j+=1
    print A



A = [2,1,45,45,22,75,39]

MergeSort(A,0, len(A)-1)
# InsertionSort(A)
# BubbleSort(A)