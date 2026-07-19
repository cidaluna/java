
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
├── annotation/
├── regex/
├── criptografia/
├── io/
├── excecoes/
└── streams/
```
 
A `MainClass` centraliza a chamada de todos os exemplos, servindo como ponto único de execução e revisão do conteúdo estudado.

## Pacotes e Conceitos
 
### `modelo`
Classes de domínio usadas como base para os exemplos práticos.
- `Produto`: entidade simples com `id`, `descricao` e `preco`.
- `Cliente`: entidade com `id`, `nome`, `cpf`, `email` e `cep`.
- `Veiculo`: entidade com `nome`, `marca`, `cor`, `preco`, `ano` e `velocidadeMaxima`.

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
- `ExemploVisibleCliente`: exibição condicional de campos de `Cliente` conforme `@Visible`.

### `regex`
Validação de padrões de texto com `Pattern` e `Matcher`.
- `ExemploRegexCliente`: validação de e-mail e CEP do `Cliente` via expressões regulares.

### `criptografia`
Criptografia simétrica com a Java Cryptography Architecture (JCA).
- `ExemploCriptografia`: criptografa e descriptografa um texto com AES, usando Base64 para exibição.

### `io`
Comparativo entre as três gerações de I/O do Java: `java.io`, `java.nio` e `java.nio.file` (NIO.2).
- `GeradorArquivoBenchmark`: gera um arquivo de texto de tamanho controlado para os testes de leitura.
- `ExemploIoTradicional`: leitura de arquivo com `BufferedReader` (`java.io`).
- `ExemploNioBuffer`: leitura de arquivo com `ByteBuffer` e `FileChannel` (`java.nio`).
- `ExemploNio2Files`: leitura de arquivo com `Files.lines` (NIO.2).

### `excecoes`
Tratamento de exceções com `try-catch` multi-catch e leitura segura de entrada do usuário.
- `ExemploExceptionDivisaoInteiros`: divisão de dois números lidos via `Scanner`, tratando `InputMismatchException`/`NumberFormatException` (entrada não numérica), `NoSuchElementException` (entrada ausente/EOF), `ArithmeticException` (divisão por zero) e um `catch` genérico como rede de segurança para exceções não previstas.

### `streams`
Processamento funcional de coleções com a Stream API.
- `ExemploStreamVeiculo`: uso de `filter`, `map`, `sorted`, `anyMatch`, `average` e `groupingBy` sobre uma lista de `Veiculo`.

---
 
## Como Executar
 
Execute a classe `MainClass` diretamente pela IDE. Ela chama, em sequência, os exemplos de cada pacote listado acima, exibindo os resultados no console.
 
---
 
## Convenções do Projeto
 
- Pacotes organizados por conceito estudado, não por camada de aplicação.
- O arquivo `benchmarck.txt`, gerado pelo pacote `io`, não é versionado (adicionado no `.gitignore`).
- Commits seguindo [Conventional Commits](https://www.conventionalcommits.org/).
