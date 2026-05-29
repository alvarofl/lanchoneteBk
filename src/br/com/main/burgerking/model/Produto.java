package model;
import java.util.UUID;

public class Produto {
    private final UUID id;
    private String nomeProduto;
    private String descricao;
private double preco;
    public Produto(UUID id, String nomeProduto, String descricao, double preco) {
        this.id = UUID.randomUUID();
        this.nomeProduto = nomeProduto;
            this.descricao = descricao;
                this.preco = preco;
    }

    public UUID getId() {
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
 public void setNomeProduto(String nomeProduto) {
     this.nomeProduto = nomeProduto;
 }   
 public void setPreco(double preco) {
     this.preco = preco;
 }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void produtoInfo(){
        if (nomeProduto==null) {
            throw new IllegalArgumentException("o nome do produto não pode ser vasio");
        }
        if (descricao==null) {
            throw new IllegalArgumentException("a descrição do produto não pode ser vasia");
        }
        if (preco <= 0) {
            throw new IllegalArgumentException("o preço do produto deve ser um valor positivo");
        }
if (descricao.length()<100) {
    throw new IllegalArgumentException("a descricação do produto não conter mais 100 caracteres");

}

    }
    
}