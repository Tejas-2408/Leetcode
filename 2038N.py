def sol():
    s = input()
    a=int(s[0])
    b=int(s[-1])
    c = s[1]
    if c=='=':
        if a==b:
            print(s)
        else:
            print(f"{a}{c}{a}")

    elif c=='>':
        if a>b:
            print(s)
        else:
            print(f"{b}{c}{a}")

    elif c=='<':
        if a<b:
            print(s)
        else:
            print(f"{b}{c}{a}")


t = int(input())
for _ in range(t):
    sol()