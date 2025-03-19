# Guia Rápido sobre Map em Java

## 📌 O que é um Map?
`Map` é uma interface da `java.util` que representa uma coleção de pares **chave-valor**. Cada chave é única e mapeia exatamente um valor.

### Principais implementações:
- `HashMap` → Mais rápido, sem garantia de ordem.
- `LinkedHashMap` → Mantém a ordem de inserção.
- `TreeMap` → Mantém as chaves ordenadas.

## 📌 Declarando um Map

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "C++");
        
        System.out.println(mapa); // Exemplo: {1=Java, 2=Python, 3=C++}
    }
}
```

---

## 📌 Métodos Mais Utilizados

### ➕ Adicionar elementos (`put`)
```java
mapa.put(4, "JavaScript");
```

### ➖ Remover elementos (`remove`)
```java
mapa.remove(2); // Remove a chave 2
```

### 🔍 Verificar se contém uma chave (`containsKey`)
```java
boolean existe = mapa.containsKey(1); // true
```

### 🔍 Verificar se contém um valor (`containsValue`)
```java
boolean existeValor = mapa.containsValue("Java"); // true
```

### 🔄 Obter um valor pela chave (`get`)
```java
String linguagem = mapa.get(1); // Retorna "Java"
```

### 🔄 Tamanho do Map (`size`)
```java
System.out.println(mapa.size()); // Número de pares chave-valor
```

### 🔄 Limpar o Map (`clear`)
```java
mapa.clear();
```

### 🚀 Percorrer um Map
#### 🔹 Percorrendo as chaves
```java
for (Integer chave : mapa.keySet()) {
    System.out.println(chave);
}
ou
mapa.keySet().forEach(System.out::println);
```

#### 🔹 Percorrendo os valores
```java
for (String valor : mapa.values()) {
    System.out.println(valor);
}
ou
mapa.values().forEach(System.out::println);
```

#### 🔹 Percorrendo as chaves e valores (`entrySet`)
```java
for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
    System.out.println(entrada.getKey() + " -> " + entrada.getValue());
}
```

---

## 📌 Ordenação em Map
O `Map` não mantém uma ordem específica, mas podemos garantir a ordenação:

### 1️⃣ **Ordenação por Chave (`TreeMap`)**
O `TreeMap` mantém as chaves ordenadas automaticamente.
```java
Map<Integer, String> ordenado = new TreeMap<>(mapa);
System.out.println(ordenado); // Chaves em ordem crescente
```

### 2️⃣ **Ordenação Personalizada**
Se quisermos ordenar um `Map` de acordo com os valores:
```java
List<Map.Entry<Integer, String>> lista = new ArrayList<>(mapa.entrySet());
lista.sort(Map.Entry.comparingByValue()); // Ordena pelos valores
```

---

## 📌 Convertendo entre Map e outras coleções

### 📝 De Map para List de chaves
```java
List<Integer> listaChaves = new ArrayList<>(mapa.keySet());
```

### 🔄 De Map para List de valores
```java
List<String> listaValores = new ArrayList<>(mapa.values());
```

### 🔄 De List de pares para Map
```java
Map<Integer, String> novoMap = new HashMap<>();
for (Map.Entry<Integer, String> entrada : lista) {
    novoMap.put(entrada.getKey(), entrada.getValue());
}
```

---

## 📌 Conclusão
O `Map` é ideal para armazenar relações **chave-valor**, sendo muito eficiente para buscas rápidas. Escolha a implementação correta conforme a necessidade: `HashMap` para performance, `LinkedHashMap` para ordem de inserção e `TreeMap` para ordenação automática. 🚀

