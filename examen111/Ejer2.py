def intercambiarExtremos(cad):
    le = len(cad)
    izq = cad[0:1]
    der = cad[le-1:le]
    cad = der + cad[1:le-1] + izq
    return cad 

x = input()
x = intercambiarExtremos(x)
print(x)
