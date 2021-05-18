camposDoJordao = 22.34
buenosAires = 34.61
ilhaAlexandreI = 71.45
zona = " "

if camposDoJordao >= 0 and camposDoJordao <= 23.26:
    zona = "Zona Tropical"
    print("Campos do Jordão fica na ", zona)
elif camposDoJordao >= 23.27 and camposDoJordao <= 66.32:
    zona = "Zona Temperada do Sul"
    print("Campos do Jordão fica na ", zona)
elif camposDoJordao >= 66.33 and camposDoJordao <= 90:
    zona = "Zona Polar do Sul"
    print("Campos do Jordão fica na ", zona)

if buenosAires >= 0 and buenosAires <= 23.26:
    zona = "Zona Tropical"
    print("Buenos Aires fica na ", zona)
elif buenosAires >= 23.27 and buenosAires <= 66.32:
    zona = "Zona Temperada do Sul"
    print("Buenos Aires fica na ", zona)
elif buenosAires >= 66.33 and buenosAires <= 90:
    zona = "Zona Polar do Sul"
    print("Buenos Aires fica na ", zona)

if ilhaAlexandreI >= 0 and ilhaAlexandreI <= 23.26:
    zona = "Zona Tropical"
    print("A ilha Alexandre I fica na ", zona)
elif ilhaAlexandreI >= 23.27 and ilhaAlexandreI <= 66.32:
    zona = "Zona Temperada do Sul"
    print("A ilha Alexandre I fica na ", zona)
elif ilhaAlexandreI >= 66.33 and ilhaAlexandreI <= 90:
    zona = "Zona Polar do Sul"
    print("A ilha Alexandre I fica na ", zona)