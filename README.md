# 💰 Desafio – Encapsulamento em Java | DIO

### Este projeto é um exercício prático do bootcamp **CI&T – Backend com Java & AWS**, oferecido pela plataforma **DIO**.
- O exercício é voltado à **Programação Orientada a Objetos (POO)**, com foco em **encapsulamento**, **lógica de negócios bancários** e **menu interativo no terminal**.

 ## ⭐ Descrição do desafio:
- O sistema simula uma **conta bancária**, permitindo ao usuário realizar diversas operações por meio de um **menu interativo**, incluindo a opção de sair para encerrar a execução do programa.

## 🏦 Funcionalidades

- Criar conta
- Consultar saldo
- Depositar dinheiro
- Sacar dinheiro
- Pagar boleto
- Verificar limite e se está utilizando o cheque especial 
- Sair

## 💸 Regras de negócio

- A conta possui **saldo + limite de cheque especial**  
- O valor do cheque especial é definido na criação da conta:
  - Depósito inicial **≤ R$ 500,00** → cheque especial de **R$ 50,00**
  - Depósito inicial **> R$ 500,00** → cheque especial de **50% do valor depositado**
- Caso o cheque especial seja utilizado, será cobrada uma **taxa de 20%** sobre o valor usado assim que houver saldo disponível

---

## 🧠 Conceitos aplicados
- Encapsulamento  
- Classes e objetos  
- Métodos getters e setters  
- Estruturas condicionais  
- Laços de repetição  
- Menu interativo com `Scanner`
