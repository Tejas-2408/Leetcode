

def sol():
    l = list(map(int,input().split()))
    t = int(input())

    numMap = {}
    n = len(l)

    for i in range(n):
        rem = t - l[i]
        if rem in numMap:
            return [numMap[rem],i]
        numMap[l[i]] = i
    
    return []

a = int(input())
for _ in range(a):
    print(sol())