__author__ = 'Cyril Shelke'

def maxHeapify(end,i):
    global arr
    i+=1
    left = 2*i
    right = (2*i) + 1
    largest = i
    if left <= end:
        if arr[left-1] > arr[i-1]:
            largest = left
    else:
        largest = i
    if right<= end and arr[right-1] > arr[largest-1]:
        largest = right
    if largest != i:
        temp = arr[largest - 1]
        arr[largest - 1] = arr[i-1]
        arr[i-1] = temp
        maxHeapify(end,largest-1)


# def buildMaxHeap():
#     for i in reversed(range(0,len(arr)/2 )):
#         arr = maxHeapify(len(arr),i)
#     return arr

def heapsort():
    # buildMaxHeap()
    global arr
    fin = len(arr)
    for i in range(fin/2,-1,-1):
        maxHeapify(fin,i)
    end = len(arr)
    for i in range(fin,0,-1 ):
        temp = arr[i - 1]
        arr[i - 1] = arr[0]
        arr[0] = temp
        maxHeapify(i-1,0)
    print arr

# heapsort([9,12,6,13,25,4,15,7,1,3,19])
arr = [9,12,-6,13,25,4,15,7,1,3,19]
# arr = [12,9,14]
heapsort()
print arr


