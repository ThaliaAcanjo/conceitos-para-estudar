## 📌 Stream API e Lambda em Java
### 💡 O que é a Stream API?
A Stream API foi introduzida no Java 8 e serve para facilitar o processamento de coleções (List, Set, Map, etc.), permitindo operações como filtragem, mapeamento e redução de forma funcional.

#### Principais vantagens:
✅ Código mais conciso e legível

✅ Evita loops manuais (for, while)

✅ Permite paralelismo para maior desempenho


### ⚡ Lambda (Expressões Lambda)
#### 📍 Contexto
Antes do Java 8, era necessário criar classes anônimas para passar comportamentos (ex.: interfaces funcionais). Com Lambda, podemos escrever funções de maneira mais simples.

#### 🔹 O que permite?
Passar funções como parâmetro
Criar código mais enxuto
Utilizar programação funcional no Java
#### 🎭 Papel do Lambda
Ele é uma forma curta de escrever uma função anônima, usada geralmente com interfaces funcionais (interfaces que têm apenas um método abstrato, como Comparator<T>, Runnable, Function<T,R>).

#### ✏️ Como usar Lambda?
A sintaxe básica de uma expressão lambda:

```java
(parametros) -> { corpo da função }
```

**🔹 Exemplo (antes e depois do Lambda):**

✅ Antes (Classe Anônima)

```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");
Collections.sort(nomes, new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
});
```
✅ Depois (Usando Lambda)

```java
List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");
nomes.sort((s1, s2) -> s1.compareTo(s2));
```
### 🚀 Stream API com Lambda
A Stream API usa Lambda para facilitar o processamento de dados em coleções.

🔹 Exemplo prático (filtrando uma lista de números pares):
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

List<Integer> pares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

System.out.println(pares); // [2, 4, 6]
```

📌 Explicação:

`.stream()` – Converte a lista em uma Stream.

`.filter(n -> n % 2 == 0)` – Filtra apenas números pares.
`.collect(Collectors.toList())` – Converte o resultado de volta para uma List.

## 🎯 Conclusão
Lambda simplifica a escrita de código ao remover classes anônimas desnecessárias.
Stream API melhora o processamento de coleções com código mais limpo e eficiente.
Ambos juntos ajudam a tornar o Java mais funcional e moderno. 🚀