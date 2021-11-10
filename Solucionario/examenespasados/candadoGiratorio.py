
def menorCantidadMovimientos(a,b):
    r = abs(a-b)
    if r > 5:
        r = 10 - r
    return r

n = int(input())
ca = int(input())
cc = int(input())

suma = 0

while cc > 0:
    d1 = ca % 10
    ca = ca // 10
    
    d2 = cc % 10
    cc = cc // 10

    suma = suma + menorCantidadMovimientos(d1,d2)

print(suma)


