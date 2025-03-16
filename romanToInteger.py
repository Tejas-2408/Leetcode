s = input()

d = {
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000
        }

n=0
i=0

while i< len(s):
    if i < len(s)-1 and s[i+1] in d and d[s[i]]<d[s[i+1]]:
        n+= d[s[i+1]] - d[s[i]]
        i+=2
    else:
        n+= d[s[i]]
        i+=1

print(n)