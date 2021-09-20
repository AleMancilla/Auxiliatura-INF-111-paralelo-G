limsup = 2
limInf = 1
serie = limInf
t=1
flag = False

n = int(input('Introduzca n: '))

for i in range(n):
    print(serie,end=', ')
    serie = serie +t
    if(serie == limsup):
        limsup = limsup+1
        t=-1
        flag = True
    if(serie == limInf and flag==False):
        t=1
    if(serie == limInf and flag == True):
        t=0
        flag = False