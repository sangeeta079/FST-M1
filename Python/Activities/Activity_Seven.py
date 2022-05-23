# Write a Python program to calculate the sum of all the elements in a list
listOfnumber = list(input("Enter a sequence of coma separated value :").split(","))
sum=0
for number in listOfnumber :
    sum += int(number)
print (sum)