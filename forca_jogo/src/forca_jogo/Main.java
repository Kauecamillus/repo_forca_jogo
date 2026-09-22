package forca_jogo;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog(null, "Insira a quantidade de letras da sua palavra para jogar o jogo da forca.");
		int a1 = Integer.parseInt(a);
		int vida = 7;
		int ganhar = 2;
		
		String palavra[] = new String[a1];
		String solucao[] = new String[a1];
			
			for(int i = 0; i < a1; i++) {
				palavra[i] = JOptionPane.showInputDialog(null, "Insira letra por letra da palavra.");
			}
			
			while (vida > 0 && ganhar != 1) {
			
			String tentativa = JOptionPane.showInputDialog(null, "Jogador, insira uma letra, a palavra escolhida tem " + a1 + " caracteres.");
			int posicao = -1;
			
			

			if (Arrays.equals(solucao, palavra)) {
			    ganhar = 1;
			}
			for (int i = 0; i < a1; i++) {
				if (palavra[i].equals(tentativa)) {
					solucao[i] = tentativa;
					posicao = i;
					System.out.println(java.util.Arrays.toString(solucao));

				}else {
					vida = vida - 1;
					if (vida == 0) {
						ganhar = 0;
					}
					break;
				}	
		}if (ganhar == 0) {
			System.out.println("Perdeu playboy.");
		}else if (ganhar == 1){
			System.out.println("Ganhou playboy.");
			}
		}
	}
}