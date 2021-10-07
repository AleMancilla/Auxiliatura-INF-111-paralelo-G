x = int(input())
n = int(input())
cont = 0
flag = True
se1 = 1
se2 = n 

for i in range(n):
    if(cont == x):
        cont = 1
        flag = not flag
    else :
        cont +=1
    
    if(flag == True):
        print(se1, end=', ')
        se1 +=1
    else:
        print(se2, end=', ')
        se2-=1
        
 