from random import randint, seed
from datetime import datetime

if __name__ == "__main__":
    #lo seedeo con el tiempo para que siempre sea distinto
    seed(datetime.now())
    n = randint(0, 1000)
    guess = -1
    print("Intenta adivinar un número entre 0 y 1000.")
    #hago los chequeos y el bucle continua hasta que el numero se adivina
    while guess != n:
        guess = int(input("-->"))
        if guess < n:
            print("El número es mayor al dado")
        if guess > n:
            print("el número es menor al dado")
        if guess == n:
            print("Felicitaciones, adivinaste el numero!!")

