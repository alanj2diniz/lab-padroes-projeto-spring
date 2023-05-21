package one.digitalinnovation.gof.model;

public class Telefone {

    private Integer ddd;

    private String numero;

    public Telefone() {
    }

    public Telefone(Integer ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public Integer getDdd() {
        return this.ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
   

    @Override
    public String toString() {
        return "{" +
            " ddd='" + getDdd() + "'" +
            ", numero='" + getNumero() + "'" +
            "}";
    }

}
