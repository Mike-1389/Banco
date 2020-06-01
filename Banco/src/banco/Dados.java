
package banco;

import javax.swing.JOptionPane;

public class Dados {
    public int numConta;
    public int agencia;
    private String senha;
    boolean logado= false;
    String nome;
    private double saldo;

    
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta (int numConta){
    this.numConta=numConta;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setAgencia (int agencia){
    this.agencia=agencia;
    }
    
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
      public String getSenha(){
    return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    
     public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
            }
     public boolean isLogado() {
        return logado;
    }
    public void setLogado(boolean logado) {
        this.logado = logado;
            }
    public boolean logar(int agencia, int numConta, String senha){
        if (agencia == 1234 && numConta == 1 &&  "abc123".equals(senha)){
        this.logado= true;
    atual(this.logado);
        }
        else{
           JOptionPane.showMessageDialog (null,"DADOS INCORRETOS!");       
               this.logado=false;  
        }
        return this.logado;
    }
    public void atual(boolean logado){
    if (logado== true){
    int opcao;
    opcao= Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
    +"1- Deposito\n"
    +"2-Saque\n"
    +"3-Ver Saldo\n"
    +"4-Sair\n"));
    switch(opcao){
        case 1:
    depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: ")), this.logado);
    break;
      case 2:
    sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")), this.logado);
    break;
      case 3:
    consultarSaldo(this.logado);
    break;
      case 4:
   JOptionPane.showMessageDialog(null,"OBRIGADO!\n"+ "VOLTE SEMPRE!");
          System.exit(0);
          break;
     default:
JOptionPane.showMessageDialog(null,"Opção Inválida!");    
    }
    }
    }
  public void depositar(double valor, boolean logado){
      this.saldo= this.saldo+ valor;
       JOptionPane.showMessageDialog(null,"Saldo atualizado:"+"R$ "+getSaldo());
      String opcao;
      opcao=JOptionPane.showInputDialog("Deseja realizar outra operação?\n"+
              "S-Sim\n"+
              "N-Não");
      switch (opcao){
          case "S":
              atual(this.logado);
              break;
              case "N":
            JOptionPane.showMessageDialog(null,"OBRIGADO\n"+"VOLTE SEMPRE!");
            System.exit(0);
              break;
              default:
            JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            break;
          }
        }
public void consultarSaldo(boolean logado){
JOptionPane.showMessageDialog(null,"O saldo atual de sua conta é: "+ "R$ "+
        getSaldo());
String opcao;
  opcao=JOptionPane.showInputDialog("Deseja realizar outra operação?\n"+
              "S-Sim\n"+
              "N-Não");
      switch (opcao){
          case "S":
              atual(this.logado);
              break;
              case "N":
            JOptionPane.showMessageDialog(null,"OBRIGADO\n"+"VOLTE SEMPRE!");
            System.exit(0);
              break;
              default:
            JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            break;
}
}
public void sacar(double valor, boolean logado){
    if (valor> this.saldo){
     JOptionPane.showMessageDialog(null,"Saldo Insuficiente para retirar");
    }
    else{
    this.saldo= this.saldo- valor;
 JOptionPane.showMessageDialog(null,"Saldo atualizado:"+"R$ "+getSaldo());
}
    String opcao;
  opcao=JOptionPane.showInputDialog("Deseja realizar outra operação?\n"+
              "S-Sim\n"+
              "N-Não");
      switch (opcao){
          case "S":
              atual(this.logado);
              break;
              case "N":
            JOptionPane.showInputDialog(null,"OBRIGADO\n"+"VOLTE SEMPRE!");
            System.exit(0);
              break;
              default:
            JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            break;
}
}
}      
            
            
  
