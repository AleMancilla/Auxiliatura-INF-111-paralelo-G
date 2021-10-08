# 47524773

import math
x = int(input())

num = x 
longi = int(math.log10(num)+1)
nvonumero = 0 
# 3
while num > 10 :
    longi -=1
    d = int(num/ math.pow(10,longi))
    num = int(num %  math.pow(10,longi))

    num2 = num
    longi2 = int(math.log10(num2)+1)
    while num2 > 0:
        longi2 -=1
        d2 = int(num2/ math.pow(10,longi2))
        num2 = int(num2 %  math.pow(10,longi2))

        if( d == d2):
            num3 = nvonumero
            flag = False
            while(num3 >0):
                d3 = num3 %10
                num3 = num3 //10
                if(d3 == d2):
                    flag = True
            if(flag == False ):
                nvonumero = nvonumero * 10 + d
print(nvonumero)

