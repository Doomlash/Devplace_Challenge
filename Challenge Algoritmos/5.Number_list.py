if __name__ == "__main__":
    sum = 0
    par_sum = 0
    mayor = -1
    menor = -1
    last_number = 0
    # asumo que el -1 no es incluido en ninguna dee las categorías
    while last_number != -1:
        last_number = int(input("Ingrese un número: "))
        if last_number != -1:
            if mayor == -1:
                mayor = last_number
                menor = last_number
            if last_number > mayor:
                mayor = last_number
            if last_number < menor:
                menor = last_number
            sum += last_number
            if last_number % 2 == 0:
                par_sum += last_number
        print()
    print("mayor = " + str(mayor))
    print("menor = " + str(menor))
    print("suma total = " + str(sum))
    print("suma de pares = " + str(par_sum))
