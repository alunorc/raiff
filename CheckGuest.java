// CheckGuest.java
// Script para verificar se um nome está na lista de convidados.

import java.util.*;

public class CheckGuest {
    public static void main(String[] args) {
        // Lista de convidados autorizados
        List<String> guestList = Arrays.asList("Alice", "Bob", "Charlie", "Diana", "Jimmy", "Marry", "Rafael");

        // Cria um scanner para ler o nome do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do convidado: ");
        String name = scanner.nextLine();

        // Verifica se o nome está na lista de convidados
        if (guestList.contains(name)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        // Faz um scanner para receber a variável idade
        Scanner ent = new Scanner(System.in);
        int idade;

        // Recebe número
        System.out.println("Convidado, digite sua idade:");
        idade = ent.nextInt();

        // Um if else para calcular e mostrar a idade
        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
             }
        

        // Fecha o scanner
        scanner.close();
    }
}
