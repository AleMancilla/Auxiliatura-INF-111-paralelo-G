#create a function that returns a roman number in string format
def roman_num(num):
    #create a dictionary with the roman numbers
    rom_num = {'M':1000, 'CM':900, 'D':500, 'CD':400, 'C':100, 'XC':90, 'L':50, 'XL':40, 'X':10, 'IX':9, 'V':5, 'IV':4, 'I':1}
    #create a string that will be returned
    num_string = ''
    #iterate over the dictionary
    for i in rom_num:
        #if the value is less than the number, add the key to the string
        while num >= rom_num[i]:
            num_string += i
            #substract the value from the number
            num -= rom_num[i]
    #return the string
    return num_string


print(roman_num(int(input("Enter a number: "))))
