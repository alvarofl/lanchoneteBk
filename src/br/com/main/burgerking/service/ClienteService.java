package service;

// Importa a classe ClienteModel que representa o cliente
import model.ClienteModel;

// Importa o repository responsável por salvar/buscar clientes
import repository.ClienteRepository;

// Importa List para trabalhar com listas
import java.util.List;

// Importa Optional para evitar retornar null
import java.util.Optional;

// Importa UUID para gerar identificadores únicos
import java.util.UUID;

// Classe responsável pelas regras de negócio do cliente
public class ClienteService {

    // Cria um atributo privado e imutável do tipo ClienteRepository
    // Esse repository será usado para salvar e buscar clientes
    private final ClienteRepository clienteRepository;

    // Construtor da classe
    public ClienteService() {

        // Inicializa o repository
        // Aqui estamos criando uma nova instância
        this.clienteRepository = new ClienteRepository();
    }

    // Método responsável por cadastrar um cliente
    // Retorna o cliente criado
    public ClienteModel cadastrarCliente(String nome, String email) {

        // Valida se o email já existe
        validarEmailDuplicado(email);

        // Cria um novo cliente
        ClienteModel cliente = new ClienteModel(

                // Gera um ID único
                UUID.randomUUID(),

                // Nome do cliente
                nome,

                // Email do cliente
                email,

                // Pontos iniciais
                0
        );

        // Salva o cliente no repository
        clienteRepository.salvar(cliente);

        // Retorna o cliente criado
        return cliente;
    }

    // Busca um cliente pelo email
    public Optional<ClienteModel> buscarPorEmail(String email) {

        // Delegando a busca para o repository
        return clienteRepository.buscarPorEmail(email);
    }

    // Retorna todos os clientes cadastrados
    public List<ClienteModel> listarClientes() {

        // Chama o método do repository
        return clienteRepository.listarTodos();
    }

    // Método privado usado para validar email duplicado
    private void validarEmailDuplicado(String email) {

        // Busca cliente pelo email
        Optional<ClienteModel> clienteExistente =
                clienteRepository.buscarPorEmail(email);

        // Verifica se encontrou algum cliente
        if (clienteExistente.isPresent()) {

            // Lança exceção caso o email já exista
            throw new IllegalArgumentException(
                    "Email já cadastrado"
            );
        }
               }
}