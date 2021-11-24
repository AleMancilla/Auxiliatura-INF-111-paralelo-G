# Problem L: Eliminar Duplicados
# Time Limit: 1 Sec  Memory Limit: 128 MB
# Enviar: 233  Resuelto: 55
# [Enviar][Estado][Foro]
# Descripción
# Botas tiene un arreglo de n enteros. Quiere eliminar elementos duplicados (iguales).

# Botas quiere dejar solo la entrada más a la derecha (ocurrencia) para cada elemento del arreglo. El orden relativo de los elementos únicos restantes no se debe cambiar.

# Entrada
# La entrada contiene varios casos de prueba

# Para cada caso de prueba la primera línea contiene un solo entero n (1≤n≤50) - el número de elementos en el arreglo de botas.

# La siguiente línea contiene una secuencia a1, a2,…, an (1≤ai≤1000) - en el arrego de botas.

# Salida
# En la primera línea, imprima el entero x: el número de elementos que quedarán en el arreglo de botas después de que elimine los duplicados.

# En la segunda línea, imprima x enteros separados con un espacio: el arreglo de botas después de que eliminó los duplicados. Para cada elemento único, solo se debe dejar la entrada más a la derecha.

# Ejemplo Entrada
# 6
# 1 5 5 1 6 1
# 5
# 2 4 2 4 4
# 5
# 6 6 6 6 6
# Ejemplo Salida
# 3
# 5 6 1 
# 2
# 2 4 
# 1
# 6


def buscarNum(vec , x):
    encontro = False
    for i in range(len(vec)):
        if(x==vec[i]):
            encontro = True
    return encontro


################# MAIN ################
while(True):
# for datos in sys.stdin: # RECORRE HASTA QUE EL SYSTEMA YA NO TENGA DATOS

    n = int(input())
    a = list(map(int,input().split()))
    b=[]
    i = n
    while(i>0):
        i = i-1
        respuesta = buscarNum(b,a[i])
        if(respuesta == False):
            b.append(a[i])
        # print(f'i={i} --- {a[i]}')

    l = len(b)
    cad = ''
    for i in range(len(b)):
        cad = str(b[i])+ ' ' + cad 
    print(l)
    print(cad)


    # for i in range(n-1 , 0 , -1): # (i = n-1; i == 0 ; i = i-1)
    #     print(f'i={i} --- {a[i]}')

