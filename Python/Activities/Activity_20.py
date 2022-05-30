import pandas

dataFrame = pandas.read_excel("Sample.xlsx")
print (dataFrame)

# Print number of Rows and columns
print("umber of Rows and columns :" , dataFrame.shape)

# Print Email Column
print("Emails:")
print(dataFrame['Email'])

	
# Sort the data based on FirstName
print("Sorted data:")
print(dataFrame.sort_values('FirstName'))
