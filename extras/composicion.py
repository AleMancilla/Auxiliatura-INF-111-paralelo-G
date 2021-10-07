# COMPOSICION POR LA DERECHA
res =0
while(True):
    n = int(input('Intorduzca n'))
    res = res*10+n

    print(res)

# COMPOSICION POR LA IZQ
res =0
pot = 1
while(True):
    n = int(input('Intorduzca n'))
    n=n*pot
    res = res + n
    pot = pot *10
    print(res)

