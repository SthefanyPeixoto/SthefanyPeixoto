/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dns.manutenções.model;

/**
 *
 * @author danie_000
 */
public class DNSmanutencoes
{
    private static DNSmanutencoes instance;
    
    private float saldo = 0;
    private int numFuncionarios = 0;
    private int numClientes = 0;
    private int numServicosPendentes = 0;
    private int numServicosConcluidos = 0;
    
    public static DNSmanutencoes newDNS()
    {
        if(instance==null)
        {
            instance = new DNSmanutencoes();
        }
        
        return instance;
    }

    public static DNSmanutencoes getInstance()
    {
        return instance;
    }

    public static void setInstance(DNSmanutencoes instance)
    {
        DNSmanutencoes.instance = instance;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    
    public void addSaldo(float saldo)
    {
        this.saldo += saldo;
    }
    
    public void subSaldo(float saldo)
    {
        this.saldo -= saldo;
    }

    public int getNumFuncionarios()
    {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios)
    {
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumClientes()
    {
        return numClientes;
    }

    public void setNumClientes(int numClientes)
    {
        this.numClientes = numClientes;
    }

    public int getNumServicosPendentes()
    {
        return numServicosPendentes;
    }

    public void setNumServicosPendentes(int numServicosPendentes)
    {
        this.numServicosPendentes = numServicosPendentes;
    }

    public int getNumServicosConcluidos()
    {
        return numServicosConcluidos;
    }

    public void setNumServicosConcluidos(int numServicosConcluidos)
    {
        this.numServicosConcluidos = numServicosConcluidos;
    }
    
    private DNSmanutencoes()
    {
        //Singleton
    }
}
