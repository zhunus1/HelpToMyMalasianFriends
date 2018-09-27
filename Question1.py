def problem1(n):
    if n==0 or n==1 or n==2:
        return 1
    else:
        return problem1(n-1)+problem1(n-2)+problem1(n-3)

def problem2(n):
    array=list()
    for i in range(n+1):
        if i==0 or i==1 or i==2:
            array.append(1)
        else:
            array.append(array[i-3]+array[i-2]+array[i-1])
    print(array[i])


        
