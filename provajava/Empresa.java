package provajava;

import java.util.Scanner;

public class Empresa {
   Scanner sc = new Scanner(System.in);
    
    public void exemplo1() {
        
        Scanner input = new Scanner(System.in);
        
        double num1, num2, resultado;
        char operador;
        
        System.out.println("Digite o primeiro número:");
        num1 = input.nextDouble();
        
        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();
        
        System.out.println("Escolha a operação aritmética a ser executada (+, -, *, /):");
        operador = input.next().charAt(0);
        
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
                
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
                
            default:
                System.out.println("Operador inválido!");
                break;
        }
        
        input.close();
    }

}


