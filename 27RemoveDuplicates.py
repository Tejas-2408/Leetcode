def sol(l,val):
    index =0
    for i in range(len(l)):
        if l[i] != val:
            l[index] = l[i]
            index+=1
    
    return l,index

l = [1,2,2,3,4,4,5,5,5,5,6]
val = 3

l1, n= sol(l,val)
print(l1)
print(n)