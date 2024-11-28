
import sys

def sol():
    n,k = map(int,input().split())
    a = [0 for i in range(k+1)]
    for i in range(k):
        b,c = map(int,input().split())
        a[b]+=c

    a.sort(reverse=True)
    
    res = 0
    for i in range(len(a)):
        if n:
            res+=a[i]
            n=n-1
        else:
            break

    print(int(res))




t = int(input())
for _ in range(t):
    sol()