### Programação Orientada a Objetos

###### Resumo:
📦`Classe` → Um molde para criar objetos.

🧬`Herança` → Permite que uma classe herde atributos e métodos de outra.

🔀`Polimorfismo` → O mesmo método pode ter diferentes comportamentos.

🏗️`abstract`→ Classe ou método abstrato que não pode ser instanciado diretamente.

🔒`sealed` → Restringe quais classes podem herdar.

🔓`non-sealed` → Permite herança sem restrições.

🚫`final` → Não pode ser alterado (classe, método ou variável).

🧩`extends` → Indica herança entre classes.

📜`record` → Define uma classe imutável e simplificada.

**🖧 `interface`** → Define um contrato que as classes devem seguir.


-------------
____

# **`Classe`**

Um molde que define atributos (dados) e métodos (ações).

# **`Protected`**

Para ter acesso a métodos ou atributos protected, é necessário:

- Herdando a classe que contenha ou,
- Estar no mesmo package

# **`Static`**

**Método, variável ou bloco pertence à classe e não a uma instância específica**.

Um método `static` pode ser chamado **sem precisar criar um objeto** da classe.

#### Exemplo

```java
class Exemplo {
    static int contador = 0; // Variável compartilhada entre todas as instâncias

    Exemplo() {
        contador++; // Cada vez que um objeto é criado, o contador aumenta
    }
}

public class Teste {
    public static void main(String[] args) {
        new Exemplo();
        new Exemplo();
        System.out.println(Exemplo.contador); // Saída: 2
    }
}
```

# **`Polimorfismo`**

Um método pode ter diferentes comportamentos dependendo da classe que o implementa.

👉 **Ocorre quando uma subclasse redefine um método da superclasse.**

👉 Usa a anotação `@Override`

👉 Permite criar comportamento específico para cada classe filha.

#### Exemplo

```java
class Animal {
    void fazerSom() {
        System.out.println("Som do animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido!");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau!");
    }
}

public class Teste {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); // Saída: Latido!

        meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Saída: Miau!
    }
}
```

# **`sealed` e `non-sealed` (Java 17+)**

- **sealed**: Restringe quais classes podem herdar.
- **non-sealed**: Permite herança sem restrições

#### Exemplo:

```java
sealed class Forma permits Circulo, Quadrado {}
non-sealed class Circulo extends Forma {} // Pode ser herdada livremente
final class Quadrado extends Forma {} // Não pode ser herdada
```

# Herança (`extends`)

Permite que uma classe herde atributos e métodos de outra.

### **`record` (Java 14+)**

- Cria classes imutáveis de forma simples.
- Valores devem ser passados por parâmetro, não tem propriedades.

#### Exemplo:

```java
record Ponto(int x, int y) {}
```

# **Classe Abstrata e Método Abstrato (`abstract`)**

- Uma classe abstrata não pode ser instanciada, serve apenas como modelo.
- Métodos abstratos devem ser implementados pelas classes filhas.
- Herança única

#### Exemplo:

```java
abstract class Veiculo {
    abstract void acelerar();
}

class Carro extends Veiculo {
    void acelerar() {
        System.out.println("Carro acelerando!");
    }
}
```

# `final`

- **Classe final**: Não pode ser herdada com atributos herdados.
- **Método final**: Não pode ser sobrescrito.
- **Variável final**: Não pode ser alterada.

#### Exemplo:

```java
final class Pessoa {} // Não pode ter subclasses

class Animal {
    final void dormir() {
        System.out.println("Dormindo...");
    }
}
```

# **`interface`**

- Define um conjunto de métodos que as classes devem implementar.
- Define **apenas** métodos (sem implementação) e constantes.
- Não pode ter atributos de instância.
- Permite **múltipla implementação** (uma classe pode implementar várias interfaces).
- Todos os métodos são **públicos e abstratos** por padrão.

#### Exemplo:

```java
interface Volante {
    void virar();
}

class Carro implements Volante {
    public void virar() {
        System.out.println("Virando o carro");
    }
}
```

## **`Interface Funcional`**

- Interface que **possui apenas um método abstrato**
- Ela pode ter métodos `default` ou `static`

Isso pode ser reduzido das seguintes formas:

```java
var consumer = new Consumer<User>(){
   @Override
   public void accept(final User user) {
        System.out.println(user);
   }
};

users.forEach(consumer);
```

```java
users.forEach((User user) -> {
   System.out.println(user);
});
```

```java
users.forEach(System.out::println);
```

```java
printString(User::name, users);

private static void printString(Function<User, String> callback, List<User> users){    
    users.forEach(user -> System.out.println(callback.apply(user)));
}
```

