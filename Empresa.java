/*
 * SERVICOS DE MANUTENCAO
 */
package dns.manutenções.model;
/**
 *
 * @author danie_000
 */
public class Empresa extends Cliente
{
    private final String cnpj; //unico
    private String contato;
    
    @Override
    public String toString()
    {
        return this.cnpj + "\t  -  " + this.getNome() + "\t    tel: " + this.getTelefone() + "\t    " + this.getContato() + "\t    " + this.getEndereco();
    }
    
    public String getCnpj()
    {
        return cnpj;
    }

    public String getContato()
    {
        return contato;
    }

    public void setContato(String contato)
    {
        this.contato = contato;
    }

    public Empresa(String cnpj, String contato, String email, String nome, String endereco, String telefone)
    {
        super(email, nome, endereco, telefone,1);
        this.cnpj = cnpj;
        this.contato = contato;
    }
}
