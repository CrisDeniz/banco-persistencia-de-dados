package br.com.alura.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ExisteConteudo extends VerificaConteudo {

	public ExisteConteudo(VerificaConteudo proximo) {
		super(proximo);
	}

	@Override
	public void verificar(String gson, List<Conta> contas) {
		try (FileWriter writer = new FileWriter("C:\\Users\\Cristian\\eclipse-projetos-pessoais\\banco\\src\\main\\resources\\data.json")) {
			writer.write(gson);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean deveExecutar(File arquivo) {
		return arquivo.length() == 0;
	}

	

}
