/******************************************************************************/
/*                         DNS Manutenções - 2018                             */
/******************************************************************************/

package dns.manutenções.control;


import dns.manutenções.model.Cliente;
import dns.manutenções.model.DNSmanutencoes;
import dns.manutenções.model.Funcionario;
import dns.manutenções.model.Peca;
import dns.manutenções.model.Servico;
import java.util.ArrayList;
/*
 * @author danie_000
 */
public class Controlador
{
    private ArrayList<Servico> servicos;
    
    private ControladorPecas pecas;
    private ControladorClientes clientes;
    private ControladorFuncionarios funcionarios;
    
    private DNSmanutencoes we;
    
    public Controlador()
    {
        this.we = DNSmanutencoes.newDNS();
        this.servicos = new ArrayList(0);
        this.pecas = new ControladorPecas();
        this.clientes = new ControladorClientes();
        this.funcionarios = new ControladorFuncionarios();
    }

    public float setValorTotal(Funcionario funcionario, ArrayList<Peca> pecas)
    {
        float total = (5*funcionario.getSalario());
        
        for(Peca p : pecas)
        {
            total += p.getValor();
        }
        
        return total;
    }
    
    
    public ArrayList<Servico> getServicos()
    {
        return servicos;
    }
    public boolean busrcarEstado(Servico servico)
    {
        if(servico.getEstado()==0)
        {
            return true;
        }
        return false;       
    }
    public Funcionario buscarFuncionarioServico(Servico servico)
    {
        return servico.getFuncionario();        
    }

    public Cliente buscarClienteServico(Servico servico)
    {
         return servico.getCliente();
    }
    
    public ArrayList buscarPecaServico(Servico servico)
    {
         return servico.getPecas();
    }
    
    public String buscarData(Servico servico)
    {
        return servico.getData();
    }
    
    public float buscarValor(Servico servico)
    {
        return servico.getValor();
    }
    
    public void alterarServico(Servico servico,float valor, String data, Funcionario funcionario, ArrayList<Peca> pecas)
    {
        servico.setValor(valor);
        servico.setData(data);
        servico.setFuncionario(funcionario);
        servico.setPecas(pecas);
    }
    
    public void cadastrarServico(float valor, String data, Cliente cliente, Funcionario funcionario, ArrayList<Peca> pecas)
    {
        Servico servico = new Servico(valor,data,cliente,funcionario,0);
        
        servico.setPecas(pecas);
        this.servicos.add(servico);
    }
    
    public boolean realizarServico(Servico servico)
    {
        if(servico.getEstado()==0)
        {    
            servico.setEstado(1);
            
            we.addSaldo(servico.getValor());
        
            return true;
        }
        
        return false;
    }
    
    public boolean cancelarServico(Servico servico)
    {
        if(servico.getEstado()==0)
        {
            servico.setEstado(-1);
            
            return true;
        }
        
        return false;
    }
    
    public int getNumServicosPendentes()
    {
        int ac = 0;
                
        for(Servico s : servicos)
        {
            if(s.getEstado()==0)
            {
                ac+=1;
            }
        }
        
        return ac;
    }
    
    public int getNumServicosConcluidos()
    {
        int ac = 0;
                
        for(Servico s : servicos)
        {
            if(s.getEstado()==1)
            {
                ac+=1;
            }
        }
        
        return ac;
    }
    
    public float TotalArrecadado()
    {
        float total=0;
        for(Servico s: servicos)
        {
            if(s.getEstado()==1)
            {
                total=total+s.getValor();
            }
        }
        return total;
    }
    
    public float TotalAindaNaoArrecadado()
    {
        float total=0;
        for(Servico s: servicos)
        {
            if(s.getEstado()==0)
            {
                total=total+s.getValor();
            }
        }
        return total;
    }
    public float getGasto(Funcionario funcionario, ArrayList<Peca> pecas)
    {
        float total = funcionario.getSalario();
        
        for(Peca p : pecas)
        {
            total += p.getValor();
        }
        
        return total;
    }
    public float TotalGasto()
    {
        float total=0;
        for(Servico s: servicos)
        {
            if(s.getEstado()==1)
            {
               total=total+getGasto(s.getFuncionario(),s.getPecas()); 
            }
        }
        return total;
    }
   
    //Controllers --------------------------------------------------------------
    
    public ControladorPecas ctrlPecas()
    {
        return this.pecas;
    }
    
    public ControladorClientes ctrlClientes()
    {
        return this.clientes;
    }
    
    public ControladorFuncionarios ctrlFuncionarios()
    {
        return this.funcionarios;
    }
    
    public DNSmanutencoes getWe()
    {
        return this.we;
    }
}
