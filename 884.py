s1 = input()
s2 = input()

a = list(s1.split())
b = list(s2.split())
# print(a)
# print(b)
lst =[]

for i in a:
    if not i in b:
        if a.count(i)==1:
            lst.append(i)

for j in b:
    if not j in a:
        if b.count(j)==1:
            lst.append(j)

print(lst)