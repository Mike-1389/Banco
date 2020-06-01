
package banco;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Banco {
   
    public static void main(String[] args) {
      Dados dados= new Dados();
  dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua agência: ")));
    dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua conta: ")));
     dados.setSenha(JOptionPane.showInputDialog("Digite a sua senha: "));
     dados.logar(dados.getAgencia(),dados.getNumConta(),dados.getSenha());
     
    
    }
}
