package forca_jogo;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog(null, "Insira a quantidade de letras da sua palavra para jogar o jogo da forca.");
		int a1 = Integer.parseInt(a);
		int vida = 7;
		int ganhar = 0;
		int erro = 0;
		
		String palavra[] = new String[a1];
		String solucao[] = new String[a1];
		String errado[] = new String[7];
			
			for(int i = 0; i < a1; i++) {
				palavra[i] = JOptionPane.showInputDialog(null, "Insira letra por letra da palavra.");
			}
			
			while (vida > 0 && ganhar == 0) {
			
			int encontrou = 0;
				
			String tentativa = JOptionPane.showInputDialog(null, "Jogador, insira uma letra, a palavra escolhida tem " + a1 + " caracteres.\n Restam " +vida+ " vidas.\n"
					+ "Palavra: " + java.util.Arrays.toString(solucao) + "\n Letras erradas: " + java.util.Arrays.toString(errado));
	
			for (int i = 0; i < palavra.length; i++) {
				if (palavra[i].equals(tentativa)) {
					solucao[i] = tentativa;
					encontrou = 1;
				}
			}		
			if (encontrou == 0) {
				vida = vida - 1;		
				errado[erro] = tentativa;
				erro = erro + 1;
				JOptionPane.showConfirmDialog(null, "ERROU, da 0 pra ele! Menos 1 vida.");
			}
			if (Arrays.equals(solucao, palavra)) {
			    ganhar = 1;
			}
		}
			
			if (vida == 0) {
			JOptionPane.showConfirmDialog(null, "PERDEU PLAYBOY, muito burro, que lixo, você foi alfabetizado?\n Sério, eu nunca vi uma pessoa tão burra quanto você, deveria ser crime ser tão idiota quanto você é, você ja pensou se compensa mesmo estar vivo?\n Tipo você so consome recursos humanos como água, ar e comida, repense suas atitudes. Idiota. ");
			}else if (ganhar == 1 && vida == 7){
			JOptionPane.showConfirmDialog(null, "Que isso o cara é uma lenda!.");
			}else if (ganhar == 1 && vida < 7) {
			JOptionPane.showConfirmDialog(null, "Boa garoto!");	
			}else if (ganhar == 1 && vida == 1) {
			JOptionPane.showConfirmDialog(null, "Quase ein, cagada ou habilidade?");
			}
		}
	}