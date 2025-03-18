# Guia Rápido sobre List em Java

## 📌 O que é uma List?
`List` é uma interface da `java.util` que representa uma coleção ordenada de elementos, permitindo duplicatas.

### Principais implementações:
- `ArrayList` → Melhor para acesso rápido aos elementos.
- `LinkedList` → Melhor para inserções e remoções frequentes.
- `Vector` → Similar ao `ArrayList`, mas sincronizado (menos usado atualmente).

## 📌 Declarando uma List

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); // Declaração com ArrayList
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        
        System.out.println(lista); // [Java, Python, C++]
    }
}
```

---

## 📌 Métodos Mais Utilizados

### ➕ Adicionar elementos (`add`)
```java
lista.add("JavaScript");
lista.add(1, "Ruby"); // Insere na posição 1
```

### ➖ Remover elementos (`remove`)
```java
lista.remove("Python"); // Remove pelo valor
lista.remove(2); // Remove pelo índice
```

### 🔍 Acessar elementos (`get`)
```java
String linguagem = lista.get(0); // Obtém o primeiro elemento
System.out.println(linguagem); // Java
```

### 🔄 Atualizar um elemento (`set`)
```java
lista.set(1, "Kotlin"); // Substitui na posição 1
```

### 🔍 Verificar tamanho (`size`)
```java
System.out.println(lista.size()); // Retorna o número de elementos
```

### 📌 Ordenar (`sort`)
```java
Collections.sort(lista);
```

### 🔄 Inverter (`reverse`)
```java
Collections.reverse(lista);
```

### 🔍 Verificar se contém um elemento (`contains`)
```java
boolean existe = lista.contains("Java"); // true
```

### 🔍 Encontrar índice (`indexOf`)
```java
int posicao = lista.indexOf("C++");
```

### 🚀 Percorrer a lista
```java
for (String item : lista) {
    System.out.println(item);
}

lista.forEach(System.out::println); // Usando Lambda
```

---

## 📌 Convertendo entre List e Array

### 📝 De List para Array
```java
String[] array = lista.toArray(new String[0]);
```

### 🔄 De Array para List
```java
List<String> novaLista = Arrays.asList(array);
```

---

## 📌 Conclusão
A `List` em Java é uma estrutura poderosa para armazenar e manipular coleções ordenadas. Dependendo da necessidade, podemos escolher a melhor implementação (`ArrayList`, `LinkedList`, etc.) e utilizar métodos úteis para manipulação eficiente! 🚀

