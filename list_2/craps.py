import random


print("-" * 30)
print("\t\tJogo Craps")
print("-" * 30)
jogador1 = input("Jogador: ")

print("-" * 30)
print("Aperte a tecla ENTER para girar os dados")
print("-" * 30)
a = input()
dado1 = random.randint(1, 6)
dado2 = random.randint(1, 6)

print("Jogada inicial")
print(f"Dado 1: {dado1}\tDado 2: {dado2}")
ponto = dado1 + dado2
print(f"Ponto: {ponto}")

if ponto == 7 or ponto == 11:
    print("-" * 30)
    print(f"Parabens {jogador1}! Voce ganhou!")
    print("-" * 30)
    exit(-1)

elif ponto == 2 or ponto == 3 or ponto == 12:
    print("-" * 30)
    print("\t\tGAMER OVER")
    print("-" * 30)
    exit(-1)

for num in range(0,4):
    if num == 0:
        print("-" * 30)
        print("\t\tEstagio")
        print("-" * 30)
    print("-" * 30)
    print("Aperte a tecla ENTER para girar os dados")
    print("-" * 30)
    enter = input()
    dado1 = random.randint(1,6)
    dado2 = random.randint(1,6)
    ponto = dado1 + dado2
    print(f"Jogada {num + 1}")
    print(f"Dado 1: {dado1}\tDado 2: {dado2}")
    print(f"Ponto: {ponto}")

    if ponto == 7:
        print("-" * 30)
        print("\t\tGAMER OVER")
        print("-" * 30)
        exit(-1)

print("-" * 30)
print(f"Parabens {jogador1}! Voce ganhou!")
print("-" * 30)
