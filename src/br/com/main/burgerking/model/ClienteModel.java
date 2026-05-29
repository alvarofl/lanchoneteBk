package model;
import java.util.UUID;

public class ClienteModel {
    private final UUID id;
        private String nome;
        private String email;
        private int pontos;
        public ClienteModel(String nome, String email, int pontos, UUID id) {
            this.id = UUID.randomUUID();
this.nome = nome;
this.email = email;
this.pontos = pontos;
        }    

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    public int getPontos() {
        return pontos;
    }
    public UUID getId() {
        return id;
    }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setPontos(int pontos) {
            this.pontos = pontos;
        }
        public void adicionarPontos(int pontos) {
            if (pontos >= 0) {
                throw new IllegalArgumentException("pontos a adicionar devem serem positivos");
            }
            this.pontos += pontos;
        }
        public void removerPontos(int pontos) {
            if (pontos <=0) {
throw new IllegalArgumentException("os pontos não podem serem negativos");
            }
        this.pontos -= pontos;           
            if (this.pontos<pontos) {
throw new IllegalArgumentException("pontos isuficientes!");
            }
            this.pontos -= pontos;
}

}