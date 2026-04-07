class nameDisplay:
     def __init__ (self, name):
         self.name = name
nd = nameDisplay("Raju")
print(nd)

class namedisplay:
    def __init__ (selff, namee, mark):
        selff.namee = namee
        selff.mark = mark
    def __str__ (selff):
        return "Student name is: " + selff.namee + " and mark is: " + str(selff.mark)
nd = namedisplay("Raju", 85)
print(nd)

# class numbers:
#     def __init__(self):
#         self.x = 100
#     def display(self):
#         y = 40
#         print()

#1. Default constructor
class ConstructorAdd:
    def __init__(self):
        self.x = 100
        self.y = 200
    def display(self):
        print("Addition is: ", self.x + self.y)
ca = ConstructorAdd()
ca.display()

#2. Parameteriaed constructor
class Add:
    def __init__(self, x, y):
        self.a = x
        self.b = y
    def display(self):
        print("Addition is: ", self.a + self.b)
a = Add(40, 41)
a.display()

#class atirbutes
class Student:
    college = "Aditya"
s1 = Student()
s2 = Student()
print(s1.college)
print(s2.college)

