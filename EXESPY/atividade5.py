lista = []

for i in range(0,21):
  lista.append(i)

novaLista = [item for item in lista if (item % 2) == 0]
print(novaLista)