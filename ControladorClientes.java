/******************************************************************************/
/*                         DNS Manutenções - 2018                             */
/******************************************************************************/

package dns.manutenções.control;

import dns.manutenções.model.Cliente;
import dns.manutenções.model.Empresa;
import dns.manutenções.model.Pessoa;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author danie_000
 */
public class ControladorClientes
{
    private ArrayList<Cliente> clientes;
    private ArrayList<Empresa> empresasClientes;
    private ArrayList<Pessoa> pessoasClientes;
    
    public ControladorClientes()
    {
        this.clientes = new ArrayList();
        this.empresasClientes = new ArrayList();
        this.pessoasClientes = new ArrayList();
    }
    
    @SuppressWarnings("UseOfObsoleteCollectionType")
    public ArrayList getClientes()
    {
        return this.clientes;
    }
    
    public void atualizarListaClientes()
    {
        clientes.clear();
        clientes.addAll(empresasClientes);
        clientes.addAll(pessoasClientes);
    }
    
    //Pessoas ------------------------------------------------------------------
    
    public ArrayList<Pessoa> getPessoasClientes()
    {
        return pessoasClientes;
    } 
    
    public Pessoa getPessoa(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return ControladorClientes.this.getPessoasClientes().get(i);
            }
        }
        return null;
    }
    
    public boolean validarCPF(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public String getNomePessoas(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return ControladorClientes.this.getPessoasClientes().get(i).getNome();
            }
        }
        return null;
    }
    
    public String getEnderecoPessoas(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return ControladorClientes.this.getPessoasClientes().get(i).getEndereco();
            }
        }
        return null;
    }
    
    public String getTelefonePessoas(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return ControladorClientes.this.getPessoasClientes().get(i).getTelefone();
            }
        }
        return null;
    }
    
    public String getEmailPessoas(String cpf)
    {
        for(int i=0;i<pessoasClientes.size();i++)
        {
            if(pessoasClientes.get(i).getCpf().compareTo(cpf)==0)
            {
                return ControladorClientes.this.getPessoasClientes().get(i).getEmail();
            }
        }
        return null;
    }
    
    public boolean CadastrarPessoa(String cpf, String email, String nome, String endereco, String telefone)
    {
        if(!validarCPF(cpf))
        {
            Pessoa p = new Pessoa(cpf,email,nome,endereco,telefone);
            pessoasClientes.add(p);
            
            return true;
        }
        
        return false;
    }
    
    public boolean CadastrarPessoa(Pessoa p)
    {
        if(!validarCPF(p.getCpf()))
        {
            Pessoa g = p;
            pessoasClientes.add(p);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarPessoa(Pessoa p, String email, String endereco, String telefone)
    {
       p.setEmail(email);
       p.setEndereco(endereco);
       p.setTelefone(telefone);
    }
    
    public void ExcluirPessoa(Pessoa p)
    {
        pessoasClientes.remove(p);
    }
    
    
    //Empresas -----------------------------------------------------------------
    
    public ArrayList<Empresa> getEmpresasClientes()
    {
        return empresasClientes;
    }
    
    public Empresa getEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i);
            }
        }
        return null;
    }
    
    public boolean validarCNPJ(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public String getNomeEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i).getNome();
            }
        }
        return null;
    }
    
    public String getEnderecoEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i).getEndereco();
            }
        }
        return null;
    }
    
    //@
    public String getTelefoneEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i).getTelefone();
            }
        }
        return null;
    }
    
    public String getEmailEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i).getEmail();
            }
        }
        return null;
    }
    
    public String getContatoEmpresa(String cnpj)
    {
        for(int i=0;i<empresasClientes.size();i++)
        {
            if(empresasClientes.get(i).getCnpj().compareTo(cnpj)==0)
            {
                return getEmpresasClientes().get(i).getContato();
            }
        }
        return null;
    }

    public boolean CadastrarEmpresa(String cnpj, String contato, String email, String nome, String endereco, String telefone)
    {
        if(!validarCNPJ(cnpj))
        {
            Empresa e = new Empresa(cnpj,contato,email,nome,endereco,telefone);
            empresasClientes.add(e);
            
            return true;
        }
        
        return false;
    }
    
    public boolean CadastrarEmpresa(Empresa e)
    {
        if(!validarCNPJ(e.getCnpj()))
        {
            Empresa g = e;
            empresasClientes.add(e);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarEmpresa(Empresa e, String contato, String email, String endereco, String telefone)
    {
       e.setContato(contato);
       e.setEmail(email);
       e.setEndereco(endereco);
       e.setTelefone(telefone);
    }
    
    public void ExcluirEmpresa(Empresa e)
    {
        empresasClientes.remove(e);
    }
}
