n = int(input('Introduzca n: '))

i = 0
primo = 2
divisor = 2

a = -1 
b = 1
c = a+b 

serie = 0
while ( i < n): 
    if(i %2 == 0):
        print(c,end= ', ')
        i = i+1
        a=b
        b=c 
        c= a+b
    else:
        if( primo % divisor == 0):
            if( primo == divisor):
                print(primo,end='_, ')
                i = i+1
            divisor = 2
            primo = primo+1
        else:
            divisor = divisor+1







