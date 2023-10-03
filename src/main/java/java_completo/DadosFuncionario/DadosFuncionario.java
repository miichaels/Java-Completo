package java_completo.DadosFuncionario;

public class DadosFuncionario {
public String nome;
public double salarioBruto;
public double imposto;

public double salarioLiquido(){
    return salarioBruto - imposto;
}

public void  aumentarSalario(double porcentagem){
    salarioBruto += salarioBruto * porcentagem / 100.0;
}

public String toString(){
    return nome + ", $ " + String.format("%.2f", salarioLiquido());
}







}

