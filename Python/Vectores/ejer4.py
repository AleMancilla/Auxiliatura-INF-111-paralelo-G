def longituDeNumero( n):
    cont = 0
    while(n>0):
        cont= cont+1
        n=n//10
    return cont 

n = int(input())
numeros = list(map(int,input().split()))

y = []
suma = 0
for i  in range(len(numeros)):
    temp = numeros[i]
    lon = longituDeNumero(temp)
    lon = lon-1
    digIzq = temp//10**lon
    # print(digIzq)
    y.append(digIzq)

    suma = suma + (temp%10)

print(y)
print(suma)
