def esNumero(pal):
    l = len(pal)
    isNumber = True
    for i in range(l):
        d = pal[i:i+1]
        if(
            d == 'a' or 
            d == 'b' or 
            d == 'c' or 
            d == 'd' or 
            d == 'e' or 
            d == 'f' or 
            d == 'g' or 
            d == 'h'  
        ):
            isNumber = False
            
    return isNumber


def convertirNumaTexto(pal):
    n = int(pal)
    aux = ''
    # print(f' n - {n} -- columna - {n%8} -- fila - {(n//8)+1}')
    if(n%8 == 1):
        aux= 'a'
    if(n%8 == 2):
        aux= 'b'
    if(n%8 == 3):
        aux= 'c'
    if(n%8 == 4):
        aux= 'd'
    if(n%8 == 5):
        aux= 'e'
    if(n%8 == 6):
        aux= 'f'
    if(n%8 == 7):
        aux= 'g'
    if(n%8 == 0):
        aux= 'h'
    aux = aux + str((n//8)+1)
    print(aux)


def convertirTextoaNum(pal):
    d = pal[0:1]
    n = int(pal[1:2])
    
    resta = 0
    if(d == 'a'):
        resta = 7
    if(d == 'b'):
        resta = 6
    if(d == 'c'):
        resta = 5
    if(d == 'd'):
        resta = 4
    if(d == 'e'):
        resta = 3
    if(d == 'f'):
        resta = 2
    if(d == 'g'):
        resta = 1
    if(d == 'h'):
        resta = 0
    print((n*8)-resta)



n = int(input())

for i in range(n):
    x = input() #cadena '5' 'e5'
    isnumber = esNumero(x)
    if(isnumber):
        convertirNumaTexto(x)
    else:
        convertirTextoaNum(x)



