/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dns.manutenções.control;

import dns.manutenções.model.Peca;
import java.util.ArrayList;

/**
 *
 * @author danie_000
 */
public class ControladorPecas
{
    private ArrayList<Peca> listaPecas;
    
    public ControladorPecas()
    {
        this.listaPecas = new ArrayList();
    }
    
    public ArrayList<Peca> getListaPecas()
    {
        return listaPecas;
    } 
    
    public boolean validarCODIGO(String codigo)
    {
        for(int i=0;i<listaPecas.size();i++)
        {
            if(listaPecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public Peca getPeca(String codigo)
    {
        for(int i=0;i<listaPecas.size();i++)
        {
            if(listaPecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return getListaPecas().get(i);
            }
        }
        return null;
    }
    
    public String getNomePecas(String codigo)
    {
        for(int i=0;i<listaPecas.size();i++)
        {
            if(listaPecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return getListaPecas().get(i).getNome();
            }
        }
        return null;
    }
    
    public float getPrecoPecas(String codigo)
    {
        for(int i=0;i<listaPecas.size();i++)
        {
            if(listaPecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return getListaPecas().get(i).getPreco();
            }
        }
        return 0;
    }
    
    public float getValorPecas(String codigo)
    {
        for(int i=0;i<listaPecas.size();i++)
        {
            if(listaPecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return getListaPecas().get(i).getValor();
            }
        }
        return 0;
    }
    
    public boolean CadastrarPeca(String codigo, String nome, float preco, float valor)
    {
        if(!validarCODIGO(codigo))
        {
            Peca p = new Peca(codigo,nome,preco,valor);
            listaPecas.add(p);
            return true;
        }
        return false;
    }
    
    public boolean CadastrarPeca(Peca p)
    {
        if(!validarCODIGO(p.getCodigo()))
        {
            Peca g = p;
            listaPecas.add(p);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarPeca(Peca p, float valor)
    {
       p.setValor(valor);
    }
    
    public void ExcluirPeca(Peca p)
    {
        listaPecas.remove(p);
    }
}
