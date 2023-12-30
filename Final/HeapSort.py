import time


def heapify(lista, n, i):
    tamanho = i
    esquerda = 2 * i + 1
    direita = 2 * i + 2

    if esquerda < n and lista[esquerda] > lista[tamanho]:
        tamanho = esquerda

    if direita < n and lista[direita] > lista[tamanho]:
        tamanho = direita

    if tamanho != i:
        if lista[i] != lista[tamanho]:
            lista[i], lista[tamanho] = lista[tamanho], lista[i]
            heapify(lista, n, tamanho)

def heapSort(lista):
    n = len(lista)

    for i in range(n // 2, -1, -1):
        heapify(lista, n, i)

    for i in range(n - 1, 0, -1):
        lista[0], lista[i] = lista[i], lista[0]
        if lista[i] != lista[0]:
            heapify(lista, i, 0)

    return lista


lista_valores_aleatorios = [35, 84, 72, 74, 31, 20, 80, 6, 23, 4, 67, 13, 8, 78, 78, 74, 84, 75, 1, 45, 33, 8, 90, 47, 17, 54, 95, 11, 23, 99, 50, 68, 34, 88, 34, 70, 62, 99, 75, 79, 84, 45, 83, 11, 87, 53, 64, 91, 25, 22, 10, 62, 49, 97, 69, 64, 63, 66, 36, 100, 20, 81, 14, 10, 87, 23, 79, 51, 69, 49, 30, 69, 69, 75, 27, 57, 58, 15, 50, 47, 9, 50, 20, 88, 55, 14, 49, 15, 7, 42, 92, 44, 11, 53, 31, 11, 23, 35, 69, 31]

lista_valores_ordenados = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]

lista_valores_reverso = [100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]


print("=====================Heap Aleatorio======================")
tempo_inicial = time.perf_counter_ns()
heapSort(lista_valores_aleatorios)
print("O método foi executado em", ((time.perf_counter_ns() - tempo_inicial)))
print(lista_valores_aleatorios)


print("=====================Heap Ordenado======================")
tempo_inicial = time.perf_counter_ns()
heapSort(lista_valores_ordenados)
print("O método foi executado em", (time.perf_counter_ns() - tempo_inicial))
print(lista_valores_ordenados)


print("=====================Heap Reverso======================")
tempo_inicial = time.perf_counter_ns()
heapSort(lista_valores_reverso)
print("O método foi executado em", (time.perf_counter_ns() - tempo_inicial))
print(lista_valores_reverso)
