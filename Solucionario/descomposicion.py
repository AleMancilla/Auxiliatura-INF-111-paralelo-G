import math

n = 123456

# DESCOMPOSICION POR LA DERECHA
while ( n > 0):
    d=n%10
    n = int(n/10)
    print(d, end=', ')

# DESCOMPOSICION POR LA IZQ
longitud = int(math.log10(n)+1)
while(n>0):
    longitud -=1
    d = int(n/(10**longitud))
    n = n % (10**longitud)
    print(d, end=', ')
