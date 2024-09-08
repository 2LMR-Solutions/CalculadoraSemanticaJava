import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("Digite a conta a ser feita (numero operação numero): ");
            String input = scanner.nextLine();
            String[] partes = input.split(" ");

            if (partes.length != 3) {
                System.out.println("Entrada invalida! Certifique-se de inserir no formato 'número operação número'");
                continue;
            }

            try {
                double n1 = Double.parseDouble(partes[0]);
                String operacao = partes[1];
                double n2 = Double.parseDouble(partes[2]);
                double resultado = 0;

                switch (operacao) {
                    case "mais":
                        resultado = calc.mais(n1, n2);
                        break;
                    case "menos":
                        resultado = calc.menos(n1, n2);
                        break;
                    case "multiplica":
                        resultado = calc.multiplica(n1, n2);
                        break;
                    case "divide":
                        try {
                            resultado = calc.divide(n1, n2);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operacao invalida!");
                        continue;
                }

                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter os numeros. Certifique-se de que os numeros estao no formato correto.");
            }

            System.out.println("Deseja realizar outra operação? (sim/nao): ");
            continuar = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
