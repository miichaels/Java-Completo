package java_completo.funcionario;

public class FuncionarioTerceiro extends Funcionario{

    private Double cobrancaAdicional;


    public FuncionarioTerceiro(){

    }
    public FuncionarioTerceiro(String nome, Integer horas, double valorPorHora, Double cobrancaAdicional) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    public Double getCobrancaAdicional() {
        return cobrancaAdicional;
    }

    public void setCobrancaAdicional(Double cobrancaAdicional) {
        this.cobrancaAdicional = cobrancaAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + cobrancaAdicional * 1.1;
    }

}
