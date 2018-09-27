import time
def problem2():
    d = dict()
    start_time=time.time()
    n1=[1,2,3,4,5,6,7,8,9,10,11]
    n2=[]
    c1=0
    c2=0
    n3=[]
    for i in n1:
        for j in n1:
            for k in n1:
                 if(i!=j and j!=k and i!=k):
                     n2.append([i,j,k])
                     c1+=1
    n2.sort()
    for list in n2:
        list.sort()
        if list not in n3:
            n3.append(list)
            c2+=1
        
    
    print(c2)

    print(c1)
    print("Running time is:"+"%s seconds"%(time.time()-start_time))
   













    
    
    
        
