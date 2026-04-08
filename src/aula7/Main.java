import aula7.Cliente;

void main() {
    ArrayList<Cliente> clientes = new ArrayList<>();

    boolean desejaSair = false;

    while (!desejaSair) {
        int opcaoEscolhida = menu();

        switch (opcaoEscolhida) {
            case 1:
                salvarCliente(clientes);
                break;
            case 2:
                listarClientes(clientes);
                break;
            case 3:
                removerCliente(clientes);
                break;
            case 5:
                desejaSair = true;
        }

    }
}

public void salvarCliente(ArrayList<Cliente> clientes) {
    String nome = IO.readln("Digite o nome do cliente: ");
    String cpf = IO.readln("Digite o cpf: ");
    Float saldo = 0f;

    Cliente cliente = new Cliente(nome, cpf, saldo);
    clientes.add(cliente);
    System.out.println("Cliente salvo com sucesso!");

}

public void listarClientes(ArrayList<Cliente> clientes) {
    for (int i = 0; i < clientes.size(); i++) {
        System.out.println(clientes.get(i));


    }
}

public void removerCliente(ArrayList<Cliente> clientes) {
    for (int i = 0; i < clientes.size(); i++) {


    }
}
public int menu() {
    System.out.println("Digite uma das opções abaixo: ");
    System.out.println("1 = Adicionar novo cliente");
    System.out.println("2 = Listar clientes");
    System.out.println("3 = Remover cliente");
    System.out.println("4 = Editar cliente");
    System.out.println("5 = Sair");

    int opcaoEscolhida = Integer.parseInt(IO.readln());
    return opcaoEscolhida;

}
