import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i<1; i++){

            List<Endereco> enderecos = new ArrayList<>();

            System.out.println("digite um nome: ");
            String nome = scan.next();
            System.out.println("digite uma idade");
            int idade = scan.nextInt();
            System.out.println("quantos enderecos: ");
            int qntEndereco = scan.nextInt();

            for (int j =0; j<qntEndereco; j++){
                System.out.println("digite um endereco");

                System.out.println("rua:");
                String rua = scan.next();

                System.out.println("numero");
                int numero = scan.nextInt();

                enderecos.add(new Endereco(rua,numero));

            }
            System.out.println(enderecos);

            pessoas.add(new Pessoa(nome,idade,enderecos));
//            enderecos.clear();
        }

        System.out.println(pessoas.get(0).getEnderecos());

        for (int i=0;i<pessoas.size();i++){
            System.out.println(pessoas.get(i).getNome());
            System.out.println(pessoas.get(i).getIdade());
            for (int j=0;j<pessoas.get(i).getEnderecos().size();j++){
                System.out.println(pessoas.get(i).getEnderecos().get(j).getRua());
                System.out.println(pessoas.get(i).getEnderecos().get(j).getNumero());
            }
        }


    }
}