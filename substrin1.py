## Problem link: https://leetcode.com/problems/longest-substring-without-repeating-characters/ 

def sol():
    s = input()

    count = 0
    ss = ""

    for i in s:
        if i not in ss:
            ss+=i 
        else:
            if count<len(ss):
                count = len(ss)
            ss=i 

    print(count)


t = int(input())
for _ in range(t):
    sol()
