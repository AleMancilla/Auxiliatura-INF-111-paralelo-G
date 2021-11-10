ri = int(input())
rd = int(input())
numero = int(input())

longitud = 0
aux = numero
while numero > 0 :
    longitud = longitud + 1
    numero = numero // 10

numero = aux

vector = []
while numero > 0:
    longitud=longitud-1
    d = numero / 10**longitud
    numero = numero % 10**longitud
    vector.append(int(d))

print(vector)

vector2 = vector

aux = 0
for i in range(len(vector)):
    print(vector[i])
    # 1-13456 --- 143652
    if(vector[i] % 2 ==0):
        vector[i] = -1
        for j in range(len(vector)):
            print(vector[j])
            if(vector[j] % 2 ==0):
                vector3 = vector 
                pos = vector.index(-1)
                vector[pos] = vector[j]
                vector[j] = -1

aux = 0
for i in range(len(vector)):
    print(vector[i])
    # 1-13456 --- 143652
    if(vector[i] % 2 ==0):
        vector[i] = -1
        for j in range(len(vector)):
            print(vector[j])
            if(vector[j] % 2 ==0):
                vector3 = vector 
                pos = vector.index(-1)
                vector[pos] = vector[j]
                vector[j] = -1




    



