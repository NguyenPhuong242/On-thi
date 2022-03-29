def addition ():
    print("Addition")
    n = float(input("Entrez la nombre: "))
    t = 0
    Resultat = 0
    while n != 0:
        Resultat = Resultat + n
        t+=1
        n = float(input("Entrez autre nombre (0 pour calculate): "))
    return [Resultat,t]
def subtraction ():
    print("Subtraction");
    n = float(input("Entrez la nombre: "))
    t = 0
    sum = 0
    while n != 0:
        Resultat = Resultat - n
        t+=1
        n = float(input("Entrez autre nombre (0 pour calculate): "))
    return [Resultat,t]
def multiplication ():
    print("Multiplication")
    n = float(input("Entrez la nombre: "))
    t = 0
    Resultat = 1
    while n != 0:
        Resultat = Resultat * n
        t+=1
        n = float(input("Entrez autre nombre (0 pour calculate): "))
    return [Resultat,t]
def average():
    an = []
    an = addition()
    t = an[1]
    a = an[0]
    Resultat = a / t
    return [Resultat,t]

while True:
    list = []
    print(" Entrez 'a' pour l'addition")
    print(" Entrez 's' pour la substraction")
    print(" Entrez 'm' pour la multiplication")
    print(" Entrez 'v' pour l'average")
    print(" Entrez 'q' pour quit")
    c = input(" ")
    if c != 'q':
        if c == 'a':
            list = addition()
            print("Resultat = ", list[0], " total inputs ",list[1])
        elif c == 's':
            list = subtraction()
            print("Resultat = ", list[0], " total inputs ",list[1])
        elif c == 'm':
            list = multiplication()
            print("Resultat = ", list[0], " total inputs ",list[1])
        elif c == 'v':
            list = average()
            print("Resultat = ", list[0], " total inputs ",list[1])
        else:
            print ("Désolee, invilid character")
    else:
        break
