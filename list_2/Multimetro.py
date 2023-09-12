import math
media = media2 = variancia = desvio = 0
vetor = [3.2, 4.8, 2.5, 6.1, 3.9, 5.6, 2.2, 4.3, 6.8, 3.7]
dif = [0] * 10

for numero in range(0, 10):
    media += vetor[numero]
media /= 10

for num in range(0, 10):
    dif[num] = vetor[num] - media
    dif[num] *= dif[num]
    variancia += dif[num]

variancia /= 10
desvio = math.sqrt(variancia)
if desvio > media:
    media2 = (media / 100) * 10
    aux = desvio - media
    if aux >= media2:
        print("Esse multimetro esta com problemas!!!")
        exit(-1)
print(f"Desvio: {desvio}")
print(f"Variancia: {variancia}")
print(f"Media: {media}")
