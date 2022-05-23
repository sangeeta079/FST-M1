from datetime import date
currentYear = int(date.today().year)
print(currentYear)
strName = input("Enter Your Name :")
intAge = int(input("Enter your Age :"))
hundredyear = str((currentYear-intAge)+100)
print( strName + " will be 100 years old in the year " + hundredyear )