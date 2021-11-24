def esPrimo(n):
    respuesta = True
    for i in range(2,n-1):
        if(n%i == 0):
            respuesta = False
    if(n==1):
        respuesta = False
    return respuesta 



n = int(input(()))
vec = list(map(int,input().split()))
primos = []
cont = 0
for i  in range(len(vec)):
    temp = vec[i]
    if( esPrimo(temp) ):
        cont = cont+1
        primos.append(temp)
    
print(cont)
print(primos)


