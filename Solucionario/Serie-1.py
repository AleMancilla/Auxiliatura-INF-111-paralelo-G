n = int(input('Introduzca n: '))
sup = 2
serie = sup 
for i in range(n):
    if(i!=n-1):
        print(serie, end=', ')
    else:
        print(serie, end='')

    if(serie == 1):
        sup = sup+1
        serie = sup
    else:
        serie = serie -1
   
 