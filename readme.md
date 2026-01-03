# Lista de Compras

## Sistema de Gerenciamento de Lista de Compras

•  
## Definição do projeto

  ◦ Nome : Lista de Compras
  ◦ Descrição : Sistema interativo para gerenciamento de lista de compras em Java
  ◦ Objetivo :
   ■ Criar um programa que permita ao usuário gerenciar uma lista de compras de forma interativa
   ■ Permitir adicionar produtos com nome e valor
   ■ Visualizar todos os produtos cadastrados
   ■ Remover produtos da lista
   ■ Calcular o valor total das compras
   ■ Ex:
    ■ Produto 1: Arroz - R$ 20.00
    ■ Produto 2: Feijão - R$ 8.50
    ■ Total: R$ 28.50

•  
## Requisitos do projeto

  ◦  
### Definição da tecnologia

   a. Java
   b. ArrayList
   c. Scanner (para entrada de dados)
  ◦  
### Requisitos

   a. Ter instalado em sua máquina alguma IDE Java (Eclipse, IntelliJ IDEA, NetBeans, etc).
   b. Java JDK 8 ou superior instalado.


•  
## Executar projeto

1. Clone este repositório em sua máquina utilizando o gitbash:

```bash
git clone "URL_DO_SEU_REPOSITORIO"
```

2. Abra o Projeto com a IDE de sua preferência

3. Execute o projeto pela classe principal [Principal.java](src/application/Principal.java)

4. Siga as instruções no console para:
   - Informar quantos produtos deseja adicionar inicialmente
   - Digitar o nome e valor de cada produto
   - Escolher se deseja fazer modificações (adicionar, visualizar ou remover itens)

•  
## Estrutura do Projeto

```
Lista-de-compras/
├── src/
│   ├── Main.java
│   ├── application/
│   │   └── Principal.java (Classe principal com a lógica do programa)
│   └── entities/
│       └── Compra.java (Classe que representa um item de compra)
├── projeto.iml
└── readme.md
```

•  
## Funcionalidades

1. **Adicionar Produtos**: Cadastre produtos com nome e valor
2. **Visualizar Lista**: Veja todos os produtos cadastrados com seus respectivos valores
3. **Remover Produtos**: Remova produtos da lista por índice
4. **Interface Interativa**: Menu intuitivo para navegar entre as opções

•  
## Exemplo de Uso

```
-------------Seja Bem-vindo-------------
Informe o numero de quantas coisas para comprar será listadas
2
-------Informações-------
Digite o nome do 1 Produto
Arroz
Digite o valor do Produto
20.00
Digite o nome do 2 Produto
Feijão
Digite o valor do Produto
8.50
-------Atribuições-------
Deseja fazer alguma modificação??
y
-------Escolhas da lista-------
1. Adicionar mais lista de compras
2. Ver lista
3. Remover lista
4. Sair da lista
```