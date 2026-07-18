
# ☕ Java 

Repositório de estudos práticos da linguagem Java.

---
## Tecnologias Utilizadas

- Java 25+
- IntelliJ IDE
- Banco de Dados (JDBC)
- Git + GitHub
- Padrões de Projeto (Design Patterns)
---
 
## Estrutura do Projeto
 
```
fundamentos-java/src/main/java/br/com/cidaluna/
├── MainClass.java
├── modelo/
├── estruturascontrole/
├── colecoes/
├── optional/
├── datahora/
├── reflection/
└── annotation/
```
 
A `MainClass` centraliza a chamada de todos os exemplos, servindo como ponto único de execução e revisão do conteúdo estudado.

## Pacotes e Conceitos
 
### `modelo`
Classes de domínio usadas como base para os exemplos práticos.
- `Produto`: entidade simples com `id`, `descricao` e `preco`.

### `estruturascontrole`
Estruturas condicionais e de repetição.
- `ExemploCondicional`: uso de `if` / `else` / `else if`.
- `ExemploLacoWhile`: uso de `while` e `do-while`.
- `ExemploLacoFor`: uso de `for` tradicional e `for-each`.

### `colecoes`
Principais estruturas de dados da Collections API.
- `ExemploList`: uso de `List` (permite duplicados, mantém ordem).
- `ExemploSet`: uso de `Set` (não permite duplicados).
- `ExemploMap`: uso de `Map` (pares chave-valor).
- `ExemploListProduto`: uso de `List<Produto>` com filtro e soma manual.
- `comparativo/ExemploComparativoColecoes`: comparação lado a lado entre `List`, `Set` e `Map` no mesmo cenário.

### `optional`
Tratamento seguro de ausência de valor, evitando `NullPointerException`.
- `ExemploOptionalProduto`: busca de `Produto` por id usando `Optional` e `orElse` para produto inexistente.

### `datahora`
API `java.time` (Date and Time API).
- `ExemploDataHora`: uso de `LocalDate`, `LocalTime` e `LocalDateTime` para data atual, hora atual e data/hora atual, com formatação via `DateTimeFormatter`.

### `reflection`
Introspecção de classes em tempo de execução.
- `ExemploReflectionProduto`: leitura de campos e métodos de `Produto` via `java.lang.reflect`, incluindo acesso a campo privado e invocação dinâmica de método.

### `annotation`
Metadados customizados e seu processamento via reflection.
- `CampoObrigatorio`: annotation que marca campos obrigatórios.
- `Visible`: annotation que controla se um campo deve ser exibido.
- `ExemploAnnotationProduto`: validação de campos obrigatórios de `Produto`.
- `ExemploVisibleProduto`: exibição condicional de campos de `Produto` conforme `@Visible`.
---
 
## Como Executar
 
Execute a classe `MainClass` diretamente pela IDE. Ela chama, em sequência, os exemplos de cada pacote listado acima, exibindo os resultados no console.
 
---
 
## Convenções do Projeto
 
- Pacotes organizados por conceito estudado, não por camada de aplicação.
- Commits seguindo [Conventional Commits](https://www.conventionalcommits.org/).
