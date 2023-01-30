package br.com.senaitagua.sa1.app1;
import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculoBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1,valor2;
		JOptionPane.showMessageDialog(null, "Empresa Voe - Grupo empresarial");
		
		// Entrada de Dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do primeiro avião"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("digite o valor do primeiro avião"));
		
		// Passar uma mensagem (método) para o objeto
		CalculoBO cbo = new CalculoBO();
		
		// Utilizar o objeto
		
		
		JOptionPane.showMessageDialog(null, "Valor da soma dos aviões: " + cbo.somar(valor1, valor2));
		

	}

}
