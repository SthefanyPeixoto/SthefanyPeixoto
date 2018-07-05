/******************************************************************************/
/*                         DNS Manutenções - 2018                             */
/******************************************************************************/

package dns.manutenções.view;

import dns.manutenções.control.Controlador;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author danie_000
 */
public class EmpresasPanel extends javax.swing.JPanel
{
    @SuppressWarnings("FieldMayBeFinal")
    private Controlador control;
    
    DefaultListModel listModel = new DefaultListModel();
    
    /**
     * Creates new form EmpresasPanel
     * @param c
     */
    public EmpresasPanel(Controlador c)
    {
        this.control = c;
        initComponents();
    }
    
    public void atualizarLista()
    {
        listModel.clear();
        
        for(int i = 0; i < control.ctrlClientes().getEmpresasClientes().size(); i++) 
        {
            listModel.addElement(control.ctrlClientes().getEmpresasClientes().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        BotaoAlterare = new javax.swing.JButton();
        BotaoExcluire = new javax.swing.JButton();
        BotaoSalvare = new javax.swing.JButton();
        BotaoLimpare = new javax.swing.JButton();
        BotaoCadastrare = new javax.swing.JButton();
        TextoContato = new javax.swing.JTextField();
        TextoEmailEmpresa = new javax.swing.JTextField();
        TextoTelefoneEmpresa = new javax.swing.JTextField();
        TextoEnderecoEmpresa = new javax.swing.JTextField();
        TextoNomeEmpresa = new javax.swing.JTextField();
        TextoCnpj = new javax.swing.JTextField();
        ScrollPanelClientesp1 = new javax.swing.JScrollPane();
        ListaClientespe = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(595, 322));
        setMinimumSize(new java.awt.Dimension(595, 322));
        setPreferredSize(new java.awt.Dimension(595, 322));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotaoAlterare.setText("Alterar");
        BotaoAlterare.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaoAlterareActionPerformed(evt);
            }
        });
        add(BotaoAlterare, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 120, 62));

        BotaoExcluire.setText("Excluir");
        BotaoExcluire.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaoExcluireActionPerformed(evt);
            }
        });
        add(BotaoExcluire, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 120, 62));

        BotaoSalvare.setText("Salvar");
        BotaoSalvare.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaoSalvareActionPerformed(evt);
            }
        });
        add(BotaoSalvare, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 120, 60));

        BotaoLimpare.setText("Limpar");
        BotaoLimpare.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaoLimpareActionPerformed(evt);
            }
        });
        add(BotaoLimpare, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, 60));

        BotaoCadastrare.setText("Cadastrar");
        BotaoCadastrare.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrare.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BotaoCadastrareActionPerformed(evt);
            }
        });
        add(BotaoCadastrare, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 120, 60));

        TextoContato.setMaximumSize(new java.awt.Dimension(6, 20));
        add(TextoContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 330, 30));

        TextoEmailEmpresa.setMaximumSize(new java.awt.Dimension(6, 20));
        add(TextoEmailEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 330, 30));

        TextoTelefoneEmpresa.setMaximumSize(new java.awt.Dimension(6, 20));
        add(TextoTelefoneEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 330, 30));

        TextoEnderecoEmpresa.setMaximumSize(new java.awt.Dimension(6, 20));
        add(TextoEnderecoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 330, 30));

        TextoNomeEmpresa.setMaximumSize(new java.awt.Dimension(6, 20));
        add(TextoNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 330, 30));

        TextoCnpj.setMaximumSize(new java.awt.Dimension(6, 20));
        TextoCnpj.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TextoCnpjActionPerformed(evt);
            }
        });
        add(TextoCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 330, 30));

        ListaClientespe.setModel(listModel);
        ListaClientespe.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                ListaClientespeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                ListaClientespeFocusLost(evt);
            }
        });
        ListaClientespe.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                ListaClientespeComponentShown(evt);
            }
        });
        ScrollPanelClientesp1.setViewportView(ListaClientespe);

        add(ScrollPanelClientesp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 430, 130));

        jButton1.setText("CNPJ");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jButton2.setText("Nome");
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setRolloverEnabled(false);
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, -1));

        jButton3.setText("Endereço");
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverEnabled(false);
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        jButton4.setText("Telefone");
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setRolloverEnabled(false);
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        jButton5.setText("E-mail");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.setRolloverEnabled(false);
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));

        jButton6.setText("Contato");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setRolloverEnabled(false);
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoAlterareActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoAlterareActionPerformed
    {//GEN-HEADEREND:event_BotaoAlterareActionPerformed
        if(control.ctrlClientes().validarCNPJ(TextoCnpj.getText()))
        {
            TextoCnpj.setEnabled(false);
            TextoNomeEmpresa.setEnabled(false);
            TextoNomeEmpresa.setText(control.ctrlClientes().getNomeEmpresa(TextoCnpj.getText()));
            TextoEnderecoEmpresa.setText(control.ctrlClientes().getEnderecoEmpresa(TextoCnpj.getText()));
            TextoTelefoneEmpresa.setText(control.ctrlClientes().getTelefoneEmpresa(TextoCnpj.getText()));
            TextoEmailEmpresa.setText(control.ctrlClientes().getEmailEmpresa(TextoCnpj.getText()));
            TextoContato.setText(control.ctrlClientes().getContatoEmpresa(TextoCnpj.getText()));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não existe Cliente com esse CNPJ");
        }
    }//GEN-LAST:event_BotaoAlterareActionPerformed

    private void BotaoExcluireActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoExcluireActionPerformed
    {//GEN-HEADEREND:event_BotaoExcluireActionPerformed
        if(control.ctrlClientes().validarCNPJ(TextoCnpj.getText()))
        {
            control.ctrlClientes().ExcluirEmpresa(control.ctrlClientes().getEmpresa(TextoCnpj.getText()));
            listModel.removeElement(control.ctrlClientes().getNomeEmpresa(TextoCnpj.getText()));
            atualizarLista();
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não existe Cliente com esse CNPJ");
        }
        
        TextoCnpj.setText("");
    }//GEN-LAST:event_BotaoExcluireActionPerformed

    private void BotaoSalvareActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoSalvareActionPerformed
    {//GEN-HEADEREND:event_BotaoSalvareActionPerformed
        TextoCnpj.setEnabled(true);
        TextoNomeEmpresa.setEnabled(true);

        if((!"".equals(TextoCnpj.getText()))&&(!"".equals(TextoEmailEmpresa.getText()))&&(!"".equals(TextoNomeEmpresa.getText()))&&(!"".equals(TextoEnderecoEmpresa.getText()))&&(!"".equals(TextoTelefoneEmpresa.getText()))&&(!"".equals(TextoContato.getText())))
        {
            control.ctrlClientes().AlterarEmpresa(control.ctrlClientes().getEmpresa(TextoCnpj.getText()),TextoContato.getText(),TextoEmailEmpresa.getText(),TextoEnderecoEmpresa.getText(),TextoTelefoneEmpresa.getText());
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso!");
        }
        else
            JOptionPane.showMessageDialog(null,"Não foi possivel alterar pois há campos vazios!");

        TextoCnpj.setText("");
        TextoEmailEmpresa.setText("");
        TextoNomeEmpresa.setText("");
        TextoEnderecoEmpresa.setText("");
        TextoTelefoneEmpresa.setText("");
        TextoContato.setText("");
    }//GEN-LAST:event_BotaoSalvareActionPerformed

    private void BotaoLimpareActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoLimpareActionPerformed
    {//GEN-HEADEREND:event_BotaoLimpareActionPerformed
        TextoCnpj.setText("");
        TextoEmailEmpresa.setText("");
        TextoNomeEmpresa.setText("");
        TextoEnderecoEmpresa.setText("");
        TextoTelefoneEmpresa.setText("");
        TextoContato.setText("");
        TextoCnpj.setEnabled(true);
        TextoNomeEmpresa.setEnabled(true);
    }//GEN-LAST:event_BotaoLimpareActionPerformed

    private void BotaoCadastrareActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoCadastrareActionPerformed
    {//GEN-HEADEREND:event_BotaoCadastrareActionPerformed
        // TODO add your handling code here:
        if((!"".equals(TextoCnpj.getText()))&&(!"".equals(TextoEmailEmpresa.getText()))&&(!"".equals(TextoNomeEmpresa.getText()))&&(!"".equals(TextoEnderecoEmpresa.getText()))&&(!"".equals(TextoTelefoneEmpresa.getText()))&&(!"".equals(TextoContato.getText())))
        {
            if(control.ctrlClientes().CadastrarEmpresa(TextoCnpj.getText( ),TextoContato.getText(),TextoEmailEmpresa.getText(),TextoNomeEmpresa.getText(),TextoEnderecoEmpresa.getText(),TextoTelefoneEmpresa.getText()))
            {
                atualizarLista();
                JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
            }

            else
            {
                System.out.println("Erro ao cadastrar");
                JOptionPane.showMessageDialog(null,"Ja existe Cliente com esse CNPJ");
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Não foi possivel Cadastrar, pois ha campos vazios!");
        
        TextoCnpj.setText("");
        TextoEmailEmpresa.setText("");
        TextoNomeEmpresa.setText("");
        TextoEnderecoEmpresa.setText("");
        TextoTelefoneEmpresa.setText("");
        TextoContato.setText("");
    }//GEN-LAST:event_BotaoCadastrareActionPerformed

    private void TextoCnpjActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextoCnpjActionPerformed
    {//GEN-HEADEREND:event_TextoCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCnpjActionPerformed

    private void ListaClientespeFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_ListaClientespeFocusGained
    {//GEN-HEADEREND:event_ListaClientespeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaClientespeFocusGained

    private void ListaClientespeFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_ListaClientespeFocusLost
    {//GEN-HEADEREND:event_ListaClientespeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaClientespeFocusLost

    private void ListaClientespeComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_ListaClientespeComponentShown
    {//GEN-HEADEREND:event_ListaClientespeComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaClientespeComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterare;
    private javax.swing.JButton BotaoCadastrare;
    private javax.swing.JButton BotaoExcluire;
    private javax.swing.JButton BotaoLimpare;
    private javax.swing.JButton BotaoSalvare;
    private javax.swing.JList ListaClientespe;
    private javax.swing.JScrollPane ScrollPanelClientesp1;
    private javax.swing.JTextField TextoCnpj;
    private javax.swing.JTextField TextoContato;
    private javax.swing.JTextField TextoEmailEmpresa;
    private javax.swing.JTextField TextoEnderecoEmpresa;
    private javax.swing.JTextField TextoNomeEmpresa;
    private javax.swing.JTextField TextoTelefoneEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
