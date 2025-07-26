package org.example;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {


        public List<Integer> listaPrimoRecursivo(int n) {
            List<Integer> primos = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (verificaPrimoRecursivo(i, 2) == true) {
                    primos.add(i);
                }
            }
            return primos;
        }

        private boolean verificaPrimoRecursivo(int numero, int divisor) {
            if (divisor == numero) {
                return true;
            }
            if (numero % divisor == 0) {
                return false;
            }
            return verificaPrimoRecursivo(numero, divisor + 1);
        }

    public static List<Integer> listaPrimoLinear(int n) {

        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (verificaPrimoLinear(i) == true) {
                primos.add(i);
            }
        }
        return primos;
    }

    private static boolean verificaPrimoLinear(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public Integer ValidaNumero(String metodo){
        Boolean numeroValido = false;
        int n = 1;
        while (numeroValido==false){
            System.out.print("Digite um numero: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            scanner.close();
            if (n>1){
                numeroValido=true;
                escolheMetodoECalacula(metodo,n);

            }else {
                System.out.println("O algarismo digitado deve ser um número maior ou igual a 2");
            }
        }
        return n;
    }


    public void escolheMetodoECalacula(String metodo, int n){
        if(metodo == "1"){
            List listaDePrimosRecursivos = listaPrimoRecursivo(n);
            System.out.println("Números primos até (" + n + ") = " +  listaDePrimosRecursivos);
        }
        if(metodo == "2"){
            List listaDePrimosLinearees = listaPrimoLinear(n);
            System.out.println("Números primos até (" + n + ") = " +  listaDePrimosLinearees);
        }

    }

    public void validaMetodo(){
        String metodo = "";
        while(!metodo.equals("1") && !metodo.equals("2")) {
            System.out.println("Digite 1 para calcular com a função recursiva ");
            System.out.println("Digite 2 para calcular com a função linear ");
            Scanner scanner = new Scanner(System.in);
            metodo = scanner.nextLine();

            if (metodo.equals("1") || metodo.equals("2")) {
                if (metodo.equals("1")) {
                    ValidaNumero("1");
                } else if (metodo.equals("2")) {
                    ValidaNumero("2");
                }
            } else {
                System.out.println("Voce deve digitar somente 1 ou 2, conforme opção escolhida");
            }
        }
    }
    }


