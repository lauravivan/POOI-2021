def calculoJuros(valorInicial, taxa, tempoRendimento):
  valorFinal = valorInicial * ((1 + taxa) ** tempoRendimento)
  print("O valor final é ", valorFinal)

calculoJuros(10000, 0.6 / 100, 8)