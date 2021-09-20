serie = 0 
limite = 1
contador = 1

n = int(input('Introduzca n: '))

for i in range(n):
    print(serie,end=', ') 
    if( contador == limite and serie == 1 ):
        limite = limite +1 
        serie = 0
        contador =0   
    if(contador == limite and serie == 0):
        serie =1
        contador = 0
    contador +=1