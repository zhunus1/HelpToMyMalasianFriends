from random import randint
def problem1():
    a1 = list()
    n = input("Please enter the value for N(positive integer):")
    print("Enter the numbers to an array: ")
    for i in range(int(n)):
        s=input("num:")
        a1.append(int(s))
    print("Your Array is",a1)
    print("Your N is",n)
    print("---------------------------------------------------")
    a2=list()
    m=input("Please enter your M (positive integer) value")
    k=input("Please enter your K (negative integer) value")
    rand=randint(0,int(m))
    for j in range(rand):
        a2.append(randint(int(k),0))
    print(str(a2))
    
    
        
