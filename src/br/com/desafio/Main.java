package br.com.desafio;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Vanessa");
        cliente1.setCodigo(Integer.parseInt("1111"));

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Camila");
        cliente2.setCodigo(Integer.parseInt("2222"));

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua A");
        endereco1.setNumero(11);
        endereco1.setComplemento("Ap. 1");
        endereco1.setBairro("Bairro A");
        endereco1.setCidade("São Paulo");
        endereco1.setEstado("SP");

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua B");
        endereco2.setNumero(22);
        endereco2.setComplemento("Ap. 2");
        endereco2.setBairro("Bairro B");
        endereco2.setCidade("São Paulo");
        endereco2.setEstado("SP");


        System.out.println("Cliente: " + cliente1 + "\nEndereço: " + endereco1);
        System.out.println("\n------------\n");
        System.out.println("Cliente: " + cliente2 + "\nEndereço: " + endereco2);


    }
}
