package chat2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O Cliente conectou-se ao servidor!");

		Scanner teclado = new Scanner(System.in);
		PrintStream mensagem = new PrintStream(cliente.getOutputStream());

		while (teclado.hasNextLine()) {
			mensagem.println(teclado.nextLine());
		}

		mensagem.close();
		teclado.close();
		cliente.close();
	}
}
