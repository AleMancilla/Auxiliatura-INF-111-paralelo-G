monto = 1500 
horas = int(input("INTRODUZCA HORAS: "))
minutos = int(input("INTRODUZCA MINUTOS: "))

if ( minutos > 0 ) :
    horas = horas +1
final = horas * monto
print("El monto a pagar es de: ")
print(str(final) + " Bs.") # casteamos un INT  STR osea numero a texto 