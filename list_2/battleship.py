import os


def parada():
    print("-" * 30)
    input("Press Enter to Continue!")


def adicionar_coordenada(matriz, jogador):
    print(f"Player {jogador}, Enter your ship's coordinates")
    print("-" * 30)
    cont = 0
    while cont != 5:
        print(f"Enter ship {cont + 1} location")
        linha = int(input("Linha: "))
        coluna = int(input("Coluna: "))

        if linha >= 5 or coluna >= 5:
            print("-" * 30)
            print("Invalid coordinates. Choose different coordinates")
            print("-" * 30)
            continue

        if matriz[linha][coluna] == 1:
            print("-" * 30)
            print("You already have a ship there. Choose different coordinates")
            print("-" * 30)
            continue

        matriz[linha][coluna] = 1
        cont += 1


def mostrar_mapa(matriz):
    for m in range(0, 5):
        print(f"\t{m} ", end="")
        if m == 4:
            print()
    for i in range(0, 5):
        print(f"{i}\t", end="")
        for j in range(0, 5):
            if matriz[i][j] == 0:
                print("-\t", end="")
            elif matriz[i][j] == 1:
                print("@\t", end="")
            elif matriz[i][j] == 2:
                print("X\t", end="")
            elif matriz[i][j] == 3:
                print("O\t", end="")
        print()
    print()


def verificacao_mapa(matriz):
    cont = 0
    for i in range(0, 5):
        for j in range(0, 5):
            if matriz[i][j] == 2:
                cont += 1

    if cont == 5:
        return True
    else:
        return False


def missed(mapa, navio, jogador1, jogador2):
    cont = 0
    linha = 0
    coluna = 0

    while cont == 0:
        print("-" * 30)
        print(f"Player {jogador1}, Enter hit row/column: ")
        linha = int(input("Linha: "))
        coluna = int(input("Coluna: "))

        if linha >= 5 or coluna >= 5:
            print("Invalid coordinates. Choose different coordinates")
            continue
        if mapa[linha][coluna] == 2 or mapa[linha][coluna] == 3:
            print("You already fired on this spot. Choose different coordinates")
            continue
        break
    print("-" * 30)
    print(f"\tPlayer {jogador1} MISSED!")
    print("-" * 30)
    if navio[linha][coluna] == 0:
        mapa[linha][coluna] = 3
    elif navio[linha][coluna] == 1:
        mapa[linha][coluna] = 2
        print(f"Player {jogador1} hit player {jogador2}'s Ship!")
    mostrar_mapa(mapa)


print("-" * 30)
print("\tWelcome to Battleship!")
print("-" * 30)
jogador1 = input("Player 1 = ")
jogador2 = input("Player 2 = ")
print("-" * 30)
p_ship1 = [[0] * 5 for _ in range(5)]
p_ship2 = [[0] * 5 for _ in range(5)]
mapa_p1 = [[0] * 5 for _ in range(5)]
mapa_p2 = [[0] * 5 for _ in range(5)]

adicionar_coordenada(p_ship1, jogador1)
mostrar_mapa(p_ship1)
parada()
os.system('cls' if os.name == 'nt' else 'clear')
adicionar_coordenada(p_ship2, jogador2)
mostrar_mapa(p_ship2)
parada()
os.system('cls' if os.name == 'nt' else 'clear')

contad = 0
while True:
    if contad % 2 == 0:
        missed(mapa_p1, p_ship2, jogador1, jogador2)
        if verificacao_mapa(mapa_p1) == True:
            print("-" * 30)
            print(f"\tPlayer {jogador1} WINS!")
            print("-" * 30)
            break
    else:
        missed(mapa_p2, p_ship1, jogador2, jogador1)
        if verificacao_mapa(mapa_p2) == True:
            print("-" * 30)
            print(f"\tPlayer {jogador2} WINS!")
            print("-" * 30)
            break
    contad += 1
