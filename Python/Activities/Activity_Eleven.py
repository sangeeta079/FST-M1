#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruitsAvailable = {
    "apple" : 10 ,
    "mango" : 20,
    "lichi" : 30,
    "banana" : 20,
    "orange" : 25
}

reqFruit = input("What fruit you want? ").lower()

if(reqFruit in fruitsAvailable):
    print("Yes, this is available")
else:
    print("No, this is not available")