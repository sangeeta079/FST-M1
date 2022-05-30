# Write a recursive function to calculate the sum of numbers from 0 to 10
def recursive_function(num) :
    if num :
        return num + recursive_function (num-1)
    else :
        return 0

res = recursive_function(10)

print (res)
