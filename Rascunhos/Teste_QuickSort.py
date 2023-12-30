def quick_sort(lista_valores, inicio, fim):
    if inicio < fim:
        pivo = subgrupo(lista_valores, inicio, fim)

        quick_sort(lista_valores, inicio, pivo - 1)
        quick_sort(lista_valores, pivo + 1, fim)


def subgrupo(lista_valores, inicio, fim):
    pivo = lista_valores[fim]
    indice_pivo = inicio - 1

    for indice_analise in range(inicio, fim):
        if lista_valores[indice_analise] <= pivo:
            indice_pivo += 1
            lista_valores[indice_pivo], lista_valores[indice_analise] = lista_valores[indice_analise], lista_valores[indice_pivo]

    lista_valores[indice_pivo + 1], lista_valores[fim] = lista_valores[fim], lista_valores[indice_pivo + 1]

    return indice_pivo + 1


if __name__ == "__main__":
    lista_valores = [72, 17, -8, 93, 0, -55, 26, 7, -19, 64, -3, 38, -11, 50, -72, 21, 9, -34, 83, -5]

    quick_sort(lista_valores, 0, len(lista_valores) - 1)

    for valor in lista_valores:
        print(valor, end=" ")
