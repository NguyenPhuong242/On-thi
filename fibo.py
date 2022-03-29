def fibo(n):
    F = []
    y(0) = 1
    y(1) = 1
    F.append(y(0),y(1))
    for i in range(3, n):
        y(i) = y(i-1) + y(i-2)
        F.append(y(i))
    return F
