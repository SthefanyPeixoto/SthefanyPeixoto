/*
 * SERVICOS DE MANUTENCAO
 */
package dns.manutenções.model;
/**
 *
 * @author danie_000
 */
public abstract class Registro
{
   private final String nome;
   private String endereco;
   private String telefone;

   @Override
    public String toString()
    {
        return this.nome;
    }
   
    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public Registro(String nome, String endereco, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
