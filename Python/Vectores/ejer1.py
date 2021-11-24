# x = input().split()
x = list(map(int,input().split())) # recibe un vector de numeros
longitud = len(x)
y = []

for i in range(longitud):
    temp = x[i]
    
    l = len(y)
    seRepitio = False
    for j in range(l):
        if(y[j] == temp):
            seRepitio = True
    if( not seRepitio):
        y.append(temp)

print(y)

# 2 3 4 5 6 3 4 6 8 5 6 2 9 0 1 2 

    # print(f"posicion {i} es el elemento = {temp}")
    
