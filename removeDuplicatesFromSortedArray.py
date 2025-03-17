def sol(l):
    j = 1

    for i in range(1,len(l)):
        if l[i] != l[i-1]:
            l[j] = l[i]
            j+=1
    
    return l,j

l = [1,2,2,3,4,4,5,5,5,5,6]

l1, n= sol(l)
print(l1)
print(n)