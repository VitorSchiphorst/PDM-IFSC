package revisao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pessoa> pessoaList = new ArrayList<>();
        String resposta;

        int esc = 0;

        do {
            System.out.println("---Escolha uma opção:---\n"
            		+ "-> cadastrar pessoas - 1\n"
            		+ "-> listar pessoas - 2\n"
            		+ "-> sair - 0: ");
            esc = Integer.parseInt(scan.nextLine());

            switch (esc) {
                case 1: {
                    System.out.println("Cadastre as pessoas ");

                    do {
                        Pessoa pes = new Pessoa();
                        Endereco end = new Endereco();

                        System.out.println("Nome: ");
                        pes.setNome(scan.nextLine());

                        System.out.println("Email: ");
                        pes.setEmail(scan.nextLine());

                        System.out.println("Telefone: ");
                        pes.setTelefone(scan.nextLine());

                        System.out.println("Nome da cidade: ");
                        end.setCidade(scan.nextLine());

                        System.out.println("Número da casa: ");
                        end.setNumero(Integer.parseInt(scan.nextLine()));

                        System.out.println("Rua: ");
                        end.setRua(scan.nextLine());

                        pes.setEndereco(end);

                        pessoaList.add(pes);

                        System.out.println("\nDeseja cadastrar mais um? (Sim/Não): ");
                        resposta = scan.nextLine();

                    } while (resposta.equalsIgnoreCase("Sim"));
                    break;
                }
                case 2: {
                    for (Pessoa pessoa : pessoaList) {
                        System.out.println("Nome: " + pessoa.getNome());
                        System.out.println("Email: " + pessoa.getEmail());
                        System.out.println("Telefone: " + pessoa.getTelefone());
                        System.out.println("Nome da cidade: " + pessoa.getEndereco().getCidade());
                        System.out.println("Rua: " + pessoa.getEndereco().getRua());
                        System.out.println("Número da casa: " + pessoa.getEndereco().getNumero());
                        System.out.println();
                    }
                    break;
                }
            }
        } while (esc != 0);
    }
}