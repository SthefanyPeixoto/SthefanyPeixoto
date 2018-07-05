/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dns.manutenções.control;

import dns.manutenções.model.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author danie_000
 */
public class ControladorFuncionarios
{
    private ArrayList<Funcionario> listaFuncionarios;
    
    public ControladorFuncionarios()
    {
        this.listaFuncionarios = new ArrayList();
    }
    
    public ArrayList<Funcionario> getListaFuncionarios()
    {
        return listaFuncionarios;
    }
    
    public boolean validaMatricula(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public Funcionario getFuncionario(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return getListaFuncionarios().get(i);
            }
        }
        return null;
    }
    
    public String getNomeFuncionario(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return getListaFuncionarios().get(i).getNome();
            }
        }
        return null;
    }
    
    public String getEndFuncionario(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return getListaFuncionarios().get(i).getEndereco();
            }
        }
        return null;
    }
    
    public String getTelFuncionario(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return getListaFuncionarios().get(i).getTelefone();
            }
        }
        return null;
    }
    
    public float getSalarioFuncionario(String matricula)
    {
        for(int i=0;i<listaFuncionarios.size();i++)
        {
            if(listaFuncionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return getListaFuncionarios().get(i).getSalario();
            }
        }
        return 0;
    }
    
    public boolean CadastrarFuncionario(String matricula, float salario, String nome, String endereco, String telefone)
    {
        if(validaMatricula(matricula))
        {
            Funcionario f = new Funcionario(matricula,salario,nome,endereco,telefone);
            listaFuncionarios.add(f);
            
            return true;
        }
        
        return false;
    }
    
    public boolean CadastrarFuncionario(Funcionario f)
    {
        if(validaMatricula(f.getMatricula()))
        {
            Funcionario g = f;
            listaFuncionarios.add(f);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarFuncionario(Funcionario f, float salario, String endereco, String telefone)
    {
       f.setSalario(salario);
       f.setEndereco(endereco);
       f.setTelefone(telefone);
    }
    
    public void ExcluirFuncionario(Funcionario f)
    {
        listaFuncionarios.remove(f);
    }
}
