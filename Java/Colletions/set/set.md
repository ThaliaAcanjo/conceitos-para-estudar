# Guia Rápido sobre Set em Java

## 📌 O que é um Set?
`Set` é uma interface da `java.util` que representa uma coleção de elementos **únicos**, ou seja, não permite duplicatas.

### Principais implementações:
- `HashSet` → Mais rápido, mas sem garantia de ordem.
- `LinkedHashSet` → Mantém a ordem de inserção.
- `TreeSet` → Mantém os elementos ordenados.

## 📌 Declarando um Set

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>(); // HashSet sem ordem definida
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");
        
        System.out.println(conjunto); // Exemplo: [C++, Java, Python] (ordem não garantida)
    }
}
```

---

## 📌 Métodos Mais Utilizados

### ➕ Adicionar elementos (`add`)
```java
conjunto.add("JavaScript");
```

### ➖ Remover elementos (`remove`)
```java
conjunto.remove("Python");
```

### 🔍 Verificar se contém um elemento (`contains`)
```java
boolean existe = conjunto.contains("Java"); // true
```

### 🔄 Tamanho do conjunto (`size`)
```java
System.out.println(conjunto.size()); // Número de elementos
```

### 🔄 Limpar o conjunto (`clear`)
```java
conjunto.clear();
```

### 🚀 Percorrer um Set
```java
for (String item : conjunto) {
    System.out.println(item);
}

conjunto.forEach(System.out::println); // Usando Lambda
```

### 📌 Ordenação (`TreeSet`)
Se precisar de um `Set` ordenado:
```java
Set<String> ordenado = new TreeSet<>(conjunto);
System.out.println(ordenado); // Saída ordenada
```

---

## 📌 Ordenação no TreeSet
O `TreeSet` ordena os elementos **automaticamente** porque internamente usa uma **árvore binária de busca balanceada (Red-Black Tree)**. Ele define a ordem de dois modos principais:

### 1️⃣ **Ordenação Padrão (Comparable)**
Se os elementos forem tipos primitivos (`Integer`, `Double`, `String`, etc.), o `TreeSet` os ordena naturalmente.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Banana");
        conjunto.add("Maçã");
        conjunto.add("Uva");
        conjunto.add("Abacaxi");

        System.out.println(conjunto); // [Abacaxi, Banana, Maçã, Uva] (ordem alfabética)
    }
}
```

### 2️⃣ **Ordenação Personalizada (Comparator)**
Se tivermos uma classe personalizada, precisamos definir como ela será ordenada.

```java
import java.util.*;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um TreeSet com um Comparator para ordenar por preço
        Set<Produto> produtos = new TreeSet<>(Comparator.comparingDouble(p -> p.preco));

        produtos.add(new Produto("Celular", 2000.00));
        produtos.add(new Produto("Notebook", 4500.00));
        produtos.add(new Produto("Fone de Ouvido", 150.00));

        // Exibe os produtos ordenados pelo preço
        System.out.println(produtos);
    }
}
```

💡 **Explicação:**
- Usamos `Comparator.comparingDouble(p -> p.preco)` para definir a ordenação.
- O `TreeSet` agora organizará os produtos do **mais barato para o mais caro** automaticamente.

Se precisar ordenar por outro atributo, basta trocar `comparingDouble(p -> p.preco)` por outro, como `Comparator.comparing(p -> p.nome)` para ordenar por nome.

---

## 📌 Convertendo entre Set e List

### 📝 De Set para List
```java
List<String> lista = new ArrayList<>(conjunto);
```

### 🔄 De List para Set
```java
Set<String> novoSet = new HashSet<>(lista);
```

---

## 📌 Conclusão
O `Set` em Java é ideal para armazenar elementos **únicos** e pode ser usado para remover duplicatas automaticamente. Escolha a implementação certa dependendo da necessidade (rápida com `HashSet`, ordenada com `TreeSet`, ou ordenação por inserção com `LinkedHashSet`). 🚀

