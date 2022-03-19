if __name__ == "__main__":
    #primero pedimos todos los datps
    valor = int(input("Ingrese el valor por hora del empleado: "))
    nombre = input("Ingrese el nombre: ")
    antigüedad = int(input("Ingrese los años de antigüedad: "))
    trabajo_mes = int(input("Ingrese la cantidad de horas trabajadas en el mes: "))
    total = valor*trabajo_mes
    if antigüedad>10:
        total += antigüedad*30
    print("El monto a pagar a "+nombre+", con "+str(antigüedad)+" años de antigüedad, es de $"+str(total))