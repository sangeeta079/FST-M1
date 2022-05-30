class Car :
    'These is a car class'

    def __init__(self,manufacturer,model,make,transmission,color) :
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self) :
        print(self.manufacturer + " " + self.model + " is moving ." )

    def stop(self) :
        print (self.manufacturer+ " " + self.model + " has stopped ." )

	
car1 = Car("Tata", "Tiago", "2020", "Manual", "White")
car2 = Car("Maruti", "800", "2013", "Manual", "Red")
car3 = Car("Hundai", "Asent", "2017", "Automatic", "Black")

car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()