__author__ = 'Cyril Shelke'
import random

global root

class Node:
    def __init__(self,value = 0,right=None,left=None):
        self.value = value
        self.right = right
        self.left = left
    # def rAssign(self,node):
    #     self.right = node

# class Tree:
#     def __init__(self,):
#         self

def insert(root,value):
    # global root
    tempNode = Node(value)
    if root == None:
        root = tempNode
    else:
        if (value>root.value):
            root.right = insert(root.right,value)
        else:
            root.left = insert(root.left,value)
    return root

def traverse(root):
    if root == None:
        return
    if root.left == None:
        pass
        # traverse(root.left)
    else:
        traverse(root.left)
    print root.value
    if root.right == None:
        pass
    else:
        traverse(root.right)




if __name__ == '__main__':
    global root
    root = None
    A = random.sample(range(40),5)
    print A

    # A = [3,1,2]
    for item in A:
        root =insert(root,item)
    traverse(root)