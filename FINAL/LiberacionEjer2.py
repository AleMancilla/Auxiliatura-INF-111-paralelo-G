def buscar_may(n):

    may = -1

    while(n>0):
        d = n%10
        n = n//10
        if(d > may):
            may = d
        # print(f'--- {d} -- {n}')
        
    return may 

def cantidad_de_digito(n):
    cont = 0
    while(n>0):
        cont+=1
        n = n//10
    return cont

def eliminar_num(n, may):
    aux = 0
    cd = cantidad_de_digito(n)
    while(n>0):
        cd = cd-1
        d = n//10**cd
        n = n%10**cd
        # print(f' -- d -- {d} -- n -- {n} -- cd = {cd}')
        if(d != may):
            aux = aux*10 +d 
    return aux
    

n = int(input())

may = buscar_may(n)

n = eliminar_num(n,may)

print(n)