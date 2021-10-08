 # 5 2 1 5 2 4 0
x = int(input())
maximo = -1
nrocomp = 0

while x != 0:
    if(x>maximo): 
        maximo = x 
    
    nrocomp = nrocomp * 10 + x
    x = int(input())

cont = 0
while nrocomp > 0:
    d=nrocomp %10
    nrocomp = int(nrocomp /10 )
    if d == maximo :
        cont +=1

print(f'El numero maximo es {maximo}, y se repide {cont}')
