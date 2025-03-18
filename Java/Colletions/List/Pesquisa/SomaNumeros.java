package Java.Colletions.List.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }
    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void adiocionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int obterSoma() {
        /*
        //Forma 1 - Tradicional 
        Integer soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;*/

        //Forma 2 - Java 8
        /*final int[] soma = {0};
        numeros.forEach(numero -> soma[0] += numero);
        return soma[0];*/

        //Forma 3 - stream API
        //return numeros.stream().mapToInt(Integer::intValue).sum();


        //forma 4
        return numeros.stream().reduce(0, Integer::sum);
    }

    public Integer obterMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            /*for (Integer numero : numeros) {
                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            } */
            //No for
            //Integer.compare(maiorNumero, maiorNumero);
            //maiorNumero = Collections.max(numeros);
            maiorNumero = numeros.stream().max(Integer::compare).get();           
        }
        return maiorNumero;
    }


    public Integer obterMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            menorNumero = numeros.stream().min(Integer::compare).get();
        }
        return menorNumero;
    }
}
