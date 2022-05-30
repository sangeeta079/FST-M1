#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5
tupleNumber = tuple(input("Enter your number separeted with comma :" ).split(","))
for num in tupleNumber :
    if ((int(num) % 5) == 0) :
        print (num)