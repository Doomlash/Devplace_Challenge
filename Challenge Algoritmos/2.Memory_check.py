
if __name__=="__main__":
    password = input("Ingrese la contraseña a recordar: ")
    counter = 0
    print()
    while counter < 3:
        password_try = input("Ingrese de nuevo la contraseña: ")
        if password_try == password:
            print("Felicitaciones, recordás tu contraseña!!")
            break
        else:
            print("La contraseña es incorrecta.\n")
            counter +=1
    if counter == 3:
        print("Tenes que ejercitar la memoria\n")
    #podria hacerlo para que termine con cualquier tecla pero no se si tengo permitido usar un paquete que no venga por default, en estee caso "keyboard".
    input("Presione ENTER para terminar el programa.")