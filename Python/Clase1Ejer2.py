sueldoBase = float(input())
venta1 = float(input())
venta2 = float(input())
venta3 = float(input())

c1 = 0.1 * venta1
c2 = 0.1 * venta2
c3 = 0.1 * venta3

comiciones = c1 + c2 + c3

total = sueldoBase + comiciones

print(total)