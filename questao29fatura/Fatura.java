package questao29fatura;

public class Fatura {
    private String numId;
    private String descricao;
    private int quantidade;
    private double precoUni;

    public Fatura(String numId, String descricao, int quantidade, double precoUni) {
        this.numId = numId;
        this.descricao = descricao;
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
        if (precoUni > 0) {
            this.precoUni = precoUni;
        } else {
            this.precoUni = 0.0;
        }
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPrecoUni() {
        return precoUni;
    }

    public void setPrecoUni(double precoUni) {
        if (precoUni > 0) {
            this.precoUni = precoUni;
        } else {
            this.precoUni = 0.0;
        }
    }

    public double calculaTotal() {
        return this.quantidade * this.precoUni;
    }
}
