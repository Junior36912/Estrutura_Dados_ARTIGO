import random

def gerar_lista_aleatoria(tamanho):
  lista = []
  for i in range(tamanho):
    lista.append(random.randint(0, 100))
  return lista


def gerar_lista_crescente(tamanho):
  lista = []
  for i in range(tamanho):
    lista.append(i)
  return lista


def gerar_lista_decrescente(tamanho):
  lista = []
  for i in range(tamanho, 0, -1):
    lista.append(i)
  return lista


def gerar_lista_repetida(tamanho):
  lista = []
  for i in range(tamanho):
    lista.append(random.randint(0, 100))
  for i in range(tamanho):
    if lista[i] in lista[:i]:
      lista[i] = random.randint(0, 100)
  return lista




lista_aleatoria = gerar_lista_aleatoria(500)
print("Lista aleatoria: ", lista_aleatoria)


lista_crescente = gerar_lista_crescente(500)
print("Lista crescente: ", lista_crescente)


lista_decrescente = gerar_lista_decrescente(500)
print("Lista decrescente: ", lista_decrescente)


lista_repetida = gerar_lista_repetida(500)
print("Lista repetida: ", lista_repetida)