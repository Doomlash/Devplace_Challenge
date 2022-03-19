import math

if __name__ == "__main__":
    n = int(input("Ingrese un numero: "))
    # Comienzo asumiendo que n es primo
    esPrimo = 1
    # solo necesito chequear hasta la raíz cuadrada de n ya que un número mayor a n^1/2 no puede ser un factor sin que otro número menor a n^1/2 también lo sea.
    sqrt_n = math.floor(math.sqrt(n))
    i = 3
    # chequeo si n es 1 ya que es el único número no primo que no tiene factores menores a si mismo
    if n == 1:
        esPrimo = 0
    #chequeo si el numero es par para optimizar la cantidad de chequeos en el bucle
    elif n % 2 == 0 and n !=2:
        esPrimo = 0
    while i <= sqrt_n and esPrimo == 1:
        if n % i == 0:
            esPrimo = 0
        else:
            i += 2
    if esPrimo == 1:
        print("El número dado es primo.")
    else:
        print("El número dado no es primo")
