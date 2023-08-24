package br.com.alura.classes;

import br.com.alura.conta.Conta;

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
		try (FileWriter writer = new FileWriter(new DataPath().getPath())) {
			writer.write(gson);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public boolean deveExecutar(File arquivo) {
		return arquivo.length() == 0;
	}

	

}
