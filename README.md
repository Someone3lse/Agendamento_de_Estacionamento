# Sistema de Agendamento

## Objetivo
Implementar uma funcionalidade da modelagem: realizar um agendamento após verificar a disponibilidade de uma vaga.

## Funcionalidades
- Representar usuário e vaga.
- Verificar a disponibilidade da vaga.
- Realizar um agendamento e reservar a vaga.
- Listar agendamentos.
- Cancelar um agendamento e liberar a vaga.

## Tecnologias
- Java 8
- Visual Studio Code
- Compilador Java (javac)

O projeto não utiliza Maven, JUnit ou bibliotecas externas.

## Arquivos
- `Usuario.java`: dados do usuário.
- `Vaga.java`: dados e disponibilidade da vaga.
- `Agendamento.java`: informações e cancelamento.
- `SistemaAgendamento.java`: regras de realização e listagem.
- `Main.java`: execução do programa.
- `TesteUnitario.java`: teste unitário da classe Vaga.
- `TesteIntegracao.java`: teste integrado do fluxo entre usuário, vaga e sistema.

## Como executar
Abra o terminal nesta pasta e execute:

```powershell
javac *.java
java Main
```

## Como executar os testes
Após compilar, execute:

```powershell
java TesteUnitario
java TesteIntegracao
```

Mensagens esperadas:
- `Teste unitário aprovado!`
- `Teste de integração aprovado!`

## Observação
Implementação acadêmica inicial. Os dados ficam em memória durante a execução; não há banco de dados nem interface gráfica.
