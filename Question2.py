import time
from random import randint
def problem1(x,y):
    #Maxats algorithm is:
    if x>y:
        s=y
    else:
        s=x
    for i in range(1,s+1):
        if x%i==0 and y%i==0:
            best=i
    return best
    #running time is 2(a+b) or 4*10^N n(digit numbers)
def problem11(x,y):
    #Aidana's algorithm is:
    while(y):
        x,y=y,x%y
    return x
    #this algorithm is more efficient
    #The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. 
    #running time is log(a*b) or log(10^N*10^N) cause the number of steps can be linear.
#def problem2():
    #Max:n=10 4*10^10=400 000 => 400 000/10^12=0.000004seconds
    #Aidana:n=10 log(10^10*10^10)=10 => 20/10^9=0,00000002seconds FIRST
    #Max:n=50 4*10^50=4.e+50 => 4.e+50/10^12=4.e+38seconds
    #Aidana:n=50 log(10^50*10^50)=100 => 100/10^9=0,0000001seconds FIRST
    #Max:n=100 4*10^100=4.e+100 => 4.e+100/10^12=4.e+88seconds
    #Aidana:n=100 log(10^100*10^100)=200 =>200/10^9=0.0000002seconds FIRST
def problem3():
    start=time.time()
    s=problem1(10000000,80000000)
    print(s)
    print("%s seconds"%(time.time()-start))
    s=problem1(120000000,840000000)
    print(s)
    print("%s seconds"%(time.time()-start))
    s=problem1(1000000000,44000000000)
    print(s)
    print("%s seconds"%(time.time()-start))
    s=problem1(10000000000,84400000000)
    print(s)
    print("%s seconds"%(time.time()-start))
    s=problem1(100000000000,844000000000)
    print(s)
    print("%s seconds"%(time.time()-start))
    
