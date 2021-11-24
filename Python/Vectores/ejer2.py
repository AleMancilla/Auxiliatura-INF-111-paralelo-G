n = int(input())

notas = list(map(int,input().split()))

suma = 0 

lon  = len(notas)

for i in range(lon):
    suma = suma + notas[i]

notaPromedio = suma // n 
print(notaPromedio)