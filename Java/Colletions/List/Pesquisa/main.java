package Java.Colletions.List.Pesquisa;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros(new ArrayList<>());
        numeros.adiocionarNumero(10);
        numeros.adiocionarNumero(20);
        numeros.adiocionarNumero(30);
        numeros.adiocionarNumero(40);
        numeros.adiocionarNumero(50);
        System.out.println("Soma: " + numeros.obterSoma());
        System.out.println("Maior: " + numeros.obterMaiorNumero());
        System.out.println("Menor: " + numeros.obterMenorNumero());
    }
}
