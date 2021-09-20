limsup = 2
limInf = 1
serie = limInf
t=1

n = int(input('Introduzca n: '))

for i in range(n):
    print(serie,end=', ')
    serie = serie +t
    if(serie == limsup):
        limsup = limsup+1
        t=-1
    if(serie == limInf):
        t=1