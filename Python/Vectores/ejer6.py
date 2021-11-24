n = int(input(()))
vec = list(map(int,input().split()))

suma = 0
for i in range(len(vec)):
    temp = vec[i]
    suma = suma + temp%2

if(suma == 0):
    print("YES")
elif(suma == len(vec)):
    print("YES")
else:
  print("NO")
    

