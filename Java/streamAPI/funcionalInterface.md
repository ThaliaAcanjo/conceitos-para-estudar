# 📌 Functional Interface e `@FunctionalInterface` em Java  

## 💡 O que é uma Functional Interface?  
Uma **Functional Interface** é uma interface que contém **apenas um método abstrato**. Permitindo que sejam utilizadas em expressões lambda e programação funcional. Elas estão localizadas no pacote java.util.function e facilitam operações comuns em coleções e streams

Ela pode ter métodos `default` e `static`, mas só um método abstrato.  

### ➡️ Por que usar?  
- Permite o uso de **expressões Lambda**.  
- Facilita a programação funcional no Java.  
- Reduz o uso de classes anônimas desnecessárias.  

---

## 🔹 `@FunctionalInterface`  
O Java fornece a **anotação `@FunctionalInterface`** para garantir que a interface tenha **somente um método abstrato**.  

### ✅ Exemplo de uma Functional Interface:  
```java
@FunctionalInterface
interface Calculadora {
    int calcular(int a, int b);
}
```


## Documentation

## 🔹 Consumer<T>
Representa uma operação que aceita um único argumento e não retorna resultado (operações de consumo).​

Método abstrato:
```java
void accept(T t)
```

Exemplo:
```java
Consumer<String> imprimir = s -> System.out.println(s);
imprimir.accept("Olá, mundo!"); // Saída: Olá, mundo!
```

## 🔹 Supplier<T>
Representa uma função que não aceita argumentos e fornece um resultado (operações de fornecimento).​

Método abstrato:
```java
T get()
```
Exemplo:

```java
Supplier<Double> gerarNumeroAleatorio = () -> Math.random();
System.out.println(gerarNumeroAleatorio.get());
```

## 🔹 Function<T, R>
Representa uma função que aceita um argumento e produz um resultado (operações de transformação).​

Método abstrato:
```java
R apply(T t)
```
Exemplo:

```java
Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
System.out.println(parOuImpar.apply(4)); // Saída: Par
```

## 🔹 Predicate<T>
Representa uma função que avalia um argumento e retorna um booleano (operações de teste).​

Método abstrato:
```java
boolean test(T t)
```
Exemplo:
```java
Predicate<String> comecaComA = s -> s.startsWith("A");
System.out.println(comecaComA.test("Apple")); // Saída: true
```

## 🔹 BinaryOperator<T>
É uma especialização de BiFunction para o caso em que os operandos e o resultado são do mesmo tipo, representando operações binárias.​

Método abstrato:
```java
T apply(T t1, T t2)
````
Exemplo:

```java
BinaryOperator<Integer> soma = (a, b) -> a + b;
System.out.println(soma.apply(2, 3)); // Saída: 5
```
## 🔹 Optional<T>
É uma classe que encapsula um valor que pode ou não estar presente, ajudando a evitar o uso de null e possíveis exceções de ponteiro nulo.​

Principais métodos:
```java
static <T> Optional<T> empty()
static <T> Optional<T> of(T value)
static <T> Optional<T> ofNullable(T value)
T get()
boolean isPresent()
void ifPresent(Consumer<? super T> consumer)
```
Exemplo:
```java
Optional<String> nome = Optional.of("Java");
nome.ifPresent(System.out::println); // Saída: Java
```
