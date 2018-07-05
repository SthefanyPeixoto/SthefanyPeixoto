/*
 * SERVICOS DE MANUTENCAO
 */
package dns.manutenções.model;

import java.util.ArrayList;

/**
 *
 * @author danie_000
 */
public class Servico
{
    private int estado; //1 - concluído; 0 - em andamento; -1 - cancelado
    private float valor;
    private float desconto;
    private final Cliente cliente;
    private Funcionario funcionario;
    private ArrayList pecas;
    private String data;

    @Override
    public String toString()
    {
        return this.data + "  -  " + this.cliente.getNome() + "   Estado: " + estado + "\t   R$ " + this.valor;
    }
    
    public float getValor()
    {
        return valor;
    }

    public String getData()
    {
        return data;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public Funcionario getFuncionario()
    {
        return funcionario;
    }

    public ArrayList getPecas()
    {
        return pecas;
    }

    public int getEstado()
    {
        return estado;
    }

    public float getDesconto()
    {
        return desconto;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public void setPecas(ArrayList pecas)
    {
        this.pecas = pecas;
    }

    public void setEstado(int estado)
    {
        this.estado = estado;
    }

    public void setDesconto(float desconto)
    {
        this.desconto = desconto;
    }
    
    public void setFuncionario(Funcionario funcionario)
    {
        this.funcionario = funcionario;
    }

    public Servico(float valor, String data, Cliente cliente, Funcionario funcionario, int estado)
    {
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.estado = estado;
    }
}
