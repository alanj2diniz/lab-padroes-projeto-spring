package one.digitalinnovation.gof.builder;

import java.util.ArrayList;
import java.util.List;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Telefone;

public class ClienteBuilder {

    private Cliente cliente;
    private List<Telefone> telefones;

    public ClienteBuilder() {
        this.cliente = new Cliente();
        this.telefones = new ArrayList<>();
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public ClienteBuilder addNome(String nome, String sobrenome) {
        this.cliente.setNome(nome);
        this.cliente.setSobrenome(sobrenome);
        return this;
    }

    public ClienteBuilder addEmail(String email) {
        this.cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder addTelefone(Integer ddd, String telefone) {
        this.telefones.add(new Telefone(ddd, telefone));
        return this;
    }

    public Cliente get(){  
        this.cliente.setTelefones(this.telefones);
        return this.cliente;
    }

}
