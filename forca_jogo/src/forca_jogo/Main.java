package forca_jogo;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog(null, "Insira a quantidade de letras da sua palavra para jogar o jogo da forca.");
		int a1 = Integer.parseInt(a);
		
		String palavra[] = new String[a1];
			
			for(int i = 0; i < a1; i++) {
				palavra[i] = JOptionPane.showInputDialog(null, "Insira letra por letra da palavra.");
			}
			
			String tentativa = JOptionPane.showInputDialog(null, "Jogador, insira uma letra, a palavra escolhida tem " + a1 + " caracteres.");
			
			
			
			String a2 = String.join(", ", palavra);
			JOptionPane.showMessageDialog(null, a2);
			
	}
}