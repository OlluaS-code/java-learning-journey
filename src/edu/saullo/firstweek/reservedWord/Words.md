# Palavras Reservadas da Linguagem Java

As palavras reservadas (ou palavras-chave) são termos protegidos que possuem um significado especial para o compilador do Java. Você não pode utilizá-las como nomes de variáveis, métodos, classes ou identificadores no seu código.
No Java 25, o ecossistema estabilizou e organiza essas palavras em grupos lógicos de uso.

---

## 📋 Tabela Completa de Palavras Reservadas

| Palavra-Chave  | Categoria / Uso Principal     | O que faz no código?                                                                              |
| :------------- | :---------------------------- | :------------------------------------------------------------------------------------------------ |
| `abstract`     | Modificador de Classe/Método  | Declara classes que não podem ser instanciadas ou métodos sem corpo.                              |
| `assert`       | Validação / Debug             | Executa uma validação condicional para testes de código.                                          |
| `boolean`      | Tipo Primitivo                | Tipo de dado lógico que armazena apenas `true` ou `false`.                                        |
| `break`        | Controle de Fluxo             | Interrompe a execução de um loop (`for`, `while`) ou de um `switch`.                              |
| `byte`         | Tipo Primitivo                | Tipo numérico inteiro de 8 bits (guarda valores de -128 a 127).                                   |
| `case`         | Controle de Fluxo             | Define blocks de teste específicos dentro de uma estrutura `switch`.                              |
| `catch`        | Tratamento de Erros           | Captura e trata uma exceção disparada dentro do bloco `try`.                                      |
| `char`         | Tipo Primitivo                | Tipo de dado que armazena um único caractere Unicode de 16 bits.                                  |
| `class`        | Estrutura                     | Declara uma nova classe (molde de um objeto).                                                     |
| `const`        | \_ Não utilizada              | Palavra reservada sem uso (reservada para compatibilidade futura).                                |
| `continue`     | Controle de Fluxo             | Pula a iteração atual do loop e vai direto para a próxima.                                        |
| `default`      | Controle de Fluxo / Interface | Caso padrão do `switch` ou define métodos com corpo em interfaces.                                |
| `do`           | Controle de Fluxo             | Cria a estrutura de repetição `do-while`.                                                         |
| `double`       | Tipo Primitivo                | Tipo numérico decimal de 64 bits (alta precisão).                                                 |
| `else`         | Controle de Fluxo             | Define o bloco alternativo quando a condição do `if` dá falsa.                                    |
| `enum`         | Estrutura                     | Declara uma enumeração (conjunto de constantes fixas).                                            |
| `extends`      | Orientação a Objetos          | Indica que uma classe herda características de outra (Herança).                                   |
| `final`        | Modificador / Constante       | Define variáveis imutáveis, classes que não geram herança ou métodos que não aceitam sobrescrita. |
| `finally`      | Tratamento de Erros           | Bloco executado obrigatoriamente após um `try/catch`, com ou sem erros.                           |
| `float`        | Tipo Primitivo                | Tipo numérico decimal de 32 bits (precisão simples).                                              |
| `for`          | Controle de Fluxo             | Cria a estrutura de repetição clássica de loop controlado.                                        |
| `goto`         | \_ Não utilizada              | Palavra reservada sem uso (reservada para compatibilidade futura).                                |
| `if`           | Controle de Fluxo             | Cria a estrutura condicional básica do sistema.                                                   |
| `implements`   | Orientação a Objetos          | Obriga uma classe a implementar os contratos de uma Interface.                                    |
| `import`       | Organização                   | Importa pacotes, classes ou módulos externos para o arquivo atual.                                |
| `instanceof`   | Comparação                    | Verifica se um objeto pertence a uma determinada classe ou interface.                             |
| `int`          | Tipo Primitivo                | Tipo numérico inteiro padrão de 32 bits.                                                          |
| `interface`    | Estrutura                     | Declara uma interface (contrato de métodos para classes).                                         |
| `long`         | Tipo Primitivo                | Tipo numérico inteiro grande de 64 bits (exige o sufixo 'L').                                     |
| `native`       | Modificador                   | Indica que o método é implementado em código nativo (como C ou C++).                              |
| `new`          | Orientação a Objetos          | Cria e aloca espaço na memória para uma nova instância de um objeto.                              |
| `package`      | Organização                   | Declara a pasta/diretório (pacote) onde o arquivo atual está situado.                             |
| `private`      | Modificador de Acesso         | Torna o atributo ou método visível estritamente dentro da própria classe.                         |
| `protected`    | Modificador de Acesso         | Visível para classes do mesmo pacote ou subclasses (Herança).                                     |
| `public`       | Modificador de Acesso         | Torna a classe, método ou atributo visível para qualquer ponto do projeto.                        |
| `return`       | Controle de Fluxo             | Retorna um valor de um método e encerra a execução dele.                                          |
| `short`        | Tipo Primitivo                | Tipo numérico inteiro curto de 16 bits.                                                           |
| `static`       | Modificador                   | Define que o método ou variável pertence à classe, e não ao objeto.                               |
| `strictfp`     | Modificador                   | Garante a mesma precisão de cálculos decimais em qualquer plataforma.                             |
| `super`        | Orientação a Objetos          | Referencia o construtor ou membros da classe pai (Superclasse).                                   |
| `switch`       | Controle de Fluxo             | Cria uma estrutura de seleção de caminhos baseada em valores fixos.                               |
| `synchronized` | Concorrência                  | Bloqueia o acesso a um bloco de código para apenas uma Thread por vez.                            |
| `this`         | Orientação a Objetos          | Referencia a instância do próprio objeto atual dentro da classe.                                  |
| `throw`        | Tratamento de Erros           | Lança explicitamente uma exceção (erro) no fluxo do sistema.                                      |
| `throws`       | Tratamento de Erros           | Avisa na assinatura do método que ele pode disparar um erro para a frente.                        |
| `transient`    | Modificador                   | Avisa que o atributo deve ser ignorado na serialização do objeto.                                 |
| `try`          | Tratamento de Erros           | Abre o bloco de código protegido onde erros serão monitorados.                                    |
| `void`         | Tipo de Retorno               | Indica que o método executa uma ação mas não retorna dado nenhum.                                 |
| `volatile`     | Concorrência                  | Sinaliza que a variável pode ser alterada por várias Threads simultaneamente.                     |
| `while`        | Controle de Fluxo             | Cria uma estrutura de repetição baseada em uma condição lógica.                                   |

_Nota: `const` e `goto` são palavras reservadas mas não possuem função ativa no ecossistema Java._

---

## ⚠️ Literais Especiais (Atenção!)

As três palavras abaixo não são tecnicamente consideradas palavras-chave (_keywords_) pelo compilador, mas são literais reservados. Você também nunca poderá usá-las como nomes de variáveis:

- `true`: Valor lógico verdadeiro.
- `false`: Valor lógico falso.
- `null`: Indica a ausência de um objeto na memória (referência vazia).

---

## 🧱 Palavras-Chave Contextuais Recentes

Com a evolução do ecossistema do Java moderno, novas palavras foram adicionadas de forma contextual. Isso significa que elas funcionam como restrições apenas quando usadas na estrutura da classe, mas o Java ainda permite que você crie variáveis com esses nomes (embora seja uma péssima prática):

- `record`: Usado para criar classes compactas de dados (_Data Classes_).
- `var`: Permite inferência de tipos em variáveis locais (adicionado no Java 10).
- `yield`: Retorna valores dentro das novas expressões do `switch-case`.
- `sealed` / `non-sealed` / `permits`: Usados para controlar quais classes podem herdar de uma classe pai.
- `module` / `requires` / `exports`: Usados no sistema de módulos do Java (`java.base`).
