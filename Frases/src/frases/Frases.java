package frases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frases {
	public String sorteia() {
		List<String> lista = new ArrayList<String>();
		lista.add("Sempre lutei por liberdade, mas ser livre me fez s�."); // 1
		lista.add("N�o corra atr�s de algu�m que n�o d� um passo por voc�."); // 2
		lista.add("A dor mora na lembran�a dos momentos felizes."); // 3
		lista.add("N�o desista f�cil, nem insista pra sempre."); // 4
		lista.add("Se voc� se tornar uma op��o, n�o queira ser escolhido. Seja prioridade."); // 5
		lista.add("Ningu�m reconhece o que voc� faz, at� voc� deixar de fazer."); // 6
		lista.add("Foi bom enquanto durou, e durou enquanto estava sendo bom."); // 7
		lista.add("Seja voc� mesmo, as pessoas certas ir�o aparecer."); // 8
		lista.add("A maldade n�o deve ser devolvida. Deixe a vida cobrar."); // 9
		lista.add("N�o se apague a algo que te faz mal, s� porque as vezes te faz bem."); // 10
		lista.add("N�o chame o outro de emocionado se � voc� quem n�o sabe receber afeto."); // 11
		lista.add("Tem gente que n�o quer te perder, mas n�o sabe te amar."); // 12
		lista.add("A gente n�o precisa deixar de ser bom, s� precisa deixar de ser besta"); // 13
		lista.add("Eu te quis pelo que voc� era, e te deixei ir pelo que voc� come�ou a ser."); // 14
		lista.add("Viver n�o � esperar a tempestade passar, � aprender a dan�ar na chuva."); // 15
		lista.add("Queira o bem. Fa�a o bem. O resto vem."); // 16
		lista.add("D� valor a quem te d� amor."); // 17
		lista.add("Deixe que sua f� seja maior que seus problemas."); // 18
		lista.add("Se � para ter crise, que seja de riso."); // 19
		lista.add("Faz bem ser o bem de algu�m."); // 20
		lista.add("Aprendi o que era certo, com a pessoa errada."); // 21
		lista.add("Um est�mago com fome, uma carteira vazia e um cora��o partido te ensinam as melhores li��es da vida."); // 22
		lista.add("Continue, sempre haver� um bom motivo para ser feliz de novo."); // 23
		lista.add("De virgula em virgula, uma hora chega o ponto final."); // 24
		lista.add("Existem amores que s� podem viver em seu cora��o, n�o em sua vida."); // 25
		lista.add("Quando os olhos chamarem mais aten��o do que qualquer outra parte do corpo, novos sentimentos ir�o invadir seu cora��o."); // 26
		lista.add("Uma mensagem chegou... Dizia apenas: 'Saudade'. Sorri e apaguei... Tem coisas na vida que a gente s� erra uma vez."); // 27
		lista.add("Cuide bem daquilo que voc� ama. � caro demais perder o que n�o tem pre�o."); // 28
		lista.add("Tem gente que escolhe te perder ao inv�s de buscar melhorar. Voc� n�o pode nudar algu�m, mas pode mudar de lugar e seguir.");// 29
		lista.add("Antes de falar que eu te abandonei, pergunta se tu fazia quest�o de me ter por perto.");// 30
		lista.add("P�e-te no lugar do outro, e te tornar�s incapaz de julg�-lo.");// 31
		lista.add("A medida do amor � amar sem medidas.");// 32
		lista.add("N�o importa a cor do c�u, quem faz o dia bonito � voc�.");// 33
		lista.add("N�o tenha medo de descobrir que voc� n�o � mais o mesmo");// 34
		lista.add("Fa�a algu�m feliz hoje. Pequenos gestos fazem toda a diferen�a.");// 35
		lista.add("N�o deixe as incertezas atrapalharem sua felicidade.");// 36
		

		Collections.shuffle(lista); // 14
		// pega qualquer indice.
		return lista.get((int) Math.random() * lista.size());
	}

	public static void main(String[] args) {
		Frases sorteia = new Frases();
		for (int i = 0; i < 1; i++) {
			System.out.println(sorteia.sorteia());
		}
	}

	public static void add(String line) {
		// TODO Auto-generated method stub
		
	}

	public static String get(int count) {
		// TODO Auto-generated method stub
		return null;
	}
}
