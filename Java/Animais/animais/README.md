Estudando herança de classe, árvore de dados, tipos de herança.


>>> Animal
    Espécie;
    Tamanho;
    Tipo de alimento;
    Tamanho maior;

    nascer()
    comer()
    crescer()


>>> AnimalAereo extends Animal
(herança de implementação)


>>> AnimalTerrestre extends Animal
    Quantidade de patas;

    correr()


>> AnimalSelvagem extends AnimalTerrestre
    Onde vive;

    Caçar()


>> AnimalDomestico extends AnimalTerrestre
    Nome;
    Idade;
    Cor;

    dormir()