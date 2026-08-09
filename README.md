
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

## Como Testar a API Localmente (Windows)

Por padrão, o terminal PowerShell do Windows confunde o comando `curl` com um utilitário interno do sistema, o que pode cortar o resultado do JSON com reticências (`...`). 

Para contornar isso e visualizar a lista completa de dados do cardápio, utilize o executável real do Curl adicionando o `.exe`.

### Comando de Teste

* **Utilidade:** Realiza uma requisição HTTP do tipo GET para o servidor, ativando o modo detalhado (`-v`) para visualizar os cabeçalhos da resposta (como o `Content-Type`) junto com o corpo do JSON completo.
* **Comando no Terminal:**

```powershell
curl.exe -v http://localhost:8000/itensCardapio.json
```
---

## Testes de Carga com Apache JMeter

Para testar o desempenho e o comportamento do servidor HTTP sob múltiplas requisições simultâneas (threads), utilizamos o **Apache JMeter**.

### Pré-requisitos (Configuração no Windows)
Como o JMeter é portátil, para conseguir executá-lo diretamente pelo terminal do IntelliJ, certifique-se de:
1. Baixar o arquivo `.zip` (Binaries) no site oficial do Apache JMeter.
2. Extrair a pasta no seu computador (ex: `C:\apache-jmeter-X.X.X`).
3. Adicionar o caminho da pasta `bin` (ex: `C:\apache-jmeter-X.X.X\bin`) na variável de sistema **`Path`** do Windows.
4. Reiniciar o IntelliJ para que o terminal reconheça o comando.

### Comandos Úteis no Terminal

* **Verificar a Instalação:**
  Exibe a versão do JMeter instalada para garantir que o terminal reconheceu o comando.
  ```powershell
  jmeter -v
  ```

* **Abrir a Interface Gráfica (GUI):**
  Abre a tela visual do JMeter para criar, editar e desenhar os planos de testes (criar o Grupo de Usuários/Threads e configurar a requisição HTTP para `http://localhost:8000/itensCardapio.json`).
  ```powershell
  jmeter
  ```

* **Rodar Testes em Modo CLI (Silencioso - Recomendado para Performance):**
  Para testes reais de estresse, a própria ferramenta recomenda não usar a tela visual (pois ela consome muita memória do seu PC). Usamos o terminal para rodar o teste e salvar o relatório:
  ```powershell
  jmeter -n -t caminho/do/seu/plano_de_teste.jmx -l resultado.jtl
  ```
  *(Onde `-n` ativa o modo sem interface gráfica, `-t` aponta para o arquivo do teste criado, e `-l` gera o arquivo com os resultados).*
---
 
## Convenções do Projeto
 
- Pacotes organizados por conceito estudado, não por camada de aplicação.
- O arquivo `benchmarck.txt`, gerado pelo pacote `io`, não é versionado (adicionado no `.gitignore`).
- Commits seguindo [Conventional Commits](https://www.conventionalcommits.org/).
