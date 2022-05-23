#Given a list of numbers, return True if first and last number of a list is same.
listOfNumbers = list(input("Enter list of numbers separeted with comma :").split(","))
bnFlag = "FALSE"
intLength = len(listOfNumbers)
fistNumber = listOfNumbers[0]
lastNumber = listOfNumbers[intLength -1]
if fistNumber == lastNumber:
    bnFlag = "TRUE"
    print("The fist number and last number of the list is same :"+ bnFlag )
else:
    print("The fist number and last number of the list is same :"+ bnFlag )