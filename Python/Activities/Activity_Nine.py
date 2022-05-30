'''
Given a two list of numbers create a new list such that new list should
contain only odd numbers from the first list and even numbers from the second list.

'''
list1 = ["12","21","6","7","17"]
list2 = ["2","22","17","21","10"]
list3 = []
for x in list1 :
    if ((int(x) % 2)> 0) :
        list3.append(x)

for y in list2 :
     if ((int(y) % 2)== 0) :
         list3.append(y)

print("The new array list is :")
print(list3)
