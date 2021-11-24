n = int(input())

pilas = list(map(int,input().split()))

lon = len(pilas)

mayor = -10000

for i in range(lon):
    if(pilas[i] > mayor):
        mayor = pilas[i]

print(mayor)
    